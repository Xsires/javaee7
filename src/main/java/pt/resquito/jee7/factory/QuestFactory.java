package pt.resquito.jee7.factory;

import javax.enterprise.inject.Produces;

/**
 * Created by resquito on 17-02-2014.
 */
public class QuestFactory {


    private String type;

    @Produces
    public Quest getEuropaQuest() {
        if("Africa".equals(type))
            return new AfricaQuest();

        return new EuropeQuest();
    }

}
