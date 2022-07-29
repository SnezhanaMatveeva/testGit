public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long truncatedMean() {
        long sum = 0;
        long kolvo = 0;
        long max = max();
        long min = min();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max && sales[i] != min) {
                sum = sum + sales[i];
                kolvo = kolvo + 1;
            }
        }


        long result=0;
        if (kolvo != 0) {
            result = sum / kolvo;
        }
        return result;
    }
}