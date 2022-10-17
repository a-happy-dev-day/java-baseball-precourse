package baseball;

public class MatchResult {
    private static final int NUMBER_SIZE = 3;
    private int strike;
    private int ball;

    public MatchResult compareNumbers(BallNumbers user_numbers, BallNumbers random_numbers) {
        strike = 0;
        ball = 0;

        for (int i = 0; i < NUMBER_SIZE; i++) {
            for (int j = 0; j < NUMBER_SIZE; j++) {
                if (user_numbers.getNumbers().get(i).getNumber().equals(random_numbers.getNumbers().get(j).getNumber())) {
                    if (i == j) strike++;
                    else ball++;
                }
            }
        }

        return this;
    }

    public String printResult() {
        StringBuilder sb = new StringBuilder();
        if (this.strike == 3) {
            sb.append("3스트라이크\n");
            sb.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else if (this.strike == 0 && this.ball == 0) {
            sb.append("낫띵");
        } else {
            if (this.strike > 0) {
                sb.append(strike + "스트라이크 ");
            }
            if (this.ball > 0) {
                sb.append(ball + "볼");
            }
        }
        return String.valueOf(sb);
    }

    public boolean regameOrStop() {
        return this.strike == 3;
    }
}

