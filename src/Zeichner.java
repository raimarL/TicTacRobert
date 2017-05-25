import java.util.Map;

/**
 * Created by rai on 19.05.17.
 */
public class Zeichner {

    public void zeichne(Map<Ort, Markierung> brett) {
        for(Markierung markierung : brett.values()) {
            zeichneMarkierung(markierung);
        }
    }

    public void zeigeEndbericht(Markierung markierung) {
        System.out.println(markierung.toString() + " hat gewonnen");

    }

    private void zeichneMarkierung(Markierung markierung) {

        // TODO pretty paint...

        if (markierung == Markierung.BLANK) {
            System.out.println("-");
        }
        if (markierung == Markierung.X) {
            System.out.println("X");
        }
        if (markierung == Markierung.O) {
            System.out.println("O");
        }
    }
}
