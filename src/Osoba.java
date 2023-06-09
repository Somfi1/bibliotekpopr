import java.util.Objects;

/**
 * Przehowywuje całą informacje o uzytkowniku
 * imie: String, przechowywuje w sobie imie uzytkownika
 * nazwisko: String, przechowywuje w sobie nazwisko uzytkownika
 * wiek: int, przechowywuje w sobie wiek uzytkownika
 * @author: Denys Yermiichuk
 **/

public class Osoba {

    private String imie, nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek && Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek);
    }
}
