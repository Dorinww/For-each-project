import java.util.Scanner;

public class TabelNumerePatrate {

    static void main(String[] args) {

        int number; // Variabila de control a buclei
        int maxValue; // Valoarea maxima de afisat

        System.out.println("Eu voi afisa un tabel cu " + "numere si patratele lor . ");

        //Cream un obiect al clasei Scanner pentru a putea introduce date
        Scanner keyboard = new Scanner(System.in);

        //Dam valoarea maxima pentru afisare
        System.out.println("Cat de sus trebuie sa ma duc? ");
        maxValue = keyboard.nextInt();

        //Afisam tabelul
        System.out.println("Numar Numar la patrat ");
        System.out.println("----------------------");
        for(number = 1; number <= maxValue; number++)
        {
            System.out.println(number + "\t\t\t" + number * number);
        }

    }
}
