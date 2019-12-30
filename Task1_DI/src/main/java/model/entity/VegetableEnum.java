package model.entity;

public enum VegetableEnum {

    TOMATO(24),
    ONION(40),
    CUCUMBER(14);

    private final float caloriesPerHundred;

    VegetableEnum(float caloriesPerHundred){
        this.caloriesPerHundred=caloriesPerHundred;
    }


    public float getCaloriesPerHundred() {
        return caloriesPerHundred;
    }
}