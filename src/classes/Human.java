package classes;

/**
 * Created by java1 on 2017.12.13..
 */
public class Human extends Animal {
    public Human() {
        setLatinName("Homo Sapiens");
        setSex(Sex.Male);
        setWeightInKg(70);
    }

    @Override
    public void move() {

    }
}
