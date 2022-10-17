package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BallNumbersTest {

    @Test
    @DisplayName("BallNumber 리스트 길이가 3인 경우, get 메서드로 확인")
    public void 정상() {
        //given
        String one = "1";
        String two = "2";
        String three = "3";
        List<BallNumber> number = new ArrayList<>();
        number.add(new BallNumber(one));
        number.add(new BallNumber(two));
        number.add(new BallNumber(three));

        //when
        BallNumbers ballNumbers = new BallNumbers(number);

        //then
        Assertions.assertThat(ballNumbers.getNumbers().get(0).getNumber()).isEqualTo(one);
        Assertions.assertThat(ballNumbers.getNumbers().get(1).getNumber()).isEqualTo(two);
        Assertions.assertThat(ballNumbers.getNumbers().get(2).getNumber()).isEqualTo(three);
    }

    @Test
    @DisplayName("BallNumber 리스트의 길이가 3보다 작은 경우 IllegalArgumentException 발생")
    public void 리스트의길이가3보다작다() {
        //given
        List<BallNumber> number = new ArrayList<>();
        number.add(new BallNumber("1"));
        number.add(new BallNumber("2"));

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumbers(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("BallNumber 리스트의 길이가 3보다 큰 경우 IllegalArgumentException 발생")
    public void 리스트의길이가3보다크다() {
        //given
        List<BallNumber> number = new ArrayList<>();
        number.add(new BallNumber("1"));
        number.add(new BallNumber("2"));
        number.add(new BallNumber("3"));
        number.add(new BallNumber("4"));

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumbers(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("BallNumber 리스트에 중복이 있는 경우 IllegalArgumentException 발생")
    public void 중복() {
        //given
        List<BallNumber> number = new ArrayList<>();
        number.add(new BallNumber("1"));
        number.add(new BallNumber("2"));
        number.add(new BallNumber("2"));

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new BallNumbers(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}