package ru.netology.stats;

public class StatsService {

    public int allSales(long[] sales) {
        int all = 0;
        for (long sale : sales) {
            all += sale;
        }
        return all;
    }

    public int averageSales(long[] sales){
        int allSum = allSales(sales);
        return allSum / sales.length;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)){
                months = months + 1;
            }
        }
        return months;
    }

    public int aboveAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)){
                months = months + 1;
            }
        }
        return months;
    }
}
