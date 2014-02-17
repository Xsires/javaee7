package pt.resquito.jee7.factory;

import javax.enterprise.inject.Produces;

/**
 * Created by resquito on 17-02-2014.
 */
public class QuestFactory {

    @Produces
    @EuropaQuest
    public Quest getEuropaQuest() {
        return new EuropeQuest();
    }

    @Produces
    @AfricanaQuest
    public Quest getAfricaQuest() {
        return new EuropeQuest();
    }
}
