package baseball;

import java.util.List;
import java.util.ArrayList;
import  camp.nextstep.edu.missionutils.Console;

public class User {

    public String inputRestartOrExit() {
        return Console.readLine();
    }

    public Numbers createNumbers() {
        List<Number> number = new ArrayList<>();
        for(String s : Console.readLine().split("")) {
            number.add(new Number(s));
        }
        return new Numbers(number);
    }
}
