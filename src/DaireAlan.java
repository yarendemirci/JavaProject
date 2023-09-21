import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        double pi=3.14;
        double r,a,alan;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        r=input.nextDouble();
        System.out.println("Dairenin ölçüsünü giriniz: ");
        a=input.nextDouble();
        alan=(pi*r*r*a)/360;
        System.out.println("dairenin alanı: " +alan);

    }
}
