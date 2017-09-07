package uk.ac.diamond.ispyb.scanning;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;

import org.eclipse.scanning.api.database.CompositeBean;
import org.eclipse.scanning.api.database.DatabaseOperation;
import org.eclipse.scanning.api.database.Id;
import org.eclipse.scanning.api.database.Operation;

/**
 * 
 * This operation is a composite of several operations and is used
 * to queue up several atomic changes as a single action to the database.
 * 
 * This approach is considered 
 * 
 * @author Matthew Gerring
 *
 */
class CompositeOperation implements DatabaseOperation<CompositeBean> {

	private final XPDFDatabaseService service;
	private List<Operation> allowed;

	CompositeOperation(XPDFDatabaseService service, Operation... allowed) {
		this.service = service;
		this.allowed = allowed!=null && allowed.length>0 ? Arrays.asList(allowed) : Operation.ends();
	}

	@Override
	public Id operate(CompositeBean bean) throws Exception {
		
		final Id id = new Id();
		for (Operation type : Operation.ends()) {
			if (!allowed.contains(type)) continue;
			Collection<?> beans = bean.get(type);		
			beans.forEach((item)->process(type, item, id));
		}
		if (id.size()<1) throw new IllegalArgumentException("No operation was completed! The allowed operations are: "+allowed);
		return id;
	}

	private <T> void process(Operation type, T bean, Id id) {
		
		try {
			bean = service.fromBean(bean);
			DatabaseOperation<T> operation = service.getOperation(type, bean);
			Future<Id> child = service.execute(operation, type, bean, true);
			id.put(bean.getClass().getSimpleName(), child.get());
			
		} catch (Exception e) {
			id.put(bean.getClass().getSimpleName(), -1L);
			id.putError(bean.getClass().getSimpleName(), e.getMessage());
		}
	}

}
