public class ForIf {
    static void main() {

       for(int num = 0; num <=10; num++){
           //nu uitam , % returneaza
           //restul de la impartire
           if( (num % 2) == 0) continue;

           System.out.println(num);
       }
    }
}
