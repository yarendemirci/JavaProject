import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a, b;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin bir kenarını giriniz:");
        a = input.nextInt();
        System.out.println("Üçgenin diğer kenarını giriniz:");
        b = input.nextInt();
        alan = (a * b) / 2;
        System.out.println("Üçgenin alanı:" + alan);
    }
}



