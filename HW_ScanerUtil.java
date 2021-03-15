package day0315;

import util.ScannerUtil;
import java.util.Random;
import java.util.Scanner;

public class HW_ScanerUtil {

    static final int NUMBER_SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] computerArray = new int[NUMBER_SIZE];

        int index = 0;

        while (index < NUMBER_SIZE) {

            int randomNumber = random.nextInt(NUMBER_MAX) + 1;

            boolean inputSwitch = true;

            for (int i = 0; i < computerArray.length; i++) {
                if (randomNumber == computerArray[i]) {
                    inputSwitch = false;
                    break;
                }

            }

            if (inputSwitch) {
                computerArray[index] = randomNumber;
                index++;
            }
        }

        int userGameSize = ScannerUtil.nextInt(scanner, "몇번 플레이 하시겠습니까?");

        int[][] userArray = new int[userGameSize][NUMBER_SIZE];

        for (int i = 0; i < userArray.length; i++) {

            int userChoice = ScannerUtil.nextInt(scanner,
                    "================" + (i + 1) + "번 게임==============\n 1.수동  2. 자동");

            index = 0;

            if (userChoice == 1) {

                while (index < userArray[i].length) {

                    int userNumber = ScannerUtil.nextInt(scanner, (index + 1) + "번 숫자를 입력해주세요.", NUMBER_MIN,
                            NUMBER_MAX);

                    boolean inputSwitch = true;

                    for (int j = 0; j < userArray[i].length; j++) {
                        if (userNumber == userArray[i][j]) {
                            inputSwitch = false;
                            break;
                        }
                    }
                    if (inputSwitch) {
                        userArray[i][index] = userNumber;
                        index++;
                    } else {
                        System.out.println("잘못된 숫자입니다.");
                        System.out.println("다시 입력해주세요.");

                    }

                }
            } else {

                while (index < NUMBER_SIZE) {

                    int randomNumber = random.nextInt(NUMBER_MAX) + 1;

                    boolean inputSwitch = true;

                    for (int j = 0; j < userArray[i].length; j++) {
                        if (randomNumber == userArray[i][j]) {
                            inputSwitch = false;
                            break;
                        }

                    }

                    if (inputSwitch) {
                        userArray[i][index] = randomNumber;
                        index++;
                    }
                }

            }
        }

        for (int i = 0; i < computerArray.length - 1; i++) {
            if (computerArray[i] > computerArray[i + 1]) {
                int temp = computerArray[i];
                computerArray[i] = computerArray[i + 1];
                computerArray[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length - 1; j++) {
                if (userArray[i][j] > userArray[i][j + 1]) {
                    int temp = userArray[i][j];
                    userArray[i][j] = userArray[i][j + 1];
                    userArray[i][j + 1] = temp;
                    j = -1;
                }
            }
        }

        System.out.printf("컴퓨터의 숫자: [%02d, %02d, %02d, %02d, %02d, %02d]\n", computerArray[0], computerArray[1],
                computerArray[2], computerArray[3], computerArray[4], computerArray[5]);

        for (int i = 0; i < userArray.length; i++) {

            int count = 0;
            for (int j = 0; j < userArray[i].length; j++) {
                for (int k = 0; k < computerArray.length; k++) {
                    if (userArray[i][j] == computerArray[k]) {
                        count++;
                    }
                }
            }

            System.out.printf("게임 %2d번: [%2d, %2d, %2d, %2d, %2d, %2d ] 맞춘갯수: %2d개,", i + 1, userArray[i][0],
                    userArray[i][1], userArray[i][2], userArray[i][3], userArray[i][4], userArray[i][5], count);
            if (count >= 2) {
                System.out.println("등수: " + (NUMBER_SIZE - count + 1) + "등");
            } else {
                System.out.println("등수: 등수없음");
            }

        }

        scanner.close();
    }

}
