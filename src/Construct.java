/**
 * Construct.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Construct {

    private int prime;
    private String name;

    public Construct() {
        this(17); // Line A
    }

    public Construct (int n) {
        this("Euler"); // Line B
        this.prime = n; // Line C
    }

    public Construct (String myname) {
        this.name = myname; // Line D
    }

    public int getPrime() {
        return prime;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Construct c = new Construct();
        System.out.println(c.getPrime() + " " + c.getName()); // "17 Euler"
    }

}