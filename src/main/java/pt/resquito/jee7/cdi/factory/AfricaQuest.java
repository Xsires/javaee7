package pt.resquito.jee7.cdi.factory;

import javax.ejb.Stateless;

/**
 * Created by resquito on 17-02-2014.
 */
@Stateless
public class AfricaQuest implements Quest {

    @Override
    public String startQuest() {
        return "Start African Quest!";
    }
}
