public class Geraet {
    private String id;
    protected Nachrichtenschlange schlange;
    protected boolean defekt = false;   // laut Aufgabenstellung okay

    public Geraet(String id, Nachrichtenschlange schlange, boolean defekt) {
        this.id = id;
        this.schlange = schlange;
        this.defekt = defekt;
    }

    // laut Aufgabenstellung nur diesen Konstruktor
    public Geraet(String id, Nachrichtenschlange schlange) {
        this(id, schlange, false);
        //this.id = id;
        //this.schlange = schlange;
    }

    public String holeId() {
        return id;
    }
}
