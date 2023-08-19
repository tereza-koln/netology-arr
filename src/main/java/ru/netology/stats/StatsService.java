package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;

        }
        return TotalSale;
    }

    public long average(long[] sales) {
        long TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;

        }
        long AverageSale = TotalSale / 12;
        return AverageSale;
    }


    public int MonthMaxSales(long[] sales) {
        int MonthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MonthMax]) {
                MonthMax = i;
            }
        }
        return MonthMax + 1;

    }

    public int MonthMinSales(long[] sales) {
        int MonthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MonthMin]) {
                MonthMin = i;
            }
        }
        return MonthMin + 1;

    }

    public int BellowAverage(long[] sales) {
        int counter = 0;
        long AverageSale = average(sales);
        for (long sale : sales) {
            if (sale < AverageSale) {
                counter++;

            }
        }

        return counter;
    }

    public int UnderAverage(long[] sales) {
        int counter = 0;
        long AverageSale = average(sales);
        for (long sale : sales) {
            if (sale > AverageSale) {
                counter++;

            }
        }

        return counter;
    }
}
