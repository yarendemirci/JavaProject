import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args) {
        int matematik,kimya,turkce,tarih,muzik;
        float ortalama;
        Scanner input=new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        matematik=input.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        kimya=input.nextInt();

        System.out.println("Türkçe notunu giriniz: ");
        turkce=input.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        tarih=input.nextInt();

        System.out.println("Müzik notunu giriniz: ");
        muzik=input.nextInt();

        ortalama=(matematik+kimya+turkce+tarih+muzik)/5f;

        boolean kosul1=ortalama>=60;

        String str=kosul1 ? "geçti" : "kaldı";
        System.out.println(str);

    }
}
