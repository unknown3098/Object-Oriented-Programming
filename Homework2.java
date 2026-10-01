import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 몇 개의 수를 입력받을지 입력
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        // 2. 입력받은 개수만큼 정수 배열 생성
        int[] numbers = new int[count];

        // 3. 공백으로 구분된 정수들을 배열에 저장
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 4. 최대값과 최소값을 배열의 0번째 요소로 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 5. 배열 요소를 탐색하며 최대값/최소값 갱신
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 6. 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}
