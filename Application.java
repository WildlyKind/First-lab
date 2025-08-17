public class Application {

    public static void main(String[] args) {
        long[] w = arrayW();
        double[] x = arrayX();
        double[][] b = new double[7][10];
        print(func(w, x, b));
    }

    public static double func1(double x){
        double argtan = Math.atan((x + 2)/8);
        double numerator = Math.cbrt(argtan) - (1.0/3.0);
        double tan = Math.tan(x);
        double denominator = Math.exp(tan);
        return numerator / denominator;
    }

    public static double func2(double x){
        double num = Math.pow(2*x, x);
        double tan = Math.tan(num);
        return Math.pow((1.0/3.0) / tan, 2);
    }

    public static double func3(double x) {
        double sin = Math.sin(x);
        double cos = 4 * Math.cos(x);
        double tan = Math.tan(Math.pow(sin, cos));
        double abs = Math.abs(tan);
        double denominator = Math.exp(abs);
        return Math.atan(1.0 / denominator);

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


    public static long[] arrayW() {
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

    public static double[] arrayX() {
        double[] values = new double[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = Math.random() * 8 - 2;
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