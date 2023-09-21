import java.util.Scanner;
public class HipotenüsBulma {
    public static void main(String[] args) {
        int a,b;
        double hipotenus;
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin bir kenarını giriniz:");
        a=input.nextInt();
        System.out.println("Üçgenin diğer kenarını giriniz:");
        b=input.nextInt();
        hipotenus= Math.sqrt((a*a) +(b*b));
        System.out.println("Hipotenüs değeri: " +hipotenus);


    }

    }
