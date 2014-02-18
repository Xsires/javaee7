package pt.resquito.jee7.factory;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Created by resquito on 17-02-2014.
 */
@RunWith(Arquillian.class)
public class QuestFactoryTest {
    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
                .addClasses(QuestType.class, Quest.class, QuestFactory.class, EuropeQuest.class, AfricaQuest.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(jar.toString(true));
        return jar;
    }

    @Inject
    @QuestType("Europa")
    private Quest europaQuest;

    @Inject
    @QuestType("Africa")
    private Quest africaQuest;


    @Test
    public void testEuropaQuest() {
        assertEquals("Start Europe Quest!", europaQuest.startQuest());
    }

    @Test
    public void testAfricaQuest() {
        assertEquals( "Start African Quest!",africaQuest.startQuest());
    }
}
