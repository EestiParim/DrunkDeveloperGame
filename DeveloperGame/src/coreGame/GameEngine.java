package coreGame;

import java.util.LinkedList;

/**
 * Created by Master Seep on 01.11.2016.
 */
public class GameEngine {

    public static void firstStart(){
        LocationHome home = new LocationHome();
        LocationWork work = new LocationWork();
        LinkedList locationList = new LinkedList();
        locationList.add(home);
        locationList.add(work);
        Player player = new Player();
    }
}
