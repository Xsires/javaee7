package pt.resquito.jee7.cdi.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * Created by resquito on 18-02-2014.
 */
@Interceptor
@Log
public class LogInterceptor {

    private static final Logger log = Logger.getLogger("Interceptor Logger");

    @AroundInvoke
    public Object handleLogging(InvocationContext context) throws Exception {

        System.out.println("Passing through interceptor...");

        Object obj = context.proceed();

        return obj;
    }
}
