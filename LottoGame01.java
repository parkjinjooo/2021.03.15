package day0315;
// 메소즈 분리가 되어있는 로또 게임 

import java.util.Random;
import java.util.Scanner;

import util.ScannerUtil;

public class LottoGame01 {

    // 1. main()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameNumbers = ScannerUtil.nextInt(scanner, "몇 게임 하실건가요?");

        // 컴퓨터 int 배열
        int[] computerNumbers = new int[6];

        // 사용자 숫자 배열
        int[][] userNumbers = new int[gameNumbers][6];

        // 컴퓨터 배열에 숫자 넣기
        selectRandomNumbers(computerNumbers);
        // 정렬 메소드 호출
        sort(computerNumbers);

        // 사용자가 선택애 따라서 게임마다
        // 수동할지 자동할지 선택해서 내용 정해주기
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println((i + 1) + "번 게임");
            int userChoice = ScannerUtil.nextInt(scanner, "1. 자동, 2. 수동", 1, 2);
            if (userChoice == 1) {
                selectRandomNumbers(userNumbers[i]);

            } else {
                insertNumber(userNumbers[i], scanner);

            }
            // userNumbers[i] 정렬 메소드 호출
            sort(userNumbers[i]);
        }

        // 결과 출력
        System.out.printf("컴퓨터 숫자: [%d, %d, %d, %d, %d, %d]\n", computerNumbers[0], computerNumbers[1],
                computerNumbers[2], computerNumbers[3], computerNumbers[4], computerNumbers[5]);

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.printf("사용자의 숫자: [%d, %d, %d, %d, %d, %d] 맞은 숫자 갯수: %d개 등수: %d등 \n", userNumbers[i][0],
                    userNumbers[i][1], userNumbers[i][2], userNumbers[i][3], userNumbers[i][4], userNumbers[i][5],
                    compare(computerNumbers, userNumbers[i]), 6 - compare(computerNumbers, userNumbers[i]) + 1);

        }

        scanner.close();
    }

    // 2. 랜덤숫자 뽑는 메소드
    public static void selectRandomNumbers(int[] numbers) {
        int index = 0;
        Random random = new Random();
        while (index < 6) {
            int number = random.nextInt(45) + 1;

            // 중복 체크하는 메소드 호출

            // 만약 false 면 추가

            if (!checkNumber(numbers, number)) {
                numbers[index] = number;
                index++;
            }
            // true면 아무것도 안함
        }
    }

    // 3. 어떤 숫자가 배열에 있는지 체크하는 메소드
    public static boolean checkNumber(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }

        return false;
    }

    // 4. 2개의 배열을 비교하여 같은 숫자가 몇개 있는지 비교하는 메소드
    public static int compare(int[] computerNumbers, int[] userNumbers) {
        int count = 0;
        for (int i = 0; i < computerNumbers.length; i++) {
            for (int j = 0; j < userNumbers.length; j++) {
                if (computerNumbers[i] == userNumbers[j]) {
                    count++;
                }
            }

        }

        return count;
    }

    // 5. 사용자로부터 숫자를 입력받아서
    // 배열에 올바른 숫자만 넣어주는 메소드
    public static void insertNumber(int[] numbers, Scanner scanner) {
        int index = 0;
        while (index < 6) {
            System.out.println((index + 1) + "번 숫자");
            int number = ScannerUtil.nextInt(scanner, (index + 1) + "번 숫자", 1, 45);

            if (!checkNumber(numbers, number)) {
                numbers[index] = number;
                index++;
            } else {
                System.out.println("이미 중복된 숫자입니다.");
            }

        }
    }

    // 6. 정렬 하는 메소드
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                i = -1;

            }
        }
    }

}
