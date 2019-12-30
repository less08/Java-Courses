package model.entity;

public abstract class Food implements Ingredient {

    private String name;
    private float weight;

    protected Food (String name, float weight){
        this.name=name;
        this.weight=weight;
    }

    public String getName() {
        return this.name;
    }

    public float getWeight() {
        return weight;
    }
}
