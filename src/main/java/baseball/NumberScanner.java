package baseball;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class NumberScanner {
    private static final int NUMBER_SIZE = 3;

    //TODO: 경고처리 (console을 close해야하는 것 같음)
    public static List<Integer> inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String numberString = readLine();
        //TODO: 예외처리
        validateInputNumber(numberString);

        return convertStringToList(numberString);
    }

    private static void validateInputNumber(String numberString) {
        if (numberString.length() != NUMBER_SIZE) {
            throw new IllegalArgumentException(NUMBER_SIZE + "자리 수를 입력해주세요.");
        } else if (validateDigit(numberString)) {
            throw new IllegalArgumentException("1~9의 정수를 입력해주세요.");
        } else if (validateDuplicateNum(numberString)) {
            throw new IllegalArgumentException("서로 다른 수를 입력해주세요.");
        }
    }

    private static boolean validateDigit(String numberString) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if ((int) numberString.charAt(i) < (int) '1' || ((int) '9' < (int) numberString.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean validateDuplicateNum(String numberString) {
        Set<Character> numberSet = new HashSet<>(NUMBER_SIZE);
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (!numberSet.contains(numberString.charAt(i))) {
                numberSet.add(numberString.charAt(i));
            } else {
                return true;
            }
        }
        return false;
    }

    private static List<Integer> convertStringToList(String numberString) {
        return Arrays.stream(numberString.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

}
