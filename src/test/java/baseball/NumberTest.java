package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    @DisplayName("1-9까지의 정상적인 값이 들어갈 때, get 메서드로 확인")
    public void 정상() {
        //given
        String str = "5";

        //when
        Number number = new Number(str);

        //then
        Assertions.assertThat(number.getNumber()).isEqualTo(str);
    }

    @Test
    @DisplayName("문자가 정수가 아닌 문자인 경우 IllegalArgumentException 발생")
    public void 문자() {
        //given
        String str = "a";

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new Number(str);
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
            new Number(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("문자가 음수인 경우 IllegalArgumentException 발생")
    public void 숫자가음수다() {
        //given
        String str = "-1";

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new Number(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("문자가 9 보다 큰 경우 IllegalArgumentException 발생")
    public void 숫자가두자리수() {
        //given
        String str = "10";

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new Number(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}