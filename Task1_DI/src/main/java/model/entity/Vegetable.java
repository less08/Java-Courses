package model.entity;

public class Vegetable extends Food  {


    private final float caloriesPerHundred;

    public Vegetable(VegetableEnum vegetableEnum, float weight) {
        super(vegetableEnum.name(), weight);

        this.caloriesPerHundred = vegetableEnum.getCaloriesPerHundred();
    }

    public float getCalories() {
        return caloriesPerHundred;
    }

    public float calculateCalories() {
        return caloriesPerHundred * getWeight() / 100;
    }
}
