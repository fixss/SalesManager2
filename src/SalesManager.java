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

    public long getMinValue(){
        long minValue = sales[0];
        for(int i=1; i<sales.length; i++){
            if(sales[i] < minValue){
                minValue = sales[i];
            }
        }
        return minValue;
    }
    public long getAverage() {
        long sum = 0;
        long average;
        for(int i=0; i < sales.length; i++){
            sum = sum + sales[i];
        }
        average = ((long)sum - (max() + getMinValue())) / (sales.length -2);
        return average;
    }
}

