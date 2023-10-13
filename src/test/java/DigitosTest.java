import org.example.Digitos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitosTest {

    @Test
    public void media(){
        Digitos d = new Digitos();

        double result = d.media(123);
        double resultExpected = 2;

        assertEquals(result,resultExpected,"Error");


    }
}
