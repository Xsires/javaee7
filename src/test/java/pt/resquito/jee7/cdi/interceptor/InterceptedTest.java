package pt.resquito.jee7.cdi.interceptor;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/**
 * Created by resquito on 18-02-2014.
 */
@RunWith(Arquillian.class)
public class InterceptedTest {

    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
                .addClasses(Log.class, LogInterceptor.class, Intercepted.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(jar.toString(true));
        return jar;
    }

    @Inject
    private Intercepted intercepted;


    @Test
    public void doTest() {
        intercepted.intercepted();
    }
}
