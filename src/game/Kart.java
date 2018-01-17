package game;

public class Kart {

    private Mast mast;
    private Id id;


    public Kart(Mast mast, Id id) {
        this.mast = mast;
        this.id = id;
    }

    public Mast getMast() {
        return mast;
    }

    public Id getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.getMast().getMastPatker() + this.getId().getIdPatker();
    }



    public enum Id {
        ERKU("2"), EREQ("3"), CHORS("4"), HING("5"), VEC("6"), YOT("7"), UT("8"), INN("9"), TAS("10"), VALET("J"), DAMA("Q"), KAROL("K"), TUZ("T");

        private String idPatker;

        public String getIdPatker() {
            return idPatker;
        }

        Id(String idPatker) {
            this.idPatker = idPatker;
        }
    }

    public enum Mast {
        QYAP((char) 9826), SIRT((char) 9827), XAR((char) 9828), XACH((char) 9829);

        private char mastPatker;

        public char getMastPatker() {
            return mastPatker;
        }

        Mast(char mastPatker) {
            this.mastPatker = mastPatker;
        }
    }
}
