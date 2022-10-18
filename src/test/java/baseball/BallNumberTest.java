package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BallNumberTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9"})
    @DisplayName("1-9까지의 정상적인 값이 들어갈 때, get 메서드로 확인")
    public void 정상(String str) {
        //given

        //when
        BallNumber ballNumber = new BallNumber(str);

        //then
        Assertions.assertThat(ballNumber.getNumber()).isEqualTo(str);
    }


    @ParameterizedTest
    @ValueSource(strings = {"a", "A", "ㄱ", "ㅏ", "-", "!", "@", "?"})
    @DisplayName("문자가 정수가 아닌 문자인 경우 IllegalArgumentException 발생")
    public void 문자(String str) {
        //given

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumber(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("문자가 1보다 작은 경우 IllegalArgumentException 발생")
    public void 숫자가0이다() {
        //given
        String str = "0";

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumber(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "-10", "-100"})
    public void 숫자가음수다(String str) {
        //given

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumber(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"10", "11", "100", "1000", "10000"})
    @DisplayName("문자가 9 보다 큰 경우 IllegalArgumentException 발생")
    public void 숫자가9이상이다(String str) {
        //given

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumber(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}