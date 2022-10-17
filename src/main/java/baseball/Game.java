package baseball;

public class Game {
    static final String RESTART = "1";

    public void play(BallNumbers random_numbers) {
        User user = new User();
        MatchResult matchResult = new MatchResult();
        BallNumbers user_numbers;
        boolean keepGoing = false;

        while (!keepGoing) {
            System.out.print("서로 다른 3자리 숫자를 입력해주세요. ");
            user_numbers = user.createNumbers();
            matchResult.compareNumbers(user_numbers, random_numbers);
            System.out.println(matchResult.printResult());
            keepGoing = matchResult.regameOrStop();
        }
    }

    public boolean restartOrExit() {
        User user = new User();
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return user.inputRestartOrExit().equals(RESTART);
    }
}