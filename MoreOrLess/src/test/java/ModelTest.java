import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    Model model;

    @Before
    public void init() {
        model = new Model();
        model.setInitialBarriers(0, 100);
    }

    @Test
    public void testCheckValueResultTrue() {
        int input = model.getSecretValue();
        //boolean expectedResult = input == model.getSecretValue();
        Assert.assertTrue(model.checkValue(input));
    }

    @Test
    public void testCheckValueResultFalse() {
        int input = model.getSecretValue() + 5;
        Assert.assertFalse(model.checkValue(input));
    }

    @Test
    public void testCheckValueLowerBarrier() {
        int input = model.getSecretValue() - 5;
        model.checkValue(input);
        Assert.assertEquals(input, model.getMinBarrier());
    }

    @Test
    public void testCheckValueUpperBarrier() {
        int input = model.getSecretValue() + 5;
        model.checkValue(input);
        Assert.assertEquals(input, model.getMaxBarrier());
    }

}