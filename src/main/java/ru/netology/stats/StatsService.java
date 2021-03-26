package ru.netology.stats;

public class StatsService {
    //    monthSales.length;
    long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long calculateSum(long[] monthSales) {
        StatsService service = new StatsService();
        long sum = 0; // начинаем с нуля
        for (long monthSale : monthSales) {
            // аналог sum = sum + purchase;
            // каждый раз прибавляем к текущей сумме новый элемент
            sum += monthSale;
        }
        return sum;
    }

    public long calculateAverage(long[] monthSales) {
        StatsService service = new StatsService();
        long sum = 0;
        for (long monthSale : monthSales) {
            sum += monthSale;
        }
        return sum / monthSales.length;
    }

    public int findMaxSalesMonth(long[] monthSales) {
        StatsService service = new StatsService();
        long currentMax = monthSales[0]; // берём за точку отсчёта первый
        int month = 0;

//             перебираем по одному
        for (long monthSale : monthSales)
            if (currentMax <= monthSale) {
                month++;
            }
        int maxSalesMonth = month;
        return maxSalesMonth; //             возвращаем итоговый
    }

    public int findMinSalesMonth(long[] monthSales) {
        StatsService service = new StatsService();
        long currentMin = monthSales[0];
        int month = 0;
        for (long monthSale : monthSales)
            if (currentMin > monthSale) {
                month++;
            }
        int minSalesMonth = month;
        return minSalesMonth; //             возвращаем итоговый
    }


    public static int findMonthUnderAverage(long[] monthSales) {
        StatsService service = new StatsService();
        long average = service.calculateAverage(monthSales);
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

    public static int findMonthOverAverage(long[] monthSales) {
        StatsService service = new StatsService();
        long average = service.calculateAverage(monthSales);
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
