package baseball;

public class Game {
    static final String RESTART = "1";
    static final String EXIT = "2";

    public void play() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        CompareSystem compareSystem = new CompareSystem();
        User user = new User();
        Numbers random_numbers;
        Numbers user_numbers;
        boolean keepGoing = false;

        while(!keepGoing) {
            System.out.print("서로 다른 3자리 숫자를 입력해주세요. ");
            random_numbers = randomNumberGenerator.createRandomNumbers();
            user_numbers = user.createNumbers();
            compareSystem.compareNumbers(user_numbers, random_numbers);
            keepGoing = compareSystem.printResult();
        }
    }

    public boolean restartOrExit() {
        User user = new User();

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String checkResult = user.inputRestartOrExit();
        if(!(checkResult.equals(RESTART) || checkResult.equals(EXIT))) {
            throw new IllegalArgumentException();
        }
        return checkResult.equals(RESTART);
    }
}