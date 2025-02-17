package Prosjek;

public class UcenikMain {
    public static void main(String[] args) {
        Ucenik ucenik1=new Ucenik("Davor Cepin", 15, 2, 4, 5);
        Ucenik ucenik2=new Ucenik("Denis Habek", 14, 3, 5, 5);

        System.out.println(ucenik1.ispisInformacija());
        System.out.println(ucenik2.ispisInformacija());
    }
}
