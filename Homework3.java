import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = scanner.nextInt();

        int[] arr = new int[n];   // 배열 크기를 입력받은 정수 개수로 지정

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();   // 공백으로 구분된 정수 입력
        }

        int max = arr[0];   // 두 변수 모두 0번째 요소로 초기화
        int min = arr[0];

        for (int i = 1; i < n; i++) {   // 1번째 요소부터 탐색하며 비교 후 갱신
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}