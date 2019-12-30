package model.entity;

public class Spice extends Food {

    private int pungency;

    public Spice(SpiceEnum spiceEnum, float weight) {
        super(spiceEnum.toString(), weight);
        this.pungency=spiceEnum.getPungency();
    }

    public float getPungency() {
        return pungency;
    }

}
