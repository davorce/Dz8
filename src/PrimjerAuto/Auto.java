package PrimjerAuto;

public class Auto {
    private String marka;
    private int topBrzina;
    private int brojVrata;

    //konstruktor
    public Auto(String marka, int topBrzina, int brojVrata) {
        this.marka = marka;
        this.topBrzina = topBrzina;
        this.brojVrata = brojVrata;
    }

    //metoda za dohvacanje/ispis
    public String dohvatiAutomobili() {
        return "Marka automobila je: " + marka + ", " + "top brzina: " + topBrzina + ", " + "broj vrata je: " + brojVrata;
    }

    public void paljenjeAuta() {
        System.out.println("Auto je upaljen!");
    }

    public void gasenjeAuta() {
        System.out.println("Auto je ugasen!");
    }

    // Setteri - metode za postavljanje neke druge vrijednosti koja nam treba(Naknadno mijenjamo vrijednost top brzine)
    public void setTopBrzina(int topBrzina) {
        this.topBrzina = topBrzina;
    }

    //Getter - dohvacanje vrijednosti

    public int getBrojVrata() {
        return brojVrata;
    }

    public int getTopBrzina() {
        return topBrzina;
    }
}
