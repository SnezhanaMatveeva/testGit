public class SalesManager {

    protected int[] sales;

    public SalesManager(int[] sales) {

        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int truncatedMean() {
        int sum = 0;
        int kolvo = 0;
        int max = max();
        int min = min();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max && sales[i] != min) {
                sum = sum + sales[i];
                kolvo = kolvo + 1;
            }
        }


        int result=0;
        if (kolvo != 0) {
            result = sum / kolvo;
        }
        return result;
    }
}