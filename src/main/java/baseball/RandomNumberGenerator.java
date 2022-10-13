package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class RandomNumberGenerator {

    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;
    private static final int NUMBER_SIZE = 3;

    public Numbers createRandomNumbers() {
        List<Integer> number_list = new ArrayList<>();
        List<Number> number_object = new ArrayList<>();
        while (number_list.size() < NUMBER_SIZE) {
            int num = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (!number_list.contains(num)) {
                number_list.add(num);
                number_object.add(new Number(num));
            }
        }

        return new Numbers(number_object);
    }
}