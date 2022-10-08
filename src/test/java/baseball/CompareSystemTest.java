package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CompareSystemTest {

    @Test
    @DisplayName("두 객체의 인덱스와 값이 모두 같을 경우")
    public void 전부다같다() {
        //given
        CompareSystem compareSystem = new CompareSystem();

        //when
        Numbers nums1 = new Numbers(Arrays.asList(new Number("1"), new Number("2"), new Number("3")));

        //then
        Assertions.assertThat(compareSystem.compareNumbers(nums1, nums1)).isTrue();
    }

    @Test
    @DisplayName("두 객체의 인덱스와 값이 모두 같지 않을 경우")
    public void 인덱스와값이모두같지않을경우() {
        //given
        CompareSystem compareSystem = new CompareSystem();

        //when
        Numbers nums1 = new Numbers(Arrays.asList(new Number("1"), new Number("2"), new Number("3")));
        Numbers nums2 = new Numbers(Arrays.asList(new Number("1"), new Number("2"), new Number("4")));

        //then
        Assertions.assertThat(compareSystem.compareNumbers(nums1, nums2)).isFalse();
    }
}