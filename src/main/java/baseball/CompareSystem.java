package baseball;


import static baseball.RandomNumberGenerator.NUMBER_SIZE;

public class CompareSystem {
    static int strike;
    static int ball;

    public void compare(Numbers user_numbers, Numbers random_numbers) {
        strike =0;
        ball =0;
        if(user_numbers.equals(random_numbers)) {
            strike = 3;
            return;
        }
        for(int i=0; i < NUMBER_SIZE; i++) {
            if(user_numbers.getNumber().get(i).getNumber() == random_numbers.getNumber().get(i).getNumber()) {
                strike++;
            }else {
                for(int j=0; j < NUMBER_SIZE; j++) {
                    if(i != j && user_numbers.getNumber().get(i).getNumber() == random_numbers.getNumber().get(j).getNumber()) {
                        ball++;
                    }
                }
            }
        }
    }

    public boolean print() {
        if(strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }else if(strike == 0 && ball == 0){
            System.out.println("낫띵");
        }else {
            if(ball == 0) {
                System.out.println(strike + "스트라이크");
            }
            else if(strike == 0) {
                System.out.println(ball + "볼");
            }else {
                System.out.println(strike + "스트라이크 " + ball + "볼");
            }
        }
        return strike == 3;
    }
}
