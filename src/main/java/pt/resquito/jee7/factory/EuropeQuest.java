package pt.resquito.jee7.factory;

import javax.ejb.Stateless;

/**
 * Created by resquito on 17-02-2014.
 */
@Stateless
public class EuropeQuest implements Quest {

    @Override
    public void startQuest() {
        System.out.println("Start Europe Quest!");
    }
}