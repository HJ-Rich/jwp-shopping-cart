# 장바구니

장바구니 미션 저장소

## ✏️ Code Review Process

[텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# 기능 요구사항 및 사용자 시나리오

## 기능 요구사항

### 액세스 토큰 발급 기능

- [x] JWT를 활용해서 인증 인가한다.

### 공통 기능

- [x] 액세스 토큰이 유효한 토큰인지 확인한다. (만료된 경우, 인증이 안되는 경우)
- [x] 엑세스 토큰으로 사용자를 확인한다.

`예외`

- [x] 존재하지 않는 회원일 경우 - **400**
- [x] 인가되지 않은 요청일 경우 - **401**

### 회원가입 기능

- [x] 이름, 이메일, 비밀번호를 입력받는다.
- [x] 이미 존재하는 이메일인지 확인한다.
- [x] 비밀번호는 암호화해서 저장한다.
- [x] 비밀번호가 8자 이상인지 검증한다.

`예외`

- [x] 이름, 이메일, 비밀번호가 입력되지 않은 경우 - **400**
- [x] 이메일이 이미 존재하는 경우 - **400**
- [ ] 이메일 형식이 맞지 않는 경우 - **400**
- [x] 비밀번호 길이가 8자 미만인 경우 - **400**

### 로그인 기능

- [x] 이메일, 비밀번호를 입력받는다.
- [x] 입력된 비밀번호가 암호화된 비밀번호와 일치하는지 확인한다.
- [x] 일치한 경우 액세스 토큰을 반환한다.

`예외`

- [x] 이메일, 비밀번호가 입력되지 않은 경우 - **400**
- [x] 이메일이 존재하지 않는 경우 - **400**
- [x] 비밀번호가 일치하지 않는 경우 - **400**

### 회원 수정 기능

- [x] 변경할 이름과 비밀번호를 입력받는다.
- [x] 사용자의 이름과 비밀번호 정보를 수정한다.

`예외`

- [x] 변경된 정보만 넘어오는지 논의해봐야 함

### 회원 조회 기능

- [x] 회원 정보를 확인한다.

`예외`

- [x] 존재하지 않는 회원일 경우 - **404**

### 회원 삭제 기능

- [x] 비밀번호를 입력받는다.
- [x] 비밀번호가 일치할 경우 회원 정보를 삭제한다.

`예외`

- [x] 비밀번호가 일치하지 않는 경우 - **400**

## 사용자 시나리오

### Feature: 회원 관리 기능

```
Scenario:회원을 등록한다.
        when 이름,이메일,비밀번호를 입력해서 회원 등록 요청한다.
        then 회원이 성공적으로 가입된다.
```

```
Scenario:로그인을 한다.
        given 회원을 등록한다.
        when 이메일,비밀번호를 입력해서 로그인 요청을 한다.
        then 로그인이 성공적으로 된다.
```

```
Scenario:회원 정보를 수정한다.
        given 회원을 등록한다.
        when 변경할 이메일,비밀번호를 입력해서 회원 수정을 요청한다.
        then 회원 정보가 성공적으로 변경된다.
```

```
Scenario:회원 정보를 조회한다.
        given 회원을 등록한다.
        when 등록된 회원을 조회 요청한다.
        then 조회 요청에 성공한다.
        and 회원 이름과 이메일을 확인할 수 있다.
```

```
Scenario:회원을 삭제한다.
        given 회원을 등록한다.
        when 비밀번호를 입력해서 회원삭제 요청을 한다.
        then 회원 정보가 성공적으로 삭제된다. 
```

