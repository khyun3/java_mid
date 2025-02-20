## 문제와 풀이
### 문제 설명
* `MyDate`클래스는 불변이 아니어서 공유 참조시 사이드 이펙트가 발생한다. 이를 불변 클래스로 만들어라.
* 새로운 불변 클래스는 `ImmutableMyDate`로 이름 지으면 된다.
* 새로운 실행 클래스는 `ImmutableMyDateMain`으로 이름 지으면 된다.

### 실행 결과(기존 MyDateMain 실행결과)
```text
 date1 = 2024-1-1
 date2 = 2024-1-1
 2025 -> date1
 date1 = 2025-1-1
 date2 = 2025-1-1
```