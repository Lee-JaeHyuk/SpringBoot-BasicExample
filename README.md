# SpringBoot-BasicExample
##스프링을 시작하는 HelloWorldController 만들기

### **1. 프로젝트 소개**

- 처음 스프링 부트 프로젝트를 진행하며 local port 8080 에 Hello World를 띄우는 기본 예제이다.  

- main - Java - package - controller 라는 패키지를 생성했다.  

- 생성된 패키지 내 컨트롤러 하나를 만든다.  

- 만든 컨트롤러에 RestController 어노테이션을 달고 코딩을 진행한다.  

- 마지막으로 RequestMapping("/(자신이 원하는 주소)") 를 입력한다.  

<br/><br/>

#### **주의 사항**  

1. 8080 prot가 이미 사용중이라는 에러가 나올 수 있다.  
- 이미 8080 port가 사용중 이라면 cmd 창을 연다.  
- netstat -a -o 를 커멘트창에 입력하여 현재 실행중인 포트와 프로세스 pid를 찾는다.  
- taskkill /f /pid (pidnumber) 를 입력하여 프로세스를 kill 한다.  


<br/><br/>


### **2. 프로젝트 개발 환경**

S/W 개발 환경
* - OS : Window 10
* - IDE : IntelliJ IDEA 2020.3.2
* - Language : Java

<br/><br/>

### **3. Intellij IDEA review**

  
















