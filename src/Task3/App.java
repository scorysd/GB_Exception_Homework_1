package Task3;

public class App {
    public static int[] resArr(int[] a, int[] b) {
        int[] result = new int[a.length];
        if (a.length != b.length){
            throw new RuntimeException("Array is not a same");
        }
        for (int i = 0; i < result.length; i++)
            try {
                result[i] = a[i] / b[i];
            }catch (ArithmeticException e){
                System.out.println("Divide by zero");
            }
        return result;
    }

    public static void main(String[] args) {
        int[] x = new int[]{6, 8, 10, 4, 6, 12};
        int[] y = new int[]{3, 4, 0, 2, 3, 4};
        int[] res = resArr(x, y);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }


}

