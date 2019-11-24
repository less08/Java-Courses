import java.util.Random;

public class Model {

    private static final int LOWER_BOUNDARY = 1;
    private static final int UPPER_BOUNDARY = 99;
    private int minBarrier;
    private int maxBarrier;
    private int secretValue;

    public void setSecretValue() {
        Random rnd = new Random(System.currentTimeMillis());
        this.secretValue = LOWER_BOUNDARY + rnd.nextInt(UPPER_BOUNDARY - LOWER_BOUNDARY + 1);
    }

    public int getMinBarrier() {
        return this.minBarrier;
    }

    public int getMaxBarrier() {
        return this.maxBarrier;
    }

    public int getSecretValue() {
        return secretValue;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public boolean checkValue(int value) {
        if (value == secretValue) {
            return true;
        } else if (value > secretValue) {
            maxBarrier = value;
        } else {
            minBarrier = value;
        }
        return false;
    }

}
