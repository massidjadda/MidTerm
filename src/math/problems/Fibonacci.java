package math.problems;

public class Fibonacci {


    public static void main(String[] args) {
        // Set it to the number of elements you want in the Fibonacci Series
        int fib = 40;
        int previousfib = 0;
        int nextfib = 1;

        System.out.print( "Fibonacci Series of " + fib + " numbers:" );

        for (int i = 1; i <= fib; ++i) {
            System.out.print( previousfib + " " );


            int sum = previousfib + nextfib;
            previousfib = nextfib;
            nextfib = sum;
        }

    }

}
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */



