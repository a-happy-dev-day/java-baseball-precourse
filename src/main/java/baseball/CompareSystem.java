package baseball;

public class CompareSystem {
    private int strike =0;
    private int ball =0;

    public void compare(Numbers user_numbers, Numbers random_numbers) {
        if(user_numbers.equals(random_numbers)) {
            strike =3;
            return;
        }
        int size = user_numbers.getNumber().size();
        for(int i=0; i < size; i++) {
            if(user_numbers.getNumber().get(i) == random_numbers.getNumber().get(i)) {
                strike++;
            }
            else {
                for(int j=0; j < size; j++) {
                    for(int k=0; k < size; k++) {
                        if(user_numbers.getNumber().get(j) == random_numbers.getNumber().get(k)) {
                            ball++;
                        }
                    }
                }ball -= strike;
            }
        }
    }

    public boolean print() {
        if(strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }else if(strike ==0 && ball == 0){
            System.out.println("낫띵");
        }
        else {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        }
        return strike ==3;
    }
}
