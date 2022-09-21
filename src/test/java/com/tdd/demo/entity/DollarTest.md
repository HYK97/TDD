# 테스트목록 읽는법
- **현재 진행중인 부분 굵게(Bold)** <br>
- ~~완료된것 취소선~~


# Dollar 테스트에서 해야할 것들
- $5 + 10 CHF = $10 환율 2:1일경우 즉 서로다른 통화의 합을 환율에 맞춰서 계산하는것
   - ~~5CHF x2 =10CHF 1단계를 작은 단위로 분리~~
   - **$5 + $5 =$10**
- ~~$5 x 2 = $10 주가 곱하기 개수는 주가의 전체 개수를 확인~~
- ~~amount 필드를 private 로 만들기~~
- ~~Dollar의 부작용 (sideEffects) -> 어떤것들이 있을지?~~
- Money의 반올림
- ~~equals()~~
- hashCode()
- Equal null
- Equal object
- ~~Dollar/Franc 중복 제거~~
- ~~공용 equals~~
- ~~공용 tiems~~
- ~~Franc 과 Dollar 비교하기~~
- ~~통화?~~
- ~~testFrancMultiplication 를 지워야될지~~