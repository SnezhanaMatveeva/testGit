public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{345,78,50,345,80,50});
        System.out.println(salesManager.max());
        System.out.println(salesManager.truncatedMean());
    }
}