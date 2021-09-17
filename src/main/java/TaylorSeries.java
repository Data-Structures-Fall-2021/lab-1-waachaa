public class TaylorSeries {
    public static long pow(int a, int b) {
        if (b != 0) {return (a*pow(a, b-1));} else return 1;
    }

    public static long factorial(long n) {
        if (n<=1) {return 1;} else return n*factorial(n-1);
    }

    public static double approximateExp(int x, int numIterations) {
        double total = 0.0;
        for (int i=0; i<numIterations; i++) {
            total += (double)pow(x, i)/factorial(i);
        }
        return total;
    }
}
