package Task1;

public class App {
    public static void main(String[] args) {
//        1.ArrayIndexOutOfBoundsException
        int [] a = new int[10];
        System.out.println(a[11]);
//        2.ArithmeticException
        int b = 1/0;
        System.out.println(b);
//        3. NullPointerException
        Object obj = null;
        System.out.println((int) obj);

    }
}
