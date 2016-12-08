/**
 * Digit.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Digit {

    public static int doSomething (int num) {
        if (Math.abs(num) > 9) {
            return (1 + doSomething(num / 10));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int num = 1;
        System.out.println(doSomething(num));
    }

}