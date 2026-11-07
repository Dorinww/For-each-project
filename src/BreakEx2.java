public class BreakEx2 {

    static void main() {

        int nmax = 25;
        for(int n = 0; n < nmax; n++){
            if((n*n)>=nmax) break;
            System.out.println("n este egal cu " + n + " , n la patrat este egal cu " + n*n);
        }
        System.out.println("Sfarsitul buclei");
    }


}
