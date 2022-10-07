package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {

    @Test
    @DisplayName("컴퓨터가 가진 수가 세자리 수이어야 한다.")
    void number_size_test() {
        Computer computer = new Computer();

        assertThat(computer.getNumbers().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("컴퓨터가 가진 수가 겹치면 안된다.")
    void number_duplication_test() {

    }

    @Test
    @DisplayName("컴퓨터가 가진 수는 1~9이어야 한다.")
    void number_digit_test() {

    }
}
