package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class RandomNumberGenerator {
    static HashSet<String> hash = new HashSet<>();
    static final int MAX_NUMBER = 9;
    static final int MIN_NUMBER = 1;
    static final int NUMBER_SIZE = 3;

    public Numbers createRandomNumbers() {
        ArrayList<Number> number = new ArrayList<>();

        while(hash.size() != NUMBER_SIZE) {
            hash.add(String.valueOf(String.valueOf(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER))));
        }
        List<String> list = new ArrayList<>(hash);
        for(String l : list) {
            number.add(new Number(l));
        }
        return new Numbers(number);
    }
}