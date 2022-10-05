package baseball;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();

        //TODO: 숫자 야구 게임 구현
        do {
            System.out.println("숫자 야구 게임을 시작합니다. 서로 다른 3자리 숫자를 입력해주세요. ");
            game.play();
        } while(game.checkRestartOrExit());
    }
}
