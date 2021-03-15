package day0315;

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class HW_GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[0];
        String[] nameArray = new String[0];
        int[][] scoreArray = new int[3][0];

        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 2. 종료", 1, 3);
            if (userChoice == 1) {
                Student s = new Student();
                s.id = ScannerUtil.nextInt(scanner, "번호");
                s.name = ScannerUtil.nextLine(scanner, "이름");
                s.korean = ScannerUtil.nextInt(scanner, "국어점수", 0, 100);
                s.english = ScannerUtil.nextInt(scanner, "영어점수", 0, 100);
                s.math = ScannerUtil.nextInt(scanner, "수학 점수", 0, 100);

                idArray = ArrayUtil.add(idArray, s.id);
                nameArray = ArrayUtil.add(nameArray, s.name);
                scoreArray[0] = ArrayUtil.studentAdd(scoreArray[0], s.korean);
                scoreArray[1] = ArrayUtil.studentAdd(scoreArray[1], s.english);
                scoreArray[2] = ArrayUtil.studentAdd(scoreArray[2], s.math);

            } else if (userChoice == 2) {
                if (ArrayUtil.studentSize(idArray) == 0) {
                    System.out.println("아직 입력된 정보가 없습니다.");
                } else {
                    for (int i = 0; i < ArrayUtil.studentSize(idArray); i++) {
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

    public static void print(int id, String name, int korean, int english, int math) {
        System.out.printf("번호: %d번 이름: %s \n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        int sum = korean + english + math;
        double average = sum / 3.0;
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
    }
}
