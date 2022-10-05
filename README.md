# 미션 - 숫자 야구 게임

## 📝️ 이벤트 흐름
1. 랜덤생성기는 서로 다른 1 ~ 9의 랜덤 숫자 3개를 생성했다.
2. 게이머는 서로 다른 1 ~ 9의 숫자를 입력 했다.
3. 결과판독기는 스트라이크/볼을 판단했다.
4. 3개의 숫자를 모두 맞혀 종료/재시작 했다.


## 🖥 모델링
1. Game
   - 상태
     - Gamer
     - Computer
   - 행위
     - Gamer와 Computer의 값을 ResultJudgement에서 비교한다.
     - 게임을 재시작할지 종료할지 결정한다.
   
2. Gamer
   - `InputNumberReceiver`을 통해 `3개의 숫자`를 받는다.
   -  위에서 받은 `3개의 숫자 2세트`를 주입한다.

3. Computer
   - `RandomNumberGenerator`을 통해 `3개의 숫자` 추출한다.

4. RandomNumberGenerator
   - 행위
     - `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()` 사용하여 Random값을 추출한다.
     - 3개의 값이 서로다른 값인지 확인한다. 

5. InputNumberReceiver
   - 행위
     - `camp.nextstep.edu.missionutils.Console`의 `readLine()` 사용하여 입력값을 저장한다. 
     - 3개의 서로다른 숫자가 올바르게 입력되었는지 검사한다.
   
6. ResultJudgement
   - 행위
     - 스트라이크, 볼 갯수를 판단한다.
     - 결과를 출력한다.

7. GameQuit
   - 행위
     - 2번이 입력될 경우 게임을 종료시킨다.