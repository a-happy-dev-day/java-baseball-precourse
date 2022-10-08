package baseball;


public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        //TODO: 숫자 야구 게임 구현
        do {
            Numbers random_numbers = randomNumberGenerator.createRandomNumbers();
            System.out.print("숫자 야구 게임을 시작합니다. ");
            game.play(random_numbers);
        } while (game.restartOrExit());
    }
}