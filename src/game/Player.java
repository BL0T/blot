package game;

import java.util.ArrayList;

public class Player {

    public Player() {
    }

    public Player(ArrayList<Kart> karter) {
        this.karter = karter;
    }

    private ArrayList<Kart> karter = new ArrayList<>();

    public ArrayList<Kart> getKarter() {
        return karter;
    }

    public void kartTal(Kart kart) {
        karter.add(kart);
    }

    public void kartTal(ArrayList<Kart> karts) {
        karter.addAll(karts);
    }
}
