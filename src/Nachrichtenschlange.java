import java.util.ArrayList;

public class Nachrichtenschlange {
    private ArrayList<Nachricht> liste;

    public void neueNachricht(Nachricht n) {
        liste.add(n);
    }

    public void drucke() {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(i+1);
            System.out.print(". ");
            liste.get(i).drucke();
        }
    }
}
