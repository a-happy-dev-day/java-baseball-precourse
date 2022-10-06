package baseball;

import java.util.List;
import java.util.ArrayList;
import  camp.nextstep.edu.missionutils.Console;
public class User {

    public String restartOrExit() {
        return Console.readLine();
    }

    public Numbers requestNumber() {
        List<Number> number = new ArrayList<>();
        for(String s : Console.readLine().split("")) {
            number.add(new Number(Integer.parseInt(s)));
        }
        return new Numbers(number);
    }
}
