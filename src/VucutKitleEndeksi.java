import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo, boy;
        double indeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Boyunuzu giriniz:");
        boy = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut indeksi:" + indeks);

    }
}
