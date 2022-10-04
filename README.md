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
1. RandomNumberGenerator
2. InputNumberReceiver
3. JudgeResult
4. OutputResult