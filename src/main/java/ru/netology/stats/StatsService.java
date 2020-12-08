package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int salesSum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int salesAverage(int[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxMonth(int[] sales) {
        int max = sales[0];
        int maxIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int minMonth(int[] sales) {
        int min = sales[0];
        int minIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int countUnderAverage(int[] sales) {
        double average = salesAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countOverAverage(int[] sales) {
        double average = salesAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
