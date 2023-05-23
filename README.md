<프로젝트 초기 셋팅 및 공지사항>

#### 1. 프로젝트 작명 형식 통일

  - 패키지, 폴더명 : 소문자 <br>
     ex) user, free 등
  - 자바클래스 : 파스칼 <br>
     ex) UserName, TestFile 등
  - 메서드, 변수 : 카멜 <br>
     ex) freeBoard, myNameIsWonbin 등
  - html,css,js, 템플릿 : 스네이크 <br>
     ex) user_login, user_logout 등

#### 2. Restful 개발

  - http 메서드 구분 : Get, Post, Update, Delete 구분하여 명시
  - 객체명 URI 포함 시 복수로 명시 <br>
  ex) <br>
    @GetMapping("/users") <br>
    public String saveUser(){} 
  - 명사형으로 URI 명시
  - 그 외 부분들은 각 자 알아서

#### 3. 설치된 라이브러리 목록 

![KakaoTalk_20230518_183734910](https://github.com/WonJae0914/goodgoott/assets/120714001/e9bb95d5-6002-40b1-b6fc-fd6f116eb560)

  
  - 추가적으로 필요할 경우 각자 설치
