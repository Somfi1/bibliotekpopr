import java.util.ArrayList;

/**
 * Daje jako odpowiedz imie i nazwisko uzytkownika, a także wiek. Zwraca także przeczytane przez niego książki
 * ksiaki: ArrayList, przechowywuje w sobie liste ksiazek które poźniej są później wykorzystywane dla metody void wyświetlającej przeczytane prze uzytkownika książki
 * @author: Denys Yermiichuk
 **/

public class Czytelnik extends Osoba{

    private ArrayList<Ksiazka> ksiazki = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    public void wypiszprzezcytane(){
        System.out.println(ksiazki);
    }

    public String toString() {
        return "Osoba{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", wiek=" + getWiek() +
                ", Przeczytane książki: "+ ksiazki +
                '}';
    }
}


