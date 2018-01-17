package blot;

import game.FinalLimitList;
import game.Kalodner;
import game.Kart;
import game.Player;

import java.util.ArrayList;

public class Blot {

    private Player player0;
    private Player player1;
    private Player player2;
    private Player player3;

    private final ArrayList<Kart> karter = Kalodner.get32nocKalod();

    public Player[] bajanel() {
        ArrayList<Kart> kart0 = new FinalLimitList<>(8);
        ArrayList<Kart> kart1 = new FinalLimitList<>(8);
        ArrayList<Kart> kart2 = new FinalLimitList<>(8);
        ArrayList<Kart> kart3 = new FinalLimitList<>(8);

        for (Kart hertakanKart : karter) {
            wh:
            while (true) {
                int x = (int) (Math.random() * 4);
                switch (x) {
                    case 0:
                        if (kart0.add(hertakanKart)) {
                            break wh;
                        }
                    case 1:
                        if (kart1.add(hertakanKart)) {
                            break wh;
                        }
                    case 2:
                        if (kart2.add(hertakanKart)) {
                            break wh;
                        }
                    case 3:
                        if (kart3.add(hertakanKart)) {
                            break wh;
                        }
                }
            }
        }
        player0 = new Player(kart0);
        player1 = new Player(kart1);
        player2 = new Player(kart2);
        player3 = new Player(kart3);
        return new Player[]{player0, player1, player2, player3};
    }

    public boolean terz(Kart kart1, Kart kart2, Kart kart3) {
        if (kart1.getMast() == kart2.getMast() && kart2.getMast() == kart3.getMast()) {
            if (karter.indexOf(kart1) < karter.indexOf(kart2) && karter.indexOf(kart2) < karter.indexOf(kart3)) {
                return true;
            }
        }
        return false;
    }
}
