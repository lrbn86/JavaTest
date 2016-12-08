/**
 * Test.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Test {

    public static int compute (int x) {

        if (x < 100)
            x = compute (x + 10);
        return (x - 1);
    }

    public static void main(String[] args) {
        System.out.println(compute(60));
    }

}