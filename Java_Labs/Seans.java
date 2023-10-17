import java.io.Serializable;
import java.util.HashMap;
public class Seans implements Serializable {
    private static final long serialVersionUID = -7887612267521882048L;
    private String tytul;
    private String dzien;
    private String godzina;
    private String ograniczeniaWiekowe;
    private HashMap<Character, HashMap<Integer, Boolean>> miejsca;

    public Seans(String tytul, String dzien, String godzina, String ograniczeniaWiekowe, HashMap<Character, HashMap<Integer, Boolean>> miejsca) {
        this.tytul = tytul;
        this.dzien = dzien;
        this.godzina = godzina;
        this.ograniczeniaWiekowe = ograniczeniaWiekowe;
        this.miejsca = miejsca;
    }

    public HashMap<Character, HashMap<Integer, Boolean>> getMiejsca() {
        return miejsca;
    }
    public String getTytul() {
        return tytul;
    }
    public String getDzien(){
        return dzien;
    }
    public String getGodzina(){
        return godzina;
    }
    public String getOgraniczeniaWiekowe(){
        return ograniczeniaWiekowe;
    }

    public String toString() {
        return "Seans [ tytul: " + tytul + ", dzien: " + dzien + ", godzina: "
                + godzina + ", ograniczenia wiekowe: " + ograniczeniaWiekowe
                + ",\nliczba miejsc: " + miejsca + " ]";
    }
}