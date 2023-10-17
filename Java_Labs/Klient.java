import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Klient implements Serializable
{
    private static final long serialVersionUID = -7887612267521882048L;
    private String nazwisko;
    private String imie;
    private String mail;
    private String telefon;
    private String seans;
    private List<String> miejsca;

    public Klient(String nazwisko, String imie, String mail, String telefon, String seans)

    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.mail = mail;
        this.telefon = telefon;
        this.seans = seans;
        this.miejsca = new ArrayList<>();
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getSeans() {
        return seans;
    }

    public List<String> getMiejsca() {
        return miejsca;
    }

    public void zarezerwujMiejsce(String miejsce) {
        miejsca.add(miejsce);
    }

    public void odwolajRezerwacjeMiejsca(String miejsce) {
        miejsca.remove(miejsce);
    }

    public String toString() {
        return "Klient [ imie: " + imie + ", nazwisko: " + nazwisko
                + ", mail: " + mail + ", telefon: " + telefon
                + ", seans: " + seans + ", miejsca: " + miejsca.toString() + " ]";
    }
}