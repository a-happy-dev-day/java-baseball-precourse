package baseball;

import java.util.HashSet;
import static baseball.RandomNumberGenerator.hash;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();

        //TODO: 숫자 야구 게임 구현
        do {
            System.out.print("숫자 야구 게임을 시작합니다. ");
            game.play();
            hash = new HashSet<>();
        } while(game.checkRestartOrExit());
    }
}