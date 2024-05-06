/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    /*
    public static int nextNumber(int n) {
        if (n  == 128) {
            return 1;
        } else if (n == 5) {
            return 3 * n + 1;
        } else {
            return n * 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
     */

    /** nextNumber method implements the Collatz sequence, but doesn't include
     * that Collatz sequence must terminate at 1. Will include that in
     * main method, using a while loop. **/
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return n * 3 + 1;
        }
    }

    /** main method runs the nextNumber method starting from the number 5.
     * Also includes the fact that Collatz sequence must terminate at 1
     * using a while loop. **/
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {               /* while loop, calls nextNumber method */
            n = nextNumber(n);
            System.out.print(n + " ");   /* syntax thing: using println will print your
                                        results with each number on a separate line. While
                                        just using print prints it all in one line. */
    }
      /*  System.out.println();       /* don't need this line, it doesn't actually do anything, the
                                       while loop automatically prints out the final terminating number
                                       of 1./
       */





    }
}

