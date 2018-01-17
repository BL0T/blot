package game;

import java.util.ArrayList;

public class Kalodner {

    private static final Kart.Id ids[] = {
            Kart.Id.YOT,
            Kart.Id.UT,
            Kart.Id.INN,
            Kart.Id.TAS,
            Kart.Id.VALET,
            Kart.Id.DAMA,
            Kart.Id.KAROL,
            Kart.Id.TUZ,
    };

    private static final Kart.Mast masts[] = {
            Kart.Mast.QYAP,
            Kart.Mast.XACH,
            Kart.Mast.XAR,
            Kart.Mast.SIRT,
    };


    public static ArrayList<Kart> get52nocKalod() {
        ArrayList<Kart> kalod = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                kalod.add(new Kart(masts[i], ids[j]));
            }
        }
        return kalod;
    }

    public static ArrayList<Kart> get32nocKalod() {
        ArrayList<Kart> kalod = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                kalod.add(new Kart(masts[i], ids[j]));
            }
        }
        return kalod;
    }
}
