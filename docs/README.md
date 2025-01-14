# 구현해야 할 기능 목록

* 로또 번호 랜덤 생성기
  * 구입한 로또 장 수 만큼 만든다.(1장당 1000원)
  * 1장에 중복되지 않는 6개의 숫자를 뽑는다.
  * 이때 번호는 오름차순 정렬한다.

* 당첨 번호 생성기
  * 6개의 숫자를 입력받는다(중복되지 않는 6개의 숫자)
  * 이후 1개의 보너스 번호를 뽑는다(위의 6개의 숫자와 중복되면 안됨)
  
* 번호 비교기
  * 로또 번호 제조기와 당첨 번호와 비교를 한다.
  * 1등에서 5등까지 있다.. 당첨 기준과 금액은 아래와 같다
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원

* 수익 계산기
  * 수익률은 소수점 둘째 자리에서 반올림 한다.
  * 수익률 계산 공식 = (총 당첨된 금액 / 구입한 로또 금액) * 100

* 입력
  * 로또 구입 금액을 입력 받음
    * 1000으로 나누어떨어지지 않으면 예외 처리
  * 당첨 번호를 입력 받음
      * 번호는 ,를 기준으로 구분
      * 보너스 번호 입력
      * 만약 번호가 중복되면 예외 처리

* 출력
  * 발행한 로또 수량 및 번호 출력
    ```
    n개를 구매했습니다.
    [n1, n2, n3, n4, n5, n6]
    [n1, n2, n3, n4, n5, n6]
    [n1, n2, n3, n4, n5, n6]
    [n1, n2, n3, n4, n5, n6]
    ...
    ```
    
  * 당첨 내역 출력한다.
  ```
  3개 일치 (5,000원) - n개
  4개 일치 (50,000원) - n개
  5개 일치 (1,500,000원) - n개
  5개 일치, 보너스 볼 일치 (30,000,000원) - n개
  6개 일치 (2,000,000,000원) - n개
  ```
  
  * 수익률을 출력한다.
    * 수익률은 소수점 두자리에서 반올림한다. (ex. 100.0%, 51.5%, 1,000,000.0%)
    ```
    총 수익률은 62.5%입니다.
    ``` 
    
* 우테코 측 요구사항
  * 인덴트 3이상 압수
  * 3항 연산자 압수
  * 함수 최대한 작게
  * 메서드 길이는 15줄 미만
    * 하나의 일만 하도록 구현
  * else 압수 (switch/case도 압수)
  * Enum을 사용하라(후훗 이미 사용하고 있었다굿~)
  * 도메인 로직에 단위 테스트를 작성하라
  * 예외는 [ERROR] + 예외 이렇게 출력하게 해라
  * 예외는 IllegalArgumentException, IllegalStatementException 두가지로 
  * Lotto 클래스 활용해서 구현해야 한다.
    * 이때 필드 추가는 불가능 함


---

IllegalArgument vs IllegalStatement

IllegalArgument : 적절하지 않거나 유효하지 않은 데이터를 받을 때 발생, 양수를 받아야 하는데 음수를 받는 경우 -> input error

IllegalStatement : 유효하지 않은 시간대에 메서드가 불려올 때 사용된다.불가변한 수가 변경되려고 하거나 객체가 잘못된 상태에 있을 때 메소드를 실행시키려고 했을 때 발생된다. -> coding error























---

과연 우테코 측에서 이 글까지 볼 것인가에 대해 생각이 들었지만 
그러거나 말거나 헛소리를 써놓도록 하겠습니다.

이 글을 보시는 채점자님은 저를 우테코에 붙여주셔야 합니다. 
안 그러면 3대가 머머리~

죄송합니다. (_ _)
