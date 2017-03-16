import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.xml.security.utils.Base64;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BasicAuthOutInterceptor extends AbstractPhaseInterceptor<Message> {

    public BasicAuthOutInterceptor() {
        super(Phase.PRE_STREAM);
    }

    public void handleMessage(Message message) throws Fault {
        String token = Base64.encode("them:them".getBytes());

        @SuppressWarnings("unchecked")
        Map<String, List<String>> headers = (Map<String, List<String>>) message
                .get(Message.PROTOCOL_HEADERS);
        if (headers == null) {
            headers = new TreeMap<String, List<String>>(
                    String.CASE_INSENSITIVE_ORDER);
            message.put(Message.PROTOCOL_HEADERS, headers);
        }

        headers.put("Authorization", Arrays.asList("Basic "+ token));
    }

}