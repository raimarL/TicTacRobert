import java.util.HashMap;
import java.util.Map;

/**
 * Created by rai on 19.05.17.
 */
public class Spiel {

    Map<Ort, Markierung> brett = new HashMap<>();

    SiegEvaluierer siegEvaluierer = new SiegEvaluierer();

    Zeichner zeichner = new Zeichner();

    private boolean amLaufen;

    public void setzeStein(Ort ort, Markierung markierung) throws Exception {

        pruefeZug(ort, markierung);

        brett.put(ort, markierung);

        zeichner.zeichne(this.brett);

        if(siegEvaluierer.hatGewonnen(this.brett)) {
            zeichner.zeigeEndbericht(markierung);
            amLaufen = true;
        }
    }

    public void setzeSpielAuf() {
        brett.put(Ort.TOP_LEFT, Markierung.BLANK);
        brett.put(Ort.TOP_CENTER, Markierung.BLANK);
        brett.put(Ort.TOP_RIGHT, Markierung.BLANK);
        brett.put(Ort.CENTER_LEFT, Markierung.BLANK);
        brett.put(Ort.CENTER, Markierung.BLANK);
        brett.put(Ort.CENTER_RIGHT, Markierung.BLANK);
        brett.put(Ort.BOTTOM_LEFT, Markierung.BLANK);
        brett.put(Ort.BOTTOM_CENTER, Markierung.BLANK);
        brett.put(Ort.BOTTOM_RIGHT, Markierung.BLANK);

        this.amLaufen = true;
    }

    private void pruefeZug(Ort ort, Markierung markierung) throws Exception {
        if(!this.amLaufen) {
            throw new IdiotException();
        }
        if(markierung == Markierung.BLANK) {
            throw new IdiotException();
        }
        if(brett.get(ort) == Markierung.O || brett.get(ort) == Markierung.X) {
            throw  new IdiotException();
        }
    }
}
