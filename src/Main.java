class Main {
    public static void main(String[] args) {
        int[] saleManagerArray = {2, 5, 19, 25, 55, 99,};
        SalesManager salesManager = new SalesManager(saleManagerArray);

        System.out.println(salesManager.max());
        System.out.println(salesManager.getMinValue());
        System.out.println(salesManager.getAverage());
    }
}