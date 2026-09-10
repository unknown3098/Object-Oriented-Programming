import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("정수를 입력하세요: ");
        total += sc.nextInt();
        System.out.println("현재까지의 합: " + total);

        System.out.print("정수를 입력하세요: ");
        total += sc.nextInt();
        System.out.println("현재까지의 합: " + total);

        System.out.print("정수를 입력하세요: ");
        total += sc.nextInt();
        System.out.println("현재까지의 합: " + total);

        System.out.print("정수를 입력하세요: ");
        total += sc.nextInt();
        System.out.println("현재까지의 합: " + total);

        System.out.print("정수를 입력하세요: ");
        total += sc.nextInt();
        System.out.println("현재까지의 합: " + total);

        sc.close();
    }
}