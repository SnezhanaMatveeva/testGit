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
        long quantity = 0;
        long max = max();
        long min = min();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max && sales[i] != min) { // учитываются все max и min
                sum = sum + sales[i];
                quantity = quantity + 1;
            }
        }


        long result=0;
        if (quantity != 0) {
            result = sum / quantity;
        }
        return result;
    }
}