/*
FileWriter f = new FileWriter(filename);
BufferedWriter out = new BufferedWriter(f);
out.write(daneDoZapisu);
out.close();
*/

/*
FileInputStream f = new FileInputStream(filename);
DataInputStream in = new DataInputStream(f);
BufferedReader r = new BufferedReader(new InputStreamReader(in));
while ((strLine = r.readLine()) != null)
    dane += strLine;
in.close();
 */
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileOperations {
    public void zapiszSeans(Seans seans) throws IOException, ClassNotFoundException {
        // tworzymy obiekt klasy ObjectOutputStream do zapisywania do pliku
        ObjectOutputStream wy = new ObjectOutputStream(new FileOutputStream(".\\seans.dat"));

        // no i zapisujemy
        wy.writeObject(seans);
        wy.close();
    }

    public void odczytSeans(Seans seans) throws IOException, ClassNotFoundException {
        //----------- a teraz odczyt -------------------------------------------

        // tworzymy obiekt klasy ObjectInputStream do odczytywania z pliku
        ObjectInputStream we = new ObjectInputStream(new FileInputStream(".\\seans.dat"));

        // odczytujemy z pliku; (Pracownik) - to rzutowanie z Object na Pracownik
        Seans p1 = (Seans) we.readObject();

        // i ładnie na konsolę wyrzucamy wynik
        wypiszSeans(p1.getMiejsca());
        we.close();
    }
    public void wypiszSeans(HashMap<Character, HashMap<Integer, Boolean>> miejsca){
        //wyswietlanie cyfr na gorze
        System.out.println("     1  2  3  4");
        for(Map.Entry<Character, HashMap<Integer, Boolean>> entry : miejsca.entrySet()) {
            Character key = entry.getKey();
            HashMap<Integer, Boolean> value = entry.getValue();

            System.out.print(key);
            System.out.print(" | ");
            for(Map.Entry<Integer, Boolean> innerEntry : value.entrySet()) {
                Integer innerKey = innerEntry.getKey();
                Boolean innerValue = innerEntry.getValue();
                if (innerValue){
                    System.out.print(" [ ]");
                }
                else {
                    System.out.print("[X]");
                }

            }
            System.out.println();
        }
    }
    public void zapiszKlienta(Klient klient) throws IOException, ClassNotFoundException {
        // tworzymy obiekt klasy ObjectOutputStream do zapisywania do pliku

            ObjectOutputStream wy = new ObjectOutputStream(new FileOutputStream(".\\klient.dat"));

            // no i zapisujemy
            wy.writeObject(klient);
            wy.close();
    }

    public void odczytKlienta(Klient klient) throws IOException, ClassNotFoundException {
        //----------- a teraz odczyt -------------------------------------------

        // tworzymy obiekt klasy ObjectInputStream do odczytywania z pliku
        ObjectInputStream we = new ObjectInputStream(new FileInputStream(".\\klient.dat"));

        // odczytujemy z pliku; (Pracownik) - to rzutowanie z Object na Pracownik
        Klient p1 = (Klient) we.readObject();

        // i ładnie na konsolę wyrzucamy wynik
        System.out.println(p1);
        we.close();
    }
}
