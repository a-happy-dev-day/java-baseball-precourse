# 미션 - 숫자 야구 게임

## 📝️ 구현해야 할 부분
1. 랜덤 숫자 생성
   - 랜덤으로 3개의 숫자를 생성
   - 서로 다른 1~9의 숫자가 선택되어야 한다.
2. 3개의 숫자를 입력
   - 서로 다른 3개의 숫자가 입력되지 않을 경우, `IllegalArgumentException`가 발생한다.
3. 스트라이크/볼 개수 판단, 출력
   - 스트라이크와 볼을 판단한다.
   - 스트라이크와 볼을 출력한다.
4. 입력한 수가 정답일 경우, 새로운 게임 진행 여부를 물어본다.
   - 1번을 선택하면 새로운 게임을 진행한다.
   - 2번을 선택하면 게임을 종료한다.
   - 잘못된 입력일 경우, `IllegalArgumentException`가 발생한다.

## 🖥 모델링
1. GameStater
   - `RandomNumberGenerator`을 통해 `3개의 숫자` 추출한다.
   - `InputNumberReceiver`을 통해 `3개의 숫자`를 받는다.
   - `ResultJudgement` 위에서 받은 `3개의 숫자 2세트`를 주입한다.
   - `GameQuit`에 결과를 주입하여 게임을 재시작할지 종료할지 결정한다. 

2. RandomNumberGenerator
   - 행위
     - `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()` 사용하여 Random값을 추출한다.
     - 3개의 값이 서로다른 값인지 확인한다. 

3. InputNumberReceiver
   - 행위
     - `camp.nextstep.edu.missionutils.Console`의 `readLine()` 사용하여 입력값을 저장한다. 
     - 3개의 서로다른 숫자가 올바르게 입력되었는지 검사한다.
   
4. ResultJudgement
   - 행위
     - 스트라이크, 볼 갯수를 판단한다.
     - 결과를 출력한다.

5. GameQuit
   - 행위
     - 2번이 입력될 경우 게임을 종료시킨다.