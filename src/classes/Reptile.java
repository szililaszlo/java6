package classes;

/**
 * Created by java1 on 2017.12.13..
 */
public class Reptile extends Animal {

    public Reptile() {
        setLatinName("Dragon");
        setWeightInKg(140);
        setSex(Sex.Male);
    }

    @Override
    public void move() {
        System.out.println("Reptile is moving.....");
    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weight: "
                + getWeightInKg() + " Sex: " +getSex();
    }
}
