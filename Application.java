import static java.lang.Math.*;

public class Application {

    public static void main(String[] args) {
        long[] w = createArrayW();
        double[] x = createArrayX();
        double[][] b = new double[7][10];
        print(func(w, x, b));
    }

    public static double func1(double x){
        return cbrt(atan((x + 2)/8)) - (1.0/3.0) / exp(tan(x));
    }

    public static double func2(double x){
        return pow((1.0/3.0) / tan(pow(2*x, x)), 2);
    }

    public static double func3(double x) {
        double tan = tan(pow(sin(x), 4 * cos(x)));
        return atan(1.0 / exp(abs(tan)));
    }

    public static double[][] func(long[] arrW, double[] arrX, double[][] arrB){
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrW[i] == 14) {
                    arrB[i][j] = func1(arrX[j]);
                } else if (arrW[i] == 6 || arrW[i] == 12 || arrW[i] == 16) {
                    arrB[i][j] = func2(arrX[j]);
                } else {
                    arrB[i][j] = func3(arrX[j]);
                }
            }
        }
        return arrB;
    }


    public static long[] createArrayW() {
        long[] values = new long[7];
        int index = 0;
        for (int number = 4; number < 17; number++) {
            if (number % 2 == 0) {
                values[index] = number;
                index++;
            }
        }
        return values;
    }

    public static double[] createArrayX() {
        double[] values = new double[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = random() * 8 - 2;
        }
        return values;
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
