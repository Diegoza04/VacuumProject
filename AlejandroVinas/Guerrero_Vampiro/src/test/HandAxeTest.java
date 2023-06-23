package test;
import main.Handaxe;
import org.junit.Assert;
import org.junit.Test;

public class HandAxeTest extends Weapons{
    Handaxe handaxe = new Handaxe(0.5, 0.5);

    public HandAxeTest() {
        super(0.5, 0.5);
    }

    @Test
    public void testDamage() {
        Handaxe handaxe1 = new Handaxe(0,5);
        handaxe1.setDamage(10);

        double expectedDamage = 10;
        double actualDamage = handaxe1.getDamage();

        Assert.assertEquals(expectedDamage, actualDamage, 0.0);
    }

    @Test
    public void testAccuracy() {
        Handaxe handaxe1 = new Handaxe(0,6);
        handaxe1.setAccuracy(0.75);

        double expectedAccuracy = 0.75;
        double actualAccuracy = handaxe1.getAccuracy();

        Assert.assertEquals(expectedAccuracy, actualAccuracy, 0.0);
    }
}
