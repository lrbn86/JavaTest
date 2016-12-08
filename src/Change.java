/**
 * Change.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Change {

    public static int manipulate (int[] arr, int a) {
        a = a + 10;
        arr[0] = 37;
        int[] newArray = arr;
        newArray[1] = 47;
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {13, 17, 23};
        int a = 20;
        a = manipulate(arr, a);
        System.out.println(arr[0] + " " + a); // Line A
        System.out.println(arr[1] + " " + a); // Line B
    }

}