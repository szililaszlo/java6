package classes;

/**
 * Created by java1 on 2017.12.13..
 */
public class Bird extends Animal {

    public Bird() {
        setLatinName("Eagle");
        setSex(Sex.Male);
        setWeightInKg(5);

    }

    public void move() {
        System.out.println("Bird is moving.....");
    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weight: "
                + getWeightInKg() + " Sex: " +getSex();
    }
}
