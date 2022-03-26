# refactoring-2022
- 3/19, 3/26 Refactoring from edu.kosta.or.kr

<br><br>

# 1일차 요약

1. 리팩토링 개념
- 개발자가 익혀야할 필수적인 습관이다.
- 코드의 가독성, 유지보수성을 향상시킨다.
- 소스코드를 읽기쉽게 청소하는 활동이다.

2. 리팩토링 대상
- 중복되는 코드
- 여기저기 산재 되어 있는 코드
- 막연한 범용 코드

3. 클린 코드 작성 원칙
- 중복을 최소화하여 작성
- 읽기 쉽게 쉬운 용어 사용하여 작성
- 클래스나 메소드를 가능한 간단하게 작성

4. 클래스의 작성 기준
- 가능한 클래스를 작게 분할하여 작성
- 적절한 상속을 통해 클래스 구조화
- 잦은 변경이 발생되는 부분은 분리

5. TDD 방식으로 개발할 때 얻을 수 있는 효과 (ㅠ)
- 개발할 요건을 테스트 코드로 먼저 구체화
- 테스트 코드 통해 안전성이 높은 코드 작성 가능
- 테스트 코드 통해 개발 목표, 대상 분명화

6. 리팩토링 기법 중 메소드 정리
- 메소드 추출
- 메소드 내용 직접 삽입
- 임시 변수 분리

7. 리팩토링 기법 중 메소드 호출 단순화 (ㅠ)
- 메소드명 변경
- 메소드를 매개변수로 전환
- 매개변수 추가/삭제

8. 리팩토링 기법 중 조건문 간결화 (ㅠ)
- 조건문 쪼개기
- 중복 조건식 통합
- 여러 겹의 조건문을 감시절로 전환

<br><br>

# 1일차 실습
1. code.refactoring.junit
2. code.tdd.example과 code.tdd.mock
3. code.refactoring.methodarray1
4. code.refactoring.methodsimple1 => 재확인 필요
5. code.refactoring.methodarray2
6. code.refactoring.methodarray3
7. code.refactoring.methodarray4 => 재확인 필요
8. code.refactoring.methodsimple2
9. code.refactoring.methodsimple3
10. code.refactoring.methodsimple4 => 재확인 필요
11. code.refactoring.methodsimple7
12. code.refactoring.conditionsimple1
13. code.refactoring.conditionsimple3

<br><br>

# 2일차 요약

1. 객체지향 설계 원칙
- 단일 책임원칙 SRP
- 적절한 상속(다향성) LSP
- 느슨한 결합을 유지 ISP

2. 리팩토링 기법 중 객체 구조화 기법 (ㅠ)
- 클래스 추출 Extract Class
- 클래스 내용 직접삽입 Inline Class
- 대리객체 은혜 Hide Delegate

3. 리팩토링 기법 중 일반화 처리
- 인터페이스 추출 Extract Interface
- 필드 하향 Pull Down Field / 메소드 하향 Pull Down Method
- 템플릿 메소드 형성 Form Template Method

4. 리팩토링 기법 중 데이터 구조화 (ㅠ)
- 필드 캡슐화 Encapsulate Field
- 데이터 값을 객체로 전환 Replace Data Value with Object
- 배열을 객체로 전환 Replace Array with Object

5.

6. 리팩토링 수행 시 체크해야 하는 사항
- 중복된 코드가 없는지 확인
- 소스 코드의 가독성이 좋은지 확인
- 클래스, 메소드 중 분할, 통합할 내용이 없는지 확인

7. 리팩토링 수행 시점
- 개발 중에 틈틈히
- 버그가 발생되거나 프로그램에 문제점이 파악될 때 수행
- 프로그램을 추가, 수정할 때마다 조금씩 수행

<br><br>

# 2일차 실습
14. code.refactoring.classmove1
15. code.refactoring.classmove2
16. code.refactoring.classmove3
17. code.refactoring.methodarrange6
18. code.refactoring.classmove4
19. code.refactoring.complex2 => 확인 필요
20. code.refactoring.general1
21. code.refactoring.general2
22. code.refactoring.general3
23. code.refactoring.conditionsimple4
24. code.refactoring.dataarrange9
25. code.refactoring.general4 => 확인 필요
26. code.refactoring.classmove5
27. code.refactoring.complex4 => 놓침
28. code.refactoring.general6 => 확인 필요
29. code.refactoring.dataarrange6 ⇒ 확인 필요
30. code.refactoring.methodsimple5
31. code.refactoring.dataarrange5
32. code.refactoring.complex3 => 확인 필요, 1), (2), (3), (4), (5) 확인필요
