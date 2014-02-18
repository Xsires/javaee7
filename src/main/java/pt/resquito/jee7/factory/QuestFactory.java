package pt.resquito.jee7.factory;

import javax.enterprise.inject.Produces;

/**
 * Created by resquito on 17-02-2014.
 */
public class QuestFactory {


    private String type;

    @Produces
    @QuestType("Europa")
    public Quest getEuropaQuest() {
        return new EuropeQuest();
    }

    @Produces
    @QuestType("Africa")
    public Quest getAfricaQuest() {
        return new AfricaQuest();
    }

}
