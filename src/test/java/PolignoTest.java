import org.example.Polignos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolignoTest {
    Polignos caso1 = new Polignos(3,5);
    Polignos caso2 = new Polignos(5,8);
    Polignos caso3 = new Polignos(2,4);

    Polignos tria = new Polignos(3,3,3);


    @Test
    public void test(){
        /**
        int result1 = caso1.area(3,5);
        int result2 = caso2.area(5,8);
        int result3 = caso3.area(2,4);
        int resultExpected1 = 15;
        int resultExpected2 = 40;
        int resultExpected3 = 8;
        assertEquals(result1, resultExpected1, "error");
        assertEquals(result2, resultExpected2, "error");
        assertEquals(result3, resultExpected3, "error");
**/
        int resultT = tria.isTriangle(3,4,5 );
        int resultExpected = 1;
        assertEquals(resultT, resultExpected, "error");


    }
}
