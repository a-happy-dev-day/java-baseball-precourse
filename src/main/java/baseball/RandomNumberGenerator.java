package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class RandomNumberGenerator {
    static HashSet<Integer> hash = new HashSet<>();
    static final int MAX_NUMBER = 9;
    static final int MIN_NUMBER = 1;
    static final int NUMBER_SIZE = 3;

    public Numbers requestRandomNumber() {
        while(hash.size() != NUMBER_SIZE) {
            hash.add(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
        }
        List<Integer> list = new ArrayList<>(hash);
        ArrayList<Number> number = new ArrayList<>();
        for(int l : list) {
            number.add(new Number(l));
        }
        return new Numbers(number);
    }
}