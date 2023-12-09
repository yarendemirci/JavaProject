import java.util.Scanner;
public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        double km,price;
        double perKm=2.20, StartPrice=10,MinPrice=20;
        Scanner input=new Scanner(System.in);
        System.out.println("Gideceğiniz kmyi giriniz:");
        km=input.nextInt();
        //denendi.
        price=perKm*km;
        price+=StartPrice;

        price= price>=20 ? price : 20;

        System.out.println("TAXİ price: " +price);
    }

    }
