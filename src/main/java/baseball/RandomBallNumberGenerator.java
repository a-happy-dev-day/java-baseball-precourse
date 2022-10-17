package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class RandomBallNumberGenerator {

    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;
    private static final int NUMBER_SIZE = 3;

    public BallNumbers createRandomNumbers() {
        List<Integer> number_list = new ArrayList<>();
        List<BallNumber> number_object = new ArrayList<>();
        while (number_list.size() < NUMBER_SIZE) {
            int num = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (!number_list.contains(num)) {
                number_list.add(num);
                number_object.add(new BallNumber(num));
            }
        }

        return new BallNumbers(number_object);
    }
}