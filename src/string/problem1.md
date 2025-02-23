## 문제1

### 문제 설명 - startWith()

* `startsWith()`를 사용해서 `url`이 `https://`로 시작하는지 확인해라.

```java
public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        //코드 작성
    }
}

```

### 실행결과

```
true
```

## 문제2 - length()

### 문제 설명

`length()`를 사용해서`arr`배열에 들어있는 모든 문자열의 길이 합을 구해라.
실행 결과에 맞도록 출력하자.

```java
 public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
    }
}
```

### 실행 결과

```
 hello:5
 java:4
 jvm:3
 spring:6
 jpa:3
 sum = 2
```

## 문제 3 - indexOf()

### 문제 설명

* str 에서 ".txt" 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라. indexOf() 를 사용해라.

```java
package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // 코드 작성
    }
}
```

### 실행 결과

```
index = 5
```

## 문제4 - substring()

### 문제 설명

* substring() 을 사용해서, hello 부분과 .txt 부분을 분리해라.
* 단순하게 substring() 에 숫자를 직접 입력해서 문제를 풀면 된다.

```java
package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        // 코드 작성
    }
}
```

### 실행 결과

```
filename = hello
extName = .txt
```

## 문제5 - indexOf, substring 조합

### 문제 설명

* str 에는 파일의 이름과 확장자가 주어진다. ext 에는 파일의 확장자가 주어진다.
* 파일명과 확장자를 분리해서 출력하라.
* indexOf() 와 substring() 을 사용해서 문제를 풀면 된다.

```java
package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
    }
}
```

### 실행 결과

```
filename = hello
extName = .txt
```

## 문제6 - 검색 count

### 문제 설명
* str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
* indexOf() 를 반복문과 함께 풀면 된다.

```java
package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
    }
}
```

### 실행 결과
```
count = 3
```