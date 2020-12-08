package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSalesSum() {
        int actual = service.salesSum(sales);
        assertEquals(180, actual);
    }


    @Test
    void shouldSalesAverage() {
        int actual = service.salesAverage(sales);
        assertEquals(15.0, actual);
    }

    @Test
    void shouldMaxMonth() {
        int actual = service.maxMonth(sales);
        assertEquals(7, actual);
    }

    @Test
    void shouldMinMonth() {
        int actual = service.minMonth(sales);
        assertEquals(8, actual);
    }

    @Test
    void shouldCountUnderAverage() {
        int actual = service.countUnderAverage(sales);
        assertEquals(5, actual);
    }

    @Test
    void shouldCountOverAverage() {
        int actual = service.countOverAverage(sales);
        assertEquals(5, actual);
    }
}