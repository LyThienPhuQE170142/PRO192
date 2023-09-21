import java.util.Scanner;

public class point {

    public static void main(String[] args) {
        // Nhập 2 số từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        // Tính toán các phép toán số học cơ bản
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = (float) a / b;

        // In ra kết quả
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
    }
}
