package Knjizara;

public class KnjizaraMain {
    public static void main(String[] args) {
    Knjiga knjiga1= new Knjiga("Psychology of Money", "Morgan Housel", 20);
    Knjiga knjiga2= new Knjiga("The book of five rings", "Miyamoto Musashi", 15);

        System.out.println(knjiga1.ispisInformacija());
        System.out.println(knjiga2.ispisInformacija());

    }
}


//Zadatak je: kreirati novi paket "Knjizara". U njoj kreirati novu klasu Knjiga, koja se sastoji od naziva, autora i cijene.
//kreirati konstruktor, i metodu koja ispisuje informacije o knjizi. Unijeti 2 knjige i i ispisati njihove vrijednosti.