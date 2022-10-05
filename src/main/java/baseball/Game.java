package baseball;

public class Game {
    private User user = new User();
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private CompareSystem compareSystem = new CompareSystem();
    private Numbers random_numbers;
    private Numbers user_numbers;
    static final String RESTART = "1";
    static final String EXIT = "2";

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
        String checkResult = user.restartOrExit();
        if(!(checkResult.equals(RESTART) || checkResult.equals(EXIT))) {
            throw new IllegalArgumentException();
        }
        return checkResult.equals(RESTART);
    }
}