package Module09;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)

public class ParameterizedEncryptUtilsTest {

    private String input;   //Input
    private String result;   //Result

    public ParameterizedEncryptUtilsTest(String input, String result) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters(name = "Converting into encoded and vice versa")
    public static Iterable<Object[]> getParameterizedData() {
        return Arrays.asList(new Object[][] {
            {"A", "H"},
            {"a", "h"},
            {"ABCabc", "HIJhij"},
            {".", "."},
            {"Hello", "Olssv"}
        });
    }

    @Test
    public void testEncryptByCaesar() throws Exception {
        //System.out.println(input + "\t - \t" + result);
        Assert.assertEquals(result, EncryptUtils.encryptByCaesar(input, false));
    }
}