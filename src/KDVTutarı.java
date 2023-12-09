import java.util.Scanner;
public class KDVTutarı {
    public static void main(String[] args) {

        double tutar, kdvOrani = 0, kdvliTutar,kdvTutari;
        Scanner input=new Scanner(System.in);
        System.out.println("Tutarı giriniz: ");
        tutar=input.nextDouble();
        kdvOrani= tutar<=1000 ? 0.18 : 0.8;
        kdvTutari=kdvOrani*tutar;
        kdvliTutar=kdvTutari+tutar;

        System.out.println("KDVsiz tutarı: " +tutar);
        System.out.println("KDV oranı: " +kdvOrani);
        System.out.println("KDV tutarı: " +kdvTutari);
        System.out.println("KDVli tutarı: "+kdvliTutar);

            }

}
