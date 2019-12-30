package view;

public class View {

    public static final String SALAD_CALORIES = "Total amount of calories in the salad: ";
    public static final String DELIMETER = "\n---------------------------------------\n";
    public static final String SORTED_BY_CALORIES = "Ingredients sorted by calories: ";
    public static final String SORTED_BY_NAME = "Ingredients sorted by name: ";
    public static final String SORTED_BY_WEIGHT = "Ingredients sorted by weight: ";
    public static final String IN_RANGE = "Ingredients in range of calories: ";

    public void showMessage(String message) {
        System.out.println(message);
    }

}
