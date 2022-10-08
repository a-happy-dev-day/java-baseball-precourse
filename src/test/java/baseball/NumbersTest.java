package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class NumbersTest {

    @Test
    @DisplayName("Number 리스트 길이가 3인 경우, get 메서드로 확인")
    public void 정상() {
        //given
        String one = "1";
        String two = "2";
        String three = "3";
        List<Number> number = new ArrayList<>();
        number.add(new Number(one));
        number.add(new Number(two));
        number.add(new Number(three));

        //when
        Numbers numbers = new Numbers(number);

        //then
        Assertions.assertThat(numbers.getNumbers().get(0).getNumber()).isEqualTo(one);
        Assertions.assertThat(numbers.getNumbers().get(1).getNumber()).isEqualTo(two);
        Assertions.assertThat(numbers.getNumbers().get(2).getNumber()).isEqualTo(three);
    }

    @Test
    @DisplayName("Number 리스트의 길이가 3보다 작은 경우 IllegalArgumentException 발생")
    public void 리스트의길이가3보다작다() {
        //given
        List<Number> number = new ArrayList<>();
        number.add(new Number("1"));
        number.add(new Number("2"));

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new Numbers(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Number 리스트의 길이가 3보다 큰 경우 IllegalArgumentException 발생")
    public void 리스트의길이가3보다크다() {
        //given
        List<Number> number = new ArrayList<>();
        number.add(new Number("1"));
        number.add(new Number("2"));
        number.add(new Number("3"));
        number.add(new Number("4"));

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new Numbers(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Number 리스트에 중복이 있는 경우 IllegalArgumentException 발생")
    public void 중복() {
        //given
        List<Number> number = new ArrayList<>();
        number.add(new Number("1"));
        number.add(new Number("2"));
        number.add(new Number("2"));

        //when

        //then
        Assertions.assertThatThrownBy(() -> {
            new Numbers(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}