package org.example.lr02_spring.service;

import org.example.lr02_spring.model.Positions;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBonusServiceImplTest {

    @Test
    void calculate() {

        // given
        Positions position = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.0;

        // when
        double result = new AnnualBonusServiceImpl().calculate(position, salary, bonus, workDays);

        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }
}