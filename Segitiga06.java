import java.util.Scanner;

public class Segitiga06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalSudut;
        
        System.out.println("Sudut 1");
        sudut1=sc.nextInt();

        System.out.println(" Sudut 2");
        sudut2=sc.nextInt();

        System.out.println("Sudut 3");
        sudut3=sc.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 ==90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
         else if ((sudut1 == sudut2 && sudut1 == sudut3))
              System.out.println("Segitiga tersebut adalah  segitiga sama sisi");
        else if ((sudut1 == sudut3) || (sudut2 == sudut1) || (sudut3 == sudut2))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki ");
         else
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
         System.out.println("Bukan Segitiga");
        }
    }
    

