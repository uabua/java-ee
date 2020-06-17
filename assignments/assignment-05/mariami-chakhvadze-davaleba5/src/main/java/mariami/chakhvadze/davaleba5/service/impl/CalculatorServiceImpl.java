package mariami.chakhvadze.davaleba5.service.impl;

import mariami.chakhvadze.davaleba5.aspect.Println;
import mariami.chakhvadze.davaleba5.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Println
    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }
}
