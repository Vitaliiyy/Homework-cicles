package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.ServiceClass;

public class ServiceClassTest {

    @ParameterizedTest
//    @CsvSource({
//            "100000,60000,2"
//    })
    @CsvFileSource(files="src/test/resources/service.csv")
    void CalculateForIncomeOneHundred(int income, int expenses, int expected) {
        ServiceClass service = new ServiceClass();

        // подготавливаем данные:
//        int income = 100_000;
//        int expenses = 60_000;
//        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void CalculateForIncomeTenThousand() {
//        ServiceClass service = new ServiceClass();
//
//        // подготавливаем данные:
//        int income = 10_000;
//        int expenses = 3_000;
//        int expected = 3;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(income, expenses);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
}

