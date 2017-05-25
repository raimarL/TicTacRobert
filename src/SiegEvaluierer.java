import java.util.Map;

/**
 * Created by rai on 19.05.17.
 */
public class SiegEvaluierer {

    public boolean hatGewonnen(Map<Ort, Markierung> brett) {

        return eval(brett, Markierung.X) || eval(brett, Markierung.O);
    }

    private boolean eval(Map<Ort, Markierung> brett, Markierung markierung) {

        // 123
        if(brett.get(Ort.TOP_LEFT) == markierung && brett.get(Ort.TOP_CENTER) == markierung && brett.get(Ort.TOP_RIGHT) == markierung) {
            return true;
        }

        // 147
        if(brett.get(Ort.TOP_LEFT) == markierung && brett.get(Ort.CENTER) == markierung && brett.get(Ort.BOTTOM_RIGHT) == markierung) {
            return true;
        }

        // 258
        if(brett.get(Ort.TOP_CENTER) == markierung && brett.get(Ort.CENTER) == markierung && brett.get(Ort.BOTTOM_CENTER) == markierung) {
            return true;
        }

        // 369
        if(brett.get(Ort.TOP_RIGHT) == markierung && brett.get(Ort.TOP_RIGHT) == markierung && brett.get(Ort.BOTTOM_RIGHT) == markierung) {
            return true;
        }

        // 357
        if(brett.get(Ort.TOP_RIGHT) == markierung && brett.get(Ort.CENTER) == markierung && brett.get(Ort.BOTTOM_LEFT) == markierung) {
            return true;
        }

        // 456
        if(brett.get(Ort.CENTER_LEFT) == markierung && brett.get(Ort.CENTER) == markierung && brett.get(Ort.CENTER_RIGHT) == markierung) {
            return true;
        }

        // 789
        if(brett.get(Ort.BOTTOM_LEFT) == markierung && brett.get(Ort.BOTTOM_CENTER) == markierung && brett.get(Ort.BOTTOM_RIGHT) == markierung) {
            return true;
        }

        return false;
    }
}
