import java.util.Scanner;
public class Bilangan06 {public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int bilangan1, bilangan2, bilangan3 ;
    int bilTerbesar, total;

    System.out.println("masukkan bilangan 1");
    bilangan1 = sc.nextInt();
    System.out.println("masukkan bilangan 2");
    bilangan2 = sc.nextInt();
    System.out.println("masukkan bilangan 3");
    bilangan3 = sc.nextInt();

    bilTerbesar = bilangan1;

    if (bilTerbesar < bilangan2) {
        bilTerbesar=bilangan2;
    }
    if (bilTerbesar < bilangan3) {
        bilTerbesar=bilangan3;
    }
    System.out.println(bilTerbesar);
}

}

 



















