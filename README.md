# Rest-Security-JWT-login-project
Login with JWT &amp; Spring Security &amp; Spring boot by RESTful Style. 

## Project Spec
- java : 11
- Spring Boot : 2.7.6
- Graddle : 7.5
- jwt : 0.11.2
- h2 : 2.1.214


<br>
<hr>
<br>

## ErrorHandling
![image](https://user-images.githubusercontent.com/74396651/212683556-b48dd4f6-e1d7-41fd-8324-1e48e9240fb6.png)

![image](https://user-images.githubusercontent.com/74396651/212683179-f5e94c9a-a2ad-4f7d-b11b-60c7b58040ce.png)
- jwt 관련 에러는 Handler(Controller)가 처리해주지 못하기 때문에 ControllerAdvice에서 처리하지 못한다. 따라서 필터를 하나 더 추가해 에러를 핸들링하였다!!!

<br>
<hr>
<br>

[웹 스타일 코드](https://github.com/OOOIOOOIO/Web-Security-JWT-login-project)를 REST API 스타일로 리팩토링하였다!
