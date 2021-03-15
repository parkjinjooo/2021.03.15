package day0315;
// 성적관리프로그램

// 인원제한이 없는 프로그램으로 ArraUtil을 사용하여 만들어보세요
// (12시 20분까지)

import util.ArrayUtil;
import util.ScannerUtil;
import java.util.Scanner;

public class GradeBook01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idArray = new int[0];
        String[] nameArray = new String[0];
        int[][] scoreArray = new int[3][0];
        // 과목의 수가 많아질수록 1차원 배열로 따로 만드는 것보다 효용이 커짐

        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, " 1. 입력 2. 출력. 3. 종료");
            if (userChoice == 1) {
                // 입력 코드 구현

                // 번호 입력
                int id = ScannerUtil.nextInt(scanner, "번호를 입력해주세요");

                // 이름 입력
                String name = ScannerUtil.nextLine(scanner, "이름을 입력해주세요");

                // 국어 점수 입력
                int korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력해주세요", 0, 100);

                // 영어 점수 입력
                int english = ScannerUtil.nextInt(scanner, "영어 점수를 입력해주세요", 0, 100);

                // 수학 점수 입력
                int math = ScannerUtil.nextInt(scanner, "수학 점수를 입력해주세요", 0, 100);

                idArray = ArrayUtil.add(idArray, id);
                nameArray = ArrayUtil.add(nameArray, name);
                scoreArray[0] = ArrayUtil.add(scoreArray[0], korean);
                scoreArray[1] = ArrayUtil.add(scoreArray[1], english);
                scoreArray[2] = ArrayUtil.add(scoreArray[2], math);

            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (ArrayUtil.size(idArray) == 0) {
                    System.out.println("아직 입력된 정보가 없습니다.");
                } else {
                    for (int i = 0; i < ArrayUtil.size(idArray); i++) {
                        print(idArray[i], nameArray[i], scoreArray[0][i], scoreArray[1][i], scoreArray[2][i]);
                    }
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }

    // 출력하는 메소드
    public static void print(int id, String name, int korean, int english, int math) {
        System.out.printf("번호: %d번 이름: %s \n", id, name);
        System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점", korean, english, math);
        int sum = korean + english + math;
        double average = sum / 3.0;
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

    }

}
