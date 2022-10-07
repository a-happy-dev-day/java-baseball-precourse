package baseball;

import java.util.List;

public class ResultJudgement {
    public boolean compareNumber(List<Integer> computer, List<Integer> user) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(user.get(i))) {
                strike++;
                continue;
            }
            for (int j = 0; j < computer.size(); j++) {
                if (i == j) continue;
                if (computer.get(i).equals(user.get(j))) ball++;
            }

        }
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (ball == 0) {
            System.out.println(strike + "스트라이크");
        } else if (strike == 0) {
            System.out.println(ball + "볼");
        } else {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }

        if (strike == 3) {
            return true;
        }
        return false;
    }
}
