package classes;

/**
 * Created by java1 on 2017.12.13..
 */
public class Mammal extends Animal {
    public Mammal() {
        setLatinName("Panther");
        setSex(Sex.Female);
        setWeightInKg(40);
    }

    @Override
    public void move() {
        System.out.println("Mammal is moving.....");
    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weight: "
                + getWeightInKg() + " Sex: " +getSex();
    }
}
