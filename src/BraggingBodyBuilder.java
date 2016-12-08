/**
 * BraggingBodyBuilder.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class BraggingBodyBuilder extends BodyBuilder {
    public int strength = 10;
    public void brag() {
        System.out.println("My strength is " + strength);
    }

    public static void main(String[] args) {
        BodyBuilder builder = new BraggingBodyBuilder();
        builder.strength = 15;
        BraggingBodyBuilder bragger = (BraggingBodyBuilder) builder;
        bragger.brag(); // Line A
        bragger.strength = 20;
        bragger.brag(); // Line B
    }
}