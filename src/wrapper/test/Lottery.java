package wrapper.test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {
    public static void main(String[] args) {
        //로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
        int[] lotteryNumbers = new int[6];

        //1. 배열을 사용한 방법
        fillLotteryNumbers(lotteryNumbers);
        print(lotteryNumbers);

        //2. 재귀적인 방법
        fillLotteryNumbers(0, lotteryNumbers);
        print(lotteryNumbers);

        //3. Set 자료구조를 이용한 방법
        lotteryNumbers = fillLotteryNumbers();
        print(lotteryNumbers);
    }
    //1. 배열을 사용한 방법
    static void fillLotteryNumbers(int[] lotteryNumbers) {
        Random random = new Random();
        int index = 0;
        while(index < 6) {
            int lotteryNumber = random.nextInt(1, 46);
            if(!isDuplicate(lotteryNumber, index, lotteryNumbers)) {
                lotteryNumbers[index] = lotteryNumber;
                index++;
            }
        }
    }
    //2. 재귀적인 방법
    static void fillLotteryNumbers(int currentIndex, int[] lotteryNumbers) {
        Random random = new Random();
        //basis
        if (currentIndex == 6) {
            return;
        }
        int randomNumber = random.nextInt(1, 46);
        lotteryNumbers[currentIndex] = randomNumber;
        if (isDuplicate(randomNumber, currentIndex, lotteryNumbers)) {
            fillLotteryNumbers(currentIndex, lotteryNumbers);
        } else {
            fillLotteryNumbers(currentIndex + 1, lotteryNumbers);
        }
    }

    static boolean isDuplicate(int randomNumber, int lastIndex, int[] lotteryNumbers) {
        for (int i = 0; i < lastIndex; i++) {
            if (lotteryNumbers[i] == randomNumber) {
                return true;
            }
        }
        return false;
    }

    //3. Set 자료구조를 이용한 방법
    static int[] fillLotteryNumbers() {
        int[] lotteryNumbers = new int[6];
        Set<Integer> lotteryNumberSet = new HashSet<>();
        Random random = new Random();

        int idx = 0;
        while (lotteryNumberSet.size() < 6) {
            int lotteryNumber = random.nextInt(1, 46);
            if (lotteryNumberSet.add(lotteryNumber)) {
                lotteryNumbers[idx++] = lotteryNumber;
            }
        }
        return lotteryNumbers;
    }

    static void print(int[] lotteryNumbers) {
        StringBuilder sb = new StringBuilder("로또 번호: ");
        for (int lotteryNumber : lotteryNumbers) {
            sb.append(lotteryNumber).append(" ");
        }
        System.out.println(sb);
    }
}
