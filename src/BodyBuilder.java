/**
 * BodyBuilder.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class BodyBuilder {

    public int strength = 8;

    public boolean isStrongEnough (int strengthNeeded) {
        return strength >= strengthNeeded;
    }

    public void setStrength (int value) {
        strength = value;
    }
}