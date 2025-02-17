package PrimjerAuto;

import java.util.ArrayList;

public class TestVoznja {
    public static void main(String[] args) {
        Auto automobil = new Auto("Honda", 250, 5);
        Auto automobil1 = new Auto("Suzuki", 180, 3);

        ArrayList<Auto> autos = new ArrayList<Auto>();
        autos.add(automobil);
        autos.add(automobil1);
        System.out.println("Ispis iz AttayList: ");
        for (Auto auto : autos) {
            System.out.println(auto.dohvatiAutomobili());
        }

//        String[] imena = {"mara", "pero"};
//        String[] prezimena = {"Maric", "peric"};
//        for (int i = 0; i < imena.length; i++) {
//            //neki kod
//            //kad kreiram objekt kroz petlju, onda koristim:
//            Auto automobil = new Auto(marka, brzina, brojVrata);
//            autos.add(automobil);
//        }

        //kreirati petlju koja ce uzimati imena i prezimena i skombinirati ih u random imena i prezimena DZ


//        System.out.println(automobil.dohvatiAutomobili());
//        System.out.println(automobil1.dohvatiAutomobili());
//
//        automobil1.paljenjeAuta();
//        automobil.paljenjeAuta();
//        automobil.gasenjeAuta();
//        automobil1.gasenjeAuta();
//        automobil1.setTopBrzina(150);
//        System.out.println("Nova brzina je: " + automobil1.getTopBrzina());
    }
}
