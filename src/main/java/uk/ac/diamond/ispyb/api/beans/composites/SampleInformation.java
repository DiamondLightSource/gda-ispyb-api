package uk.ac.diamond.ispyb.api.beans.composites;

import java.util.List;

import uk.ac.diamond.ispyb.api.Component;
import uk.ac.diamond.ispyb.api.ComponentLattice;
import uk.ac.diamond.ispyb.api.DataCollectionPlan;

/**
 * 
 * This composite assumes a 1:1 mapping between Component and Lattice as per
 * http://confluence.diamond.ac.uk/pages/viewpage.action?spaceKey=I151&title=GDA-Database+Communications+Specification
 * 
 * @author Matthew Gerring
 *
 */
public class SampleInformation {
	
	private long sampleId;

	public SampleInformation() {
		
	}
	public SampleInformation(long sampleId) {
		this.sampleId = sampleId;
	}

	/**
	 * List of DataCollectionPlans for sample
	 */
	private List<DataCollectionPlan> plans;
	
	/**
	 * List of components for sample
	 */
	private List<Component>          components;
	
	/**
	 * Insertion Ordered Map of sampleid -> DataCollectionPlan
	 */
	private List<ComponentLattice>   lattices;

	public long getSampleId() {
		return sampleId;
	}

	public void setSampleId(long sampleId) {
		this.sampleId = sampleId;
	}

	public List<DataCollectionPlan> getPlans() {
		return plans;
	}

	public void setPlans(List<DataCollectionPlan> plans) {
		this.plans = plans;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public List<ComponentLattice> getLattices() {
		return lattices;
	}

	public void setLattices(List<ComponentLattice> lattices) {
		this.lattices = lattices;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((components == null) ? 0 : components.hashCode());
		result = prime * result + ((lattices == null) ? 0 : lattices.hashCode());
		result = prime * result + ((plans == null) ? 0 : plans.hashCode());
		result = prime * result + (int) (sampleId ^ (sampleId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleInformation other = (SampleInformation) obj;
		if (components == null) {
			if (other.components != null)
				return false;
		} else if (!components.equals(other.components))
			return false;
		if (lattices == null) {
			if (other.lattices != null)
				return false;
		} else if (!lattices.equals(other.lattices))
			return false;
		if (plans == null) {
			if (other.plans != null)
				return false;
		} else if (!plans.equals(other.plans))
			return false;
		if (sampleId != other.sampleId)
			return false;
		return true;
	}

}
