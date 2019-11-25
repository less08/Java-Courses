import java.util.Random;

public class Model {
    private int minBarrier;
    private int maxBarrier;
    private int secretValue;

    public void setInitialBarriers(int minBarrier, int maxBarrier) {
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public void setSecretValue() {
        Random rnd = new Random(System.currentTimeMillis());
        this.secretValue = minBarrier + rnd.nextInt(maxBarrier - minBarrier + 1);
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
