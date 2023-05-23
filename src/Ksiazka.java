/**
 * Ta klasa ma za zadanie przechowywanie w sobie ingormacji o ksiązkach które mogą być przeczytane prze uzytkownika
 * tytul: String, przechowywuje w sobie informacje o tytule książki
 * autor: Osoba, przechowywuje w sobie informacje o autorze biorąc pole za pomącą konstruktora imię, nazwisko i wiek z klasy Osoba
 * datawydania: String, przechowywuje w sobie informacje o dacie wydania wybranej książki, która moze byc przeczytana prze użytkownika
 * @author: Denys Yermiichuk
 **/

public class Ksiazka{

    private String tytul;
    private Osoba autor;
    private String datawydania;

    public Ksiazka(String tytul, Osoba autor, String datawydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", datawydania=" + datawydania +
                '}';
    }

}
