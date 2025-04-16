package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140F;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert300RblThen1Dot4Euro() {
        float in = 300F;
        float expected = 3F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen1Dot4Euro() {
        float in = 200F;
        float expected = 2F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2dot22222Dlr() {
        float in = 180F;
        float expected = 2F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2dot22222Dlr() {
        float in = 200F;
        float expected = 2.2222F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0RblThen2dot22222Dlr() {
        float in = 0F;
        float expected = 0F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}