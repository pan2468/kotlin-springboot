# ๐ Guest-Order

###  1. ํ๋ก์ ํธ ๋ชฉ์  
+ Guest(๊ณ ๊ฐ) Order(์ฃผ๋ฌธ) ์ฐ๊ด๊ด๊ณ ์ผ๋์ผ ํตํด์ ๋งคํํ๊ธฐ
+ Kotlin & Spring API ์ค๊ณํ์ฌ ๊ตฌํํ๊ธฐ
+ REST API CRUD ๊ฐ๋ฐ ์งํํ๊ธฐ 
+ Spring Security ์ค์ ํ๊ธฐ 


###  3. ์ ์๊ธฐ๊ฐ / ์ฐธ์ฌ์ธ์
+ ์ ์๊ธฐ๊ฐ: 2022-10-13 ~ 2022-10-26 
+ ์ฐธ์ฌ์ธ์: ๊ฐ์ธ ํ๋ก์ ํธ

### 4. ์ฌ์ฉ ๊ธฐ์ (๊ธฐ์ ์คํ)
#### Back-End
+ Kotlin
+ SpringBoot 2.6.12
+ Gradle
+ MySQL
+ TDD

### 5. ๊ฐ๋ฐํ๊ฒฝ
+ InteliJ IDEA
+ Postman

### 6. MSA ์ํคํ์ฒ

<img src="https://user-images.githubusercontent.com/58936137/195647238-3f9f0210-4478-41c0-9dee-37f4223ea195.png" width="600px" height="450px">





###  8. ํธ๋ฌ๋ธ์ํ ๊ฒฝํ
<details>
<summary>ํ๋ก์ ํธ Run ์คํ ์ค๋ฅ</summary>
<div markdown="1">

- Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
- ํด๊ฒฐ ์์ธ: application.properties ์ค์  ํ์ผ์์ spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration ์ถ๊ฐํ์ฌ ๊ฐ์ 
  
</div>
</details> 

<details>
<summary>Entity ์ค๊ณ ์ค๋ฅ</summary>
<div markdown="1">

- org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
- ํด๊ฒฐ ์์ธ: SpringBoot Entity ์ค๊ณํ์ฌ Table ๋ช์ ์ง์ ํ์ฌ ์คํ > ๊ธฐ์กด DBMS Table ๋ช์ด ์กด์ฌํ๊ธฐ ๋๋ฌธ์ Error ๋ฐ์

  <img src="https://user-images.githubusercontent.com/58936137/195974174-50a700d3-0fda-4555-a685-f0bb6e6c3e37.png" width="300px" height="100px"><br>
  
  - ๊ธฐ์กด์ @Table(name=order) ๋ช์นญ์ด ๋์ด์๋๋ฐ orders ์์  ํ ๊ฐ์ 

</div>
</details> 

<details>
<summary>Spring Security ์ค์  ์ค๋ฅ</summary>
<div markdown="1">

- org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'springSecurityFilterChain' defined in class path resource 

</div>
</details>


### 9. ๊ธฐ์ ์  issue ํด๊ฒฐ ๊ณผ์ 

+ <a href="https://velog.io/@pan2468/Kotlin-Spring-REST-API-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%A7%8C%EB%93%A4%EA%B8%B0-1">ํ๋ก์ ํธ ์์ฑํ๊ธฐ</a><br>

+ <a href="https://velog.io/@pan2468/Kotlin-Spring-Entity-%EB%AA%A8%EB%8D%B8-%EC%84%A4%EA%B3%84-2">Entity ์์ฑํ๊ธฐ</a><br>

+ <a href="https://velog.io/@pan2468/Kotlin-Spring-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%BD%94%EB%93%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0">์ ์ฅ, ์กฐํ ํ์คํธ ์ฝ๋ ์์ฑํ๊ธฐ</a><br>

+ <a href="https://velog.io/@pan2468/Kotlin-Spring-%EC%88%98%EC%A0%95-%EC%82%AD%EC%A0%9C-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%BD%94%EB%93%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-4">์์ , ์ญ์  ํ์คํธ ์ฝ๋ ์์ฑํ๊ธฐ</a><br>

+ <a href="https://velog.io/@pan2468/Kotlin-Spring-REST-API-%EC%A0%80%EC%9E%A5-%EC%A1%B0%ED%9A%8C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0">REST API ์ ์ฅ, ์กฐํ </a>

+ <a href="https://velog.io/@pan2468/Kotlin-Spring-REST-API-%EC%88%98%EC%A0%95-%EC%82%AD%EC%A0%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-6">REST API ์์ , ์ญ์ </a>




