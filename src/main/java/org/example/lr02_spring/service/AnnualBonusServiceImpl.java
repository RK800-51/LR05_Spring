package org.example.lr02_spring.service;

import org.example.lr02_spring.model.Positions;
import org.springframework.stereotype.Service;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {

    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {
        return salary * bonus * 365 * positions.getPositionCoefficient() / workDays;
    }
}
