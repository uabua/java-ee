package mariami.chakhvadze.davaleba5;

import mariami.chakhvadze.davaleba5.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest() {
        int expected = 20;
        int actual;
        actual = calculatorService.multiplication(2, 10);
        assertEquals(expected, actual);
    }
}
