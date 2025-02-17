package Proizvodi;

import java.util.ArrayList;
import java.util.Scanner;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod proizvod;
        String rijec;
        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            proizvod = new Proizvod();
            System.out.print("Unesti naziv: ");
            rijec=scanner.nextLine();
            proizvod.setNazivProizvoda(rijec);
            System.out.print("Unesti cijena: ");
            rijec=scanner.nextLine();
            rijec = rijec.replace(",",".");
            proizvod.setCijenaProizvoda(Double.parseDouble(rijec));
            System.out.print("Unesti kolicina: ");
            rijec=scanner.nextLine();
            proizvod.setKolicinaProizvoda(Integer.parseInt(rijec));
            proizvodi.add(proizvod);
            System.out.print("Prekini unos y/n:");
            rijec = "n";
            rijec=scanner.nextLine();
        }while (rijec.equalsIgnoreCase("n"));

        for (Proizvod prod : proizvodi){
            System.out.println(prod.ispisProizvoda());
        }
    }
}

//Kreiraj klasu Proizvod koja se sastoji od 3 vrijednosti: naziv, cijena, količina.
//Kreiraj konstruktor i metodu za prikaz informacija o proizvodu "Naziv + cijena + količina"
//Program treba unositi proizvode u ArrayList ili List dok mu ne upišemo riječ za prekid unosa.
//Nakon prekida unosa, ispiši sve proizvode.