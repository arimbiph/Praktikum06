 import java.util.Scanner;

 public class
 KabisatNested06{
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = input06.nextInt();
        if ((tahun % 400) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
        } else
         System.out.println("Bukan Tahun Kabisat");

 }
}
