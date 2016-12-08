/**
 * CarBoolean.java
 *
 *
 *
 * @author Brandon Nguyen
 *
 * @version December 07, 2016
 *
 */
public class CarBoolean {

    public static void main(String[] args) {

        Car car1 = new Car ("Mercedes", "C300 Sport", 75000);
        Car car2 = new Car ("Pontiac", "Vibe", 17000);
        Car car3 = new Car ("Mercedes", "C300 Sport", 75000);

        boolean same;

        same = (car1 == car2);
        System.out.println(same);
        same = (car1 == car3);
        System.out.println(same);
//        same = (car1.equals(car3));
        System.out.println(car1.equals(car3));

    }
}