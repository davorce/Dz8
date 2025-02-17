package Prosjek;

public class Ucenik {
    private String imeUcenika;
    private int godineUcenika;
    private int ocjena1, ocjena2, ocjena3;

    public Ucenik(String imeUcenika, int godineUcenika, int ocjena1, int ocjena2, int ocjena3) {
        this.imeUcenika = imeUcenika;
        this.godineUcenika = godineUcenika;
        this.ocjena1 = ocjena1;
        this.ocjena2 = ocjena2;
        this.ocjena3 = ocjena3;
    }

    public double prosjekOcjena() {
        return (ocjena1 + ocjena2 + ocjena3) / 3.0;
    }

    public String ispisInformacija() {
        return "Ime ucenika: " + imeUcenika + ", " + "ucenik ima " + godineUcenika + " godina, " + "prosjek ocjena mu je: " + prosjekOcjena();
    }
}
//Kreiraj klasu "Ucenik" koja predstavlja učenika s imenom, brojem godina učenika i 3 ocjene.
//        Kreiraj konstruktor, kreiraj metodu koja računa prosjek unesene tri ocjene.
//Kreiraj metodu za ispis podataka o učeniku, koja ispisuje Ime, Dob i Prosjek ocjena.
//
//Kreiraj 2 objekta Učenika s podacima po želji i prikaži informacije (Ime, Dob i Prosjek ocjena) za svakog Učenika.