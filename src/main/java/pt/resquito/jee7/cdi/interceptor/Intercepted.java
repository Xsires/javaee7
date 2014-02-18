package pt.resquito.jee7.cdi.interceptor;

import javax.ejb.Stateless;

/**
 * Created by resquito on 18-02-2014.
 */
@Stateless
public class Intercepted {

    @Log
    public void intercepted() {
        //do nothing..
    }
}
