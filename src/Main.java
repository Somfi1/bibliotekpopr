import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Tytul1", new Osoba("Autor 1", "Nazwisko1", 30), "2023-05-23");
        Ksiazka ksiazka2 = new Ksiazka("Tytul2", new Osoba("Autor 2", "Nazwisko2", 31), "2023-05-24");
        Ksiazka ksiazka3 = new Ksiazka("Tytul3", new Osoba("Autor 3", "Nazwisko3", 32), "2023-05-25");

        List<Osoba> osoby = new ArrayList<>();
        Czytelnik czytelnik1 = new Czytelnik("Czytelnik1", "NazwiskoCzytelnika1", 45);
        czytelnik1.wypiszprzezcytane();
        osoby.add(czytelnik1);

        Recenzant recenzant1 = new Recenzant("Recenzant1", "NazwiskoRecenzanta1", 34);
        osoby.add(recenzant1);

        osoby.sort(Comparator.comparing(Osoba::getNazwisko));

        for(Osoba osoba : osoby)
            System.out.println(osoba);


    }
}