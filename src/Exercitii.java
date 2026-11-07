import java.util.Scanner;

public class Exercitii {
    static void main() {
//        Scanner scanner = new Scanner(System.in);
//
//        int suma = 0 ;
//
//        for(int i = 0 ; i <= 12 ; i++)
//        {
//            System.out.println("Introduceti suma din vanzari: " + i + " : ");
//
//            int userSumInput = scanner.nextInt();
//
//            suma = suma + userSumInput;
//        }
//
//
//
//        System.out.println("Total: " +suma );
//
//        scanner.close();



        Scanner scanner = new Scanner(System.in);

      for(int i = 0; i < 100 ; i++)
      {
          System.out.println("Primul numar: ");
          int n1 = scanner.nextInt();
          int suma = n1 * n1 ;

          System.out.println("Numarul: " + suma );
      }

      scanner.close();

    }

}
