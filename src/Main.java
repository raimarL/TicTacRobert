/**
 * Created by rai on 19.05.17.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Spiel spiel = new Spiel();
        spiel.setzeSpielAuf();
        spiel.setzeStein(Ort.TOP_LEFT, Markierung.X);
        spiel.setzeStein(Ort.TOP_CENTER, Markierung.X);
        spiel.setzeStein(Ort.TOP_RIGHT, Markierung.X);
    }
}
