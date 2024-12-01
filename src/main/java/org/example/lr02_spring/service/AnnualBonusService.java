package org.example.lr02_spring.service;

import org.example.lr02_spring.model.Positions;
import org.springframework.stereotype.Service;

@Service
public interface AnnualBonusService {

    double calculate(Positions positions, double salary, double bonus, int workDays);
}
