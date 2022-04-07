import org.junit.Assert;
import org.junit.Test;



public class PasswordComplexityTest {


    @Test
    public void PasswordComplex_true(){
        Assert.assertTrue(PasswordComplexity.PasswordComplex("KlGG6a"));
    }

    @Test
    public void PasswordComplex_false(){
        Assert.assertFalse(PasswordComplexity.PasswordComplex("1654654"));
        Assert.assertFalse(PasswordComplexity.PasswordComplex("KlGG6a "));
        Assert.assertFalse(PasswordComplexity.PasswordComplex("KlGG6aa"));
        Assert.assertFalse(PasswordComplexity.PasswordComplex("KlGG6 aa"));
        Assert.assertFalse(PasswordComplexity.PasswordComplex("aaa"));
        Assert.assertFalse(PasswordComplexity.PasswordComplex("KKK"));
    }

}