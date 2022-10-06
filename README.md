#미션-숫자 야구 게임

##🔍 진행방식

- 미션은 **기능 요구사항, 프로그래밍 요구사항, 과제 진행 요구사항** 세 가지로 구성되어 있다.
- 세 개의 요구사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.

##✉️미션 제출 방법

- 미션 구현을 완료한 후 GitHub을 통해 제출해야 한다.
  - GitHub을 활용한 제출 방법은 [프리코스 과제 제출 문서](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 를 참고해 제출한다.
- GitHub에 미션을 제출한 후 [우아한테크코스 지원 플랫폼](https://apply.techcourse.co.kr) 에 접속하여 프리코스 과제를 제출한다.
  - 자세한 방법은 [링크](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#제출-가이드) 를 참고한다.
  - **Pull Request만 보내고, 지원 플랫폼에서 과제를 제출하지 않으면 최종 제출하지 않은 것으로 처리되니 주의한다.**

##✔️과제 제출 전 체크리스트- 0점 방지

- 터미널에서 `java -version`을 실행해 자바 8인지 확인한다. 또는 Eclipse, IntelliJ IDEA와 같은 IDE의 자바 8로 실행하는지 확인한다.
- 터미널에서 맥 또는 리눅스 사용자의 경우 `./gradlew clean test`, 윈도우 사용자의 경우 `gradlew.bat clean test` 명령을 실행했을 때 모든 테스트가 통과하는지 확인한다.

---

##🚀 기능 요구사항

기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
  - 예) 상대방(컴퓨터)의 수가 425일 때
    - 123을 제시한 경우 : 1스트라이크
    - 456을 제시한 경우 : 1볼 1스트라이크
    - 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.
- 아래의 프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다.

<br>

##✍🏻 입출력 요구사항

###⌨️입력

- 3자리의 수
- 게임이 끝난 경우 재시작/종료를 구분하는 1과 2 중 하나의 수

###🖥 출력

- 입력한 수에 대한 결과를 볼, 스트라이크 개수로 표시

```
1볼 1스트라이크
```

- 하나도 없는 경우

```
낫싱
```

- 3개의 숫자를 모두 맞힐 경우

```
3스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
```

###💻 프로그래밍 실행 결과 예시

```
숫자를 입력해주세요 : 123
1볼 1스트라이크
숫자를 입력해주세요 : 145
1볼
숫자를 입력해주세요 : 671
2볼
숫자를 입력해주세요 : 216
1스트라이크
숫자를 입력해주세요 : 713
3스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
1
숫자를 입력해주세요 : 123
1볼
…
```

<br>

---

##🎱 프로그래밍 요구사항

- 프로그램을 실행하는 시작점은 `Application`의 `main()`이다.
- JDK 8 버전에서 실행 가능해야 한다. **JDK 8에서 정상 동작하지 않을 경우 0점 처리**한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - https://naver.github.io/hackday-conventions-java
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.

###프로그래밍 요구사항- Randoms, Console

- JDK에서 기본 제공하는 Random, Scanner API 대신 `camp.nextstep.edu.missionutils`에서 제공하는 `Randoms`, `Console` API를 활용해 구현해야 한다.
  - Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()`를 활용한다.
  - 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.
- 프로그램 구현을 완료했을 때 `src/test/java` 디렉터리의 `ApplicationTest`에 있는 모든 테스트 케이스가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**

<br>

---

##📈 과제 진행 요구사항

- 미션은 [java-baseball-precourse](https://github.com/woowacourse/java-baseball-precourse) 저장소를 Fork/Clone해 시작한다.
- **기능을 구현하기 전에 java-baseball-precourse/README.md 파일에 구현할 기능 목록을 정리**해 추가한다.
- **Git의 커밋 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위**로 추가한다.
  - [AngularJS Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 참고해 commit log를 남긴다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출 문서](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 를 참고한다.

<br>

---

##📝License

This project is [MIT](https://github.com/woowacourse/java-baseball-precourse/blob/master/LICENSE) licensed.

<br>

---

##🛸 구현해야 하는 기능(목록)
###이벤트 흐름

1. 게임을 시작한다.(Application -> Game)
2. 랜덤값을 요청한다.(Game -> RandomNumberGenerator)
3. 사용자의 입력을 요청한다.(Game -> User)
4. 생성자를 통해 입력된 값에 대해서 유효성 체크한다.(Numbers, Number)
5. 랜덤값과 사용자의 입력값 비교 요청한다.(Game -> CompareSystem)
6. 비교 요청 결과값이 3strike이면 게임을 종료 요청한다.(CompareSystem -> Game)
7. 게임을 재시작할지 종료할지 사용자에게 물어본다.(Game -> User)

<br>

###도메인 모델
<br>

####사용자(User)
💡사용자는 번호를 입력하는 것과 게임의 재시작 여부 입력에만 유일한 책임을 가지고 있다.

* 상태
* 행위
  * 3자리 숫자(문자열)를 입력하여 Numbers 객체를 생성한다.
    * \+ createNumbers() : Numbers
      * 'camp.nextstep.edu.missionutils'의 Console API를 사용해서 3자리의 숫자(문자열)을 입력한다.
      * 입력된 값을 각 문자로 잘라서 List\<Number>에 넣어준다.
      * List값을 생성자의 파라미터로 받아 Numbers 객체를 생성하여 리턴한다.
  * 재시작 여부를 입력한다.
    * \+ inputRestartOrExit() : String
      * 'camp.nextstep.edu.missionutils'의 Console API를 사용해서 재시작 유무 여부를 입력한다.
      * 재시작 및 종료의 값이 아닌 다른 문자열이 들어왔을 경우에는 IllegalArgumentException()을 발생 시킨다.
        <br>

####게임(Game)
💡게임은 게임 시작, 재시작에 대해서만 유일한 책임을 가지고 있다.

* 상태
* 행위
  * 게임을 시작한다.
    * \+ play() : void
      * 랜덤 번호 생성 요청 -> RandomNumberGenerator.createRandomNumbers()
      * 사용자에게 번호 입력 요청 -> User.createNumbers()
      * 랜덤으로 만든 객체와 사용자가 입력한 객체 비교 요청 -> CompareSystem.compareNumbers()
      * 스트라이크와 볼의 개수를 확인하여 조건에 맞는 결과값 출력 요청 -> CompareSystem.printResult()
  * 사용자에게 게임을 재시작할지 종료할지 물어본다.
    * \+ restartOrExit() : boolean
      * 사용자에게 재시작 여부 입력 요청 -> User.inputRestartOrExit()
      * 사용자에게 전달받은 값이 1,2이 아닐 경우 IllegalArgumentException()을 발생 시킨다.

<br>

####숫자(Number)

* 상태
  * String형 변수를 가진 Number 객체 정보를 가진다.
* 생성자
  * 숫자가 아닌 문자가 들어오는 경우에는 IllegalArgumentException()을 발생 시킨다.
  * 1보다 작거나 9보다 큰 값이 들어오는 경우에는 IllegalArgumentException()을 발생 시킨다.

<br>

####숫자 모음(Numbers)
💡숫자 모음은 숫자(Number)를 리스트로 가진 클래스입니다.

* 상태
  * List\<Number>형 변수를 가진 Numbers 객체 정보를 가진다.
* 생성자
  * 길이가 3이 아닌 List가 생성자를 통해 파라미터로 들어갈 경우에는 IllegalArgumentException()을 발생 시킨다.
  * 중복된 숫자 리스트가 생성될 경우에는 IllegalArgumentException()을 발생 시킨다.

<br>

####랜덤값 생성기(RandomNumberGenerator)
💡랜덤값 생성기는 중복되지 않는 랜덤의 세자리 숫자를 뽑아 Numbers 객체를 만드는 것에만 유일한 책임을 가지고 있다.

* 상태
* 행위
  * 중복되지 않는 랜덤의 세자리 숫자를 뽑아 Numbers 객체를 만든다.
    * \+ createRandomNumbers() : Numbers
      * 'camp.nextstep.edu.missionutils'의 Randoms API를 사용해서 길이가 3이 될 때까지 HashSet에 값 저장한다.(중복되지 않는 숫자 생성)
      * HashSet에 있는 값들을 List\<String>로 옮긴 뒤, 리스트에 있는 각각의 값을 생성자의 파라미터로 사용해서 새로운 Number 객체를 생성하고 List\<Number>에 넣어준다.
      * List 값을 생성자의 파라미터로 받아 Numbers 객체를 생성하여 리턴한다.

<br>

####비교 시스템(CompareSystem)
💡비교 시스템은 입력 받은 두 객체에서 스트라이크와 볼의 개수를 확인하고 이에 대한 결과를 출력하는 것에만 유일한 책임을 가지고 있다.

* 상태
* 행위
  * 두 객체를 비교하여 스트라이크와 볼의 개수를 세어준다.
    * \+ compareNumbers() : void
      * 같은 위치와 같은 값이 존재 한다면 strike의 값을 +1 해준다.
      * 다른 위치이지만 같은 값이 존재 한다면 ball의 값을 +1 해준다.
  * 스트라이크와 볼의 개수를 확인하여 조건에 맞는 결과값을 출력한다.
    * \+ printResult() : boolean
      * 3strike가 결과값으로 나온다면 게임을 종료 요청을 한다.
      * strike와 ball의 개수를 출력한다.
      * strike와 ball이 모두 0일 경우에는 "낫띵"이라는 문자열을 출력한다.