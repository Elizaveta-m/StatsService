package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {

        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.calculateSum(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {

        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.calculateAverage(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSalesMonth() {

        StatsService service = new StatsService();

        long expected = 11;
        long actual = service.findMaxSalesMonth(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMinSalesMonth() {

        StatsService service = new StatsService();

        long expected = 1;
        long actual = service.findMinSalesMonth(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthUnderAverage() {

        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.findMonthUnderAverage(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthOverAverage() {

        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.findMonthOverAverage(monthSales);
        assertEquals(expected, actual);
    }
}