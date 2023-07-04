 public class test2 {
    public static void main(String[] args) {
        
        int num = 9;
        System.out.println("your number is "+ num);

        int fTerm = 0;
        int sTerm = 1;
        
        System.out.print("Fibonacci Series up to " + num + " terms: ");
        
        for (int i = 1; i <= num; i++) {
            System.out.print(fTerm + " ");
            
            int nextTerm = fTerm + sTerm;
            fTerm = sTerm;
            sTerm = nextTerm;
        }

    }
}

