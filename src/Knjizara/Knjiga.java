package Knjizara;

public class Knjiga {
    private String nazivKnjige;
    private String autorKnjige;
    private int cijenaKnjige;

    public Knjiga(String nazivKnjige, String autorKnjige, int cijenaKnjige) {
        this.nazivKnjige = nazivKnjige;
        this.autorKnjige = autorKnjige;
        this.cijenaKnjige = cijenaKnjige;
    }

    public String ispisInformacija() {
        return "Naziv knjige je: " + nazivKnjige + ", " + "autor knjige je: " + autorKnjige + ", " + "cijena knjige je: " + cijenaKnjige;
    }
}

//Zadatak je: kreirati novi paket "Knjizara". U njoj kreirati novu klasu Knjiga, koja se sastoji od naziva, autora i cijene.
//kreirati konstruktor, i metodu koja ispisuje informacije o knjizi. Unijeti 2 knjige i i ispisati njihove vrijednosti.