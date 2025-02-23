## 문제7 - 공백 제거

### 문제 설명

* 문자의 양쪽 공백을 제거해라. 예) " Hello Java " "Hello Java"

```java
package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = " Hello Java ";
        // 코드 작성
    }
}
```

### 실행 결과

```
Hello Java
```

## 문제8 - replace

### 문제 설명

* replace() 를 사용해서 java 라는 단어를 jvm 으로 변경해라.

```java
package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        // 코드 작성
    }
}
```

### 실행 결과

```
hello jvm spring jpa jvm
```

## 문제9 - split()

### 문제 설명

### split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.

```java
package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
    }
}
```

### 실행 결과

```
ID: hello
Domain: example.com
```

## 문제10 - split(), join()

### 문제 설명

* split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
* 실행 결과를 참고해라.

```java
package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
    }
}
```

### 실행 결과

```
apple
banana
mango
joinedString = apple->banana->mango
```

## 문제11 - reverse()

### 문제 설명

* str 문자열을 반대로 뒤집어라.
* StringBuilder 에 있는 reverse() 를 사용해라.

```java
package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        // 코드 작성
    }
}
```

### 실행 결과

```
avaJ olleH
```