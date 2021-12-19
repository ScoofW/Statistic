package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calculateSum(sales) / 12;
    }

    public int findmaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findminSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findlessthanAverage(int[] sales) {
        int counter = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale < average) counter++;
            {
            }

        }
        return counter;
    }

    public int findmorethanAverage(int[] sales) {
        int counter = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale > average) counter++;{
            }
        }
        return counter;
    }
}
