package Module04;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() throws Exception {
        Assert.assertEquals(32f, TemperatureConverter.celsiusToFahrenheit(0), 0f);
        Assert.assertEquals(97.8f, TemperatureConverter.celsiusToFahrenheit(36.6f), 0.1f);
    }
}