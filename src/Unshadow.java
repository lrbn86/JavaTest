/**
 * Unshadow.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Unshadow {

    private int darkness = 10;

    public void deepen (int darkness) {
        this.darkness += darkness;

        if (this.darkness > 100)
            this.darkness = 100;
    }

    public int getDarkness() {
        return darkness;
    }

    public static void main(String[] args) {

        Unshadow us = new Unshadow();
        System.out.print(us.getDarkness() + " ");
        us.deepen(50);
        System.out.println(us.getDarkness());

    }

}