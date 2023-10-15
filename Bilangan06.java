import java.util.Scanner;
public class Bilangan06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan1, bilangan2, bilangan3;
        int bilTerbesar;

        System.out.println("Masukkan bilangan 1: ");
        bilangan1 = sc.nextInt();
        System.out.println("Masukkan bilangan 2: ");
        bilangan2 = sc.nextInt();
        System.out.println("Masukkan bilangan 3: ");
        bilangan3 = sc.nextInt();

        bilTerbesar = (bilangan1 > bilangan2) ? ((bilangan1 > bilangan3) ? bilangan1 : bilangan3) : ((bilangan2 > bilangan3) ? bilangan2 : bilangan3);

        System.out.println("Bilangan terbesar adalah: " + bilTerbesar);
}
}
