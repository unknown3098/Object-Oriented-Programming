import java.util.Scanner;                              // [1]

public class Homework4 {                               // [2]

    public static int gcd(int m, int n) {              // [3]
        if (n == 0) {                                  // [4]
            return m;                                  // [5]
        }
        int small = Math.min(m, n);                    // [6]
        int large = Math.max(m, n);                    // [7]
        return gcd(small, large % small);              // [8]
    }

    public static int gcdLoop(int m, int n) {          // [9]
        while (n != 0) {                               // [10]
            int small = Math.min(m, n);
            int large = Math.max(m, n);
            m = small;                                 // [11]
            n = large % small;                         // [12]
        }
        return m;                                      // [13]
    }

    public static void main(String[] args) {           // [14]
        Scanner sc = new Scanner(System.in);           // [15]

        System.out.print("두 수를 입력하세요: ");        // [16]
        int a = sc.nextInt();                          // [17]
        int b = sc.nextInt();

        System.out.println("두 수의 최대공약수는 "
                + gcd(a, b) + "입니다.");    // [18]

        sc.close();                                    // [19]
    }
}
