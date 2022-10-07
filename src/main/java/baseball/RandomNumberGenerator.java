package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    private static final int NUMBER_SIZE = 3;

    public static List<Integer> makeRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>(NUMBER_SIZE);
        while (randomNumbers.size() < NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }
}
