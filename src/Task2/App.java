package Task2;

public class App {
    public static void main(String[] args) {
        String[][] str = new String[1][2];
        sum2d(str);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

//Можем получить:
//1. ArrayIndexOutOfBoundsException
//2. ClassCastException
//3. NullPointerException
//4. NumberFormatException