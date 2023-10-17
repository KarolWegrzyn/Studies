import java.awt.print.Book;
import java.io.IOException;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Klient nowyKlient = new Klient(
                "Nowak",
                "Kacper",
                "mail",
                "123456789",
                "seans1"
        );*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz nazwisko: ");
        String nazwisko = scan.nextLine();
        System.out.print("\nWpisz imie: ");
        String imie = scan.nextLine();
        System.out.print("\nWpisz mail: ");
        String mail = scan.nextLine();
        System.out.print("\nWpisz telefon: ");
        String telefon = scan.nextLine();
        System.out.print("\nWpisz seans: ");
        String seans = scan.nextLine();

        Klient nowyKlient = new Klient(nazwisko, imie, mail, telefon, seans);

        nowyKlient.zarezerwujMiejsce("A1");

        HashMap<Integer, Boolean> kolumna = new HashMap<Integer, Boolean>();
        HashMap<Character, HashMap<Integer, Boolean>> miejsca = new HashMap<Character, HashMap<Integer, Boolean>>();

        for (int i=0; i<4; i++){
            kolumna.put(i, true);
        }

        miejsca.put('A', kolumna);
        miejsca.put('B', kolumna);
        miejsca.put('C', kolumna);

        /*Seans nowySeans = new Seans(
                "Tytul",
                "Dzien",
                "Godzina",
                "18",
                miejsca
        );*/

        System.out.print("Wpisz tytul: ");
        String tytul = scan.nextLine();
        System.out.print("\nWpisz dzien: ");
        String dzien = scan.nextLine();
        System.out.print("\nWpisz godzine: ");
        String godzina = scan.nextLine();
        System.out.print("\nPodaj ograniczenie wiekowe: ");
        String ograniczeniaWiekowe = scan.nextLine();

        Seans nowySeans = new Seans(tytul, dzien, godzina, ograniczeniaWiekowe,miejsca);

        FileOperations operacjePliku = new FileOperations();
        operacjePliku.zapiszKlienta(nowyKlient);
        operacjePliku.odczytKlienta(nowyKlient);
        operacjePliku.zapiszSeans(nowySeans);
        operacjePliku.odczytSeans(nowySeans);
    }
}