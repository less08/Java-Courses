package model;

import model.entity.Ingredient;
import model.entity.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salad {

    private List <Ingredient> ingredientList= new ArrayList <>();

    float countCalories() {
                double sumOfCalories = ingredientList.stream()
                .filter(Vegetable.class::isInstance)
                .map(Vegetable.class::cast)
                .mapToDouble(x->x.calculateCalories()).sum();

        return (float) sumOfCalories;
    }

    public List <Ingredient> sortByName() {

        return ingredientList.stream()
                .sorted(Comparator.comparing(Ingredient::getName))
                .collect(Collectors.toList());


    }

    public List <Ingredient> sortByWeight() {

        return ingredientList.stream()
                .sorted(Comparator.comparing(Ingredient::getWeight))
                .collect(Collectors.toList());


    }

    public List <Ingredient> sortByCalories() {

        return ingredientList.stream()
                .filter(Vegetable.class::isInstance)
                .map(Vegetable.class::cast)
                .sorted(Comparator.comparing(Vegetable::getCalories))
                .collect(Collectors.toList());

    }

    ArrayList<Ingredient> getIngredientList() {
        ArrayList<Ingredient> ingredientsCopy = new ArrayList<Ingredient>();
        ingredientsCopy.addAll(this.ingredientList);
        return ingredientsCopy;
    }

    List<Ingredient> findIngredientInRangeOfCalories(float from, float to) {
        return ingredientList.stream()
                .filter(Vegetable.class::isInstance)
                .map(Vegetable.class::cast)
                .filter(x->x.getCalories()>=from&&x.getCalories()<=to)
                .collect(Collectors.toList());

    }

    public void add(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }
}
