class Main {
    public static void main(String[] args) {
        long[] saleManagerArray = {1, 5, 19};
        SalesManager salesManager = new SalesManager(saleManagerArray);

        System.out.println(salesManager.max());
    }
}