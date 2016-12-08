/**
 * Shadow.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class Shadow {

    private int darkness = 10;

    public void deepen (int darkness) {
        darkness += darkness;
        if (darkness > 100)
            darkness = 100;
    }

    public int getDarkness() {
        return darkness;
    }

    public static void main(String[] args) {
        Shadow s = new Shadow();
        System.out.print(s.getDarkness() + " ");
        s.deepen(50);
        System.out.println(s.getDarkness());
    }

}