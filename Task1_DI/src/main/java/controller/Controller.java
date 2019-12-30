package controller;

import model.Model;
import model.entity.Ingredient;
import model.entity.SpiceEnum;
import model.entity.VegetableEnum;
import view.View;

import java.util.List;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }

    private void createSalad() {
        model.addIngredient(VegetableEnum.TOMATO, 10);
        model.addIngredient(VegetableEnum.TOMATO, 15);
        model.addIngredient(VegetableEnum.TOMATO, 12);
        model.addIngredient(VegetableEnum.CUCUMBER, 40);
        model.addIngredient(VegetableEnum.CUCUMBER, 50);
        model.addIngredient(VegetableEnum.ONION, 15);
        model.addIngredient(SpiceEnum.SALT, 1);
        model.addIngredient(SpiceEnum.PEPPER, 0.5f);
        model.addIngredient(SpiceEnum.BASIL, 0.5f);
    }

    public void countCalories() {
        view.showMessage(View.SALAD_CALORIES + model.countSaladCalories());
        view.showMessage(View.DELIMETER);
    }

    public void showIngredients(List<Ingredient> list) {
        list.forEach(ingredient ->
                view.showMessage(ingredient.getName() + " "
                        + ingredient.getWeight()));
        view.showMessage(View.DELIMETER);
    }

    public void processUser() {
        createSalad();
        showIngredients(model.getIngredientList());
        countCalories();

        view.showMessage(View.SORTED_BY_NAME);
        showIngredients(model.sortByName());
        view.showMessage(View.SORTED_BY_CALORIES);
        showIngredients(model.sortByCalories());
        view.showMessage(View.SORTED_BY_WEIGHT);
        showIngredients(model.sortByWeight());
        view.showMessage(View.IN_RANGE);
        showIngredients(model.getIngredientsInRangeOfCalories(12, 25));


    }
}
