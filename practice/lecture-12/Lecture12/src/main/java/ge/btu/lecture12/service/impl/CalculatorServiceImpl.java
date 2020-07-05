package ge.btu.lecture12.service.impl;

import ge.btu.lecture12.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int addition(int x, int y) {
        return x + y;
    }

    @Override
    public int subtraction(int x, int y) {
        return x - y;
    }

    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }

    @Override
    public double division(int x, int y) {
        return x / y;
    }
}
