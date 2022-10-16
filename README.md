# 📌 Guest-Order

###  1. 프로젝트 목적 
+ Guest(고객) Order(주문) 연관관계 일대일 통해서 매핑하기
+ Kotlin & Spring API 설계하여 구현하기
+ REST API CRUD 개발 진행하기 


###  3. 제작기간 / 참여인원
+ 제작기간: 2022-10-13 ~ 진행중
+ 참여인원: 개인 프로젝트

### 4. 사용 기술(기술스택)
#### Back-End
+ kotlin
+ SpringBoot 2.6.12
+ Gradle
+ MySQL
+ TDD

### 5. 개발환경
+ InteliJ IDEA
+ Postman

### 6. MSA 아키텍처

<img src="https://user-images.githubusercontent.com/58936137/195647238-3f9f0210-4478-41c0-9dee-37f4223ea195.png" width="600px" height="450px">



###  7. 핵심트러블슈팅 경험

###  8. 트러블슈팅 경험
<details>
<summary>프로젝트 Run 실행 오류</summary>
<div markdown="1">

- Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
- 해결 원인: application.properties 설정 파일에서 spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration 추가하여 개선
  
</div>
</details> 

<details>
<summary>Entity 설계 오류</summary>
<div markdown="1">

- org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
- 해결 원인: SpringBoot Entity 설계하여 Table 명을 지정하여 실행 > 기존 DBMS Table 명이 존재하기 때문에 Error 발생

  <img src="https://user-images.githubusercontent.com/58936137/195974174-50a700d3-0fda-4555-a685-f0bb6e6c3e37.png" width="300px" height="100px"><br>
  
  - 기존에 @Table(name=order) 명칭이 되어있는데 orders 수정 후 개선

</div>
</details> 


### 9. 기술적 issue 해결 과정
+ 프로젝트 생성하기<br> 
https://velog.io/@pan2468/Kotlin-Spring-REST-API-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%A7%8C%EB%93%A4%EA%B8%B0-1

+ Entity Order 생성하기<br>








