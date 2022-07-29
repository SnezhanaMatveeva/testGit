public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{345,78,50});
        System.out.println(salesManager.max());
        System.out.println(salesManager.truncatedMean());
    }
}