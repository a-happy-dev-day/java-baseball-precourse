package baseball;

public class Game {
    static final String RESTART = "1";

    public void play(Numbers random_numbers) {
        CompareSystem compareSystem = new CompareSystem();
        User user = new User();
        Numbers user_numbers;
        boolean keepGoing = false;

        while (!keepGoing) {
            System.out.print("서로 다른 3자리 숫자를 입력해주세요. ");
            user_numbers = user.createNumbers();
            keepGoing = compareSystem.compareNumbers(user_numbers, random_numbers);
        }
    }

    public boolean restartOrExit() {
        User user = new User();
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return user.inputRestartOrExit().equals(RESTART);
    }
}