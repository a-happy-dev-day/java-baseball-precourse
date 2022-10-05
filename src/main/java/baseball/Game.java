package baseball;

public class Game {
    User user;
    RandomNumberGenerator randomNumberGenerator;
    CompareSystem compareSystem;
    Numbers random_numbers;
    Numbers user_numbers;
    final String RESTART = "1";
    final String EXIT = "2";

    public Game() {}

    public void play() {
        boolean keepGoing = false;
        while(!keepGoing) {
            System.out.println("서로 다른 3자리 숫자를 입력해주세요. ");
            random_numbers = randomNumberGenerator.requestRandomNumber();
            user_numbers = user.requestNumber();
            compareSystem.compare(user_numbers, random_numbers);
            keepGoing = compareSystem.print();
        }

    }

    public boolean checkRestartOrExit() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return user.restartOrExit().equals(RESTART);
    }
}
