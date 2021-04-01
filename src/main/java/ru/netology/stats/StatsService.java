package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] monthSales) {
        long sum = 0;
        for (long monthSale : monthSales) {
            sum += monthSale;
        }
        return sum;
    }

    public long calculateAverage(long[] monthSales) {
        return calculateSum(monthSales) / monthSales.length;
    }

    public int findMaxSalesMonth(long[] monthSales) {
        long currentMax = monthSales[0];
        int month = 0;
        int i;

        for (i = 0; i < monthSales.length; i++) {
            if (currentMax <= monthSales[i]) {
                currentMax = monthSales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int findMinSalesMonth(long[] monthSales) {
        long currentMin = monthSales[0];
        int month = 0;
        int i;

        for (i = 0; i < monthSales.length; i++) {
            if (currentMin >= monthSales[i]) {
                currentMin = monthSales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int findMonthUnderAverage(long[] monthSales) {
        long average = calculateAverage(monthSales);
        int month = 0;
        int quantityUnder = 0;
        for (long monthSale : monthSales) {
            if (monthSale < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }

    public int findMonthOverAverage(long[] monthSales) {
        long average = calculateAverage(monthSales);
        int month = 0;
        int quantityOver = 0;
        for (long monthSale : monthSales) {
            if (monthSale > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }

}
