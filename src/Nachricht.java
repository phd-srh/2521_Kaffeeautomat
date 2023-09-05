public class Nachricht {
    private String id;
    private String text;

    public Nachricht(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public void drucke() {
        System.out.println(id + " : " + text);
    }
}
