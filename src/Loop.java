/**
 * Loop.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Loop {

    public static void main(String[] args) {

        double[] a = {2.734, 4.2, 6.33};
        double[] b = a;

        int[] c = new int[3];

        // for loop
//        for (double elem : b)
//            System.out.print(elem + " ");

//        System.out.println(a[0] % 2); // Line A
//        System.out.printf("%.1f %d\n", b[1], c[1]); // Line B
        System.out.printf("%.2f %.2f", b[1], c[1]); // Line C

    }

}