package pt.resquito.jee7.cdi.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import java.util.logging.Logger;

/**
 * Created by resquito on 18-02-2014.
 */
@Stateless
public class InitializationBean {

    private static final Logger log = Logger.getLogger(InitializationBean.class.getName());

    @PostConstruct
    public void initialize() {
        System.out.println("initializing...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroying...");
    }

}
