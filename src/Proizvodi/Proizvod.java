package Proizvodi;

public class Proizvod {
    private String nazivProizvoda;
    private double cijenaProizvoda;
    private int kolicinaProizvoda;

    public Proizvod(){}

    public Proizvod(String nazivProizvoda, double cijenaProizvoda, int kolicinaProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
        this.cijenaProizvoda = cijenaProizvoda;
        this.kolicinaProizvoda = kolicinaProizvoda;
    }

    public String ispisProizvoda(){
        return "Naziv proizvoda je: "+nazivProizvoda+ ", "+ "cijena proizvoda je: "+ cijenaProizvoda+"€, broj dostupnih komada je: "+kolicinaProizvoda;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public double getCijenaProizvoda() {
        return cijenaProizvoda;
    }

    public void setCijenaProizvoda(double cijenaProizvoda) {
        this.cijenaProizvoda = cijenaProizvoda;
    }

    public int getKolicinaProizvoda() {
        return kolicinaProizvoda;
    }

    public void setKolicinaProizvoda(int kolicinaProizvoda) {
        this.kolicinaProizvoda = kolicinaProizvoda;
    }
}


//Kreiraj klasu Proizvod koja se sastoji od 3 vrijednosti: naziv, cijena, količina.
//Kreiraj konstruktor i metodu za prikaz informacija o proizvodu "Naziv + cijena + količina"
//Program treba unositi proizvode u ArrayList ili List dok mu ne upišemo riječ za prekid unosa.
//Nakon prekida unosa, ispiši sve proizvode.