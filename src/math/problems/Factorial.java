package math.problems;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else {
            return (n * factorial( n - 1 ));
        }
    }

    public static void main(String args[]) {
        int i, fact = 1;
        int number = 5;
        fact = factorial( number );
        System.out.println( "Factorial of " + number + " is: " + fact );
    }
}













   /* public static void main(String[] args) {

        //iteration

        int j = 1;
        int num = 5;
        for (int i=1;i<=num; i++)
        {
            {
                j = j * i;

            }

        }
        System.out.println("the factorial of 5 is "+" "+j );
        }



        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


//}

