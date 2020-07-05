package ge.btu.lecture12;

import ge.btu.lecture12.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void additionTest() {
        int expected =20 ;
        int actual;
        actual = calculatorService.addition(10, 10);
        assertEquals(expected, actual);
    }
}
