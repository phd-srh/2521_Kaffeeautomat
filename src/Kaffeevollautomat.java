public class Kaffeevollautomat extends Geraet {
    private int milch;
    private int kaffee;
    private int tassen;

    public Kaffeevollautomat(String id, Nachrichtenschlange schlange,
                             int milch, int kaffee, int tassen) {
        super(id, schlange);
        this.milch = milch;
        this.kaffee = kaffee;
        this.tassen = tassen;
    }

    public Kaffeevollautomat(String id, Nachrichtenschlange schlange) {
        this(id, schlange, 0, 0, 0);
    }

    public void fuelle(int kaffee, int milch) {
        // TODO
    }

    public void erzeugeTasseKaffee(boolean mitMilch) {
        // TODO
    }
}
