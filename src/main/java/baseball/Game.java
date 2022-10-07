package baseball;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Game {
    private Computer computer = new Computer();
    private User user = new User();
    private ResultJudgement resultJudgement = new ResultJudgement();

    List<Integer> computerNumbers;
    List<Integer> userNumbers;

    protected void start() {
        computerNumbers = computer.getNumbers();
        while (true) {
            System.out.println(computerNumbers);
            userNumbers = user.getNumbers();

            if (resultJudgement.compareNumber(computerNumbers, userNumbers)) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        }
    }

}
