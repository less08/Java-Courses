package model;

import model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private Salad salad = new Salad();

    public void addIngredient(VegetableEnum vegetableEnum, float weight) {
        salad.add(new Vegetable(vegetableEnum, weight));
    }

    public void addIngredient (SpiceEnum spiceEnum, float weight){
        salad.add(new Spice(spiceEnum,weight));

    }

    public List<Ingredient> getIngredientsInRangeOfCalories(float from, float to) {
        return salad.findIngredientInRangeOfCalories(from, to);
    }


    public float countSaladCalories() {
        return salad.countCalories();
    }

    public ArrayList<Ingredient> getIngredientList() {
        return salad.getIngredientList();
    }

    public List<Ingredient> sortByName() {
        return salad.sortByName();
    }

    public List<Ingredient> sortByCalories() {
        return salad.sortByCalories();
    }

    public List<Ingredient> sortByWeight() {

        return salad.sortByWeight();
    }
}
