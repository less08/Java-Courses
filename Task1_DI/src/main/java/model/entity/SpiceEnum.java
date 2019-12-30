package model.entity;

public enum SpiceEnum {
    SALT(0),
    PEPPER(3),
    PAPRIKA(4),
    OREGANO(1),
    BASIL(0);


    private final int pungency;

    SpiceEnum(int pungency) {
        this.pungency = pungency;
    }


    public int getPungency() {
        return pungency;
    }
}
