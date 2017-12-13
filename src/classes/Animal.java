package classes;

enum  Sex{Male, Female}
/**
 * Created by java1 on 2017.12.13..
 */
public abstract class Animal {
    private String latinName;
    private  float weightInKg;
    private  Sex sex;

    public abstract void move();

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
