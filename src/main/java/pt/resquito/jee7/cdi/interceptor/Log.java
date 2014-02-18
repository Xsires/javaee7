package pt.resquito.jee7.cdi.interceptor;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;

/**
 * Created by resquito on 18-02-2014.
 */
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@InterceptorBinding
public @interface Log {
}
