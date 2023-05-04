package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthCalcTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/income.csv")
    void shouldCalculate(int expected, int income, int expenses, int threshold) {
        MonthCalcService service = new MonthCalcService();

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
