package baseball;

import static baseball.RandomNumberGenerator.NUMBER_SIZE;

public class CompareSystem {

    public boolean compareNumbers(Numbers user_numbers, Numbers random_numbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < NUMBER_SIZE; i++) {
            for (int j = 0; j < NUMBER_SIZE; j++) {
                if (user_numbers.getNumbers().get(i).getNumber().equals(random_numbers.getNumbers().get(j).getNumber())) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        if (strike == 3) {
            return true;
        }
        printResult(strike, ball);
        return false;
    }

    private void printResult(int strike, int ball) {
        StringBuilder sb = new StringBuilder();
        if (strike == 3) {
            sb.append("3스트라이크\n");
            sb.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else if (strike == 0 && ball == 0) {
            sb.append("낫띵");
        } else {
            if (strike > 0) {
                sb.append(strike + "스트라이크 ");
            }
            if (ball > 0) {
                sb.append(ball + "볼");
            }
        }
        System.out.println(sb);
    }
}
