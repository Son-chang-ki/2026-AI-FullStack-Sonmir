- Todo1:  css(2)  내부적용  / id vs class
- Todo2:  java  제어문 - SWITCH

---

### ■1. 복습문제  -  노트 준비 ~09:40

-1. 
1) 회사에서 요구하는 것 ==> 적응할 수 있는 능력 (듣은내용 기재)
2) 
3) 우리가 배워야 할 과목은 아래와 같다. 프런트엔드 , DB 관련, 백엔드 (듣은내용 기재)
  html
  css
  js + jquery + ajax
  react

  oracle/mysql
  mybatis
  jpa

  java
  jsp
  spring
  spring boot

---

### ■2. Todo1:  CSS기본
- 7. css(3) 가상선택자

선택자 : 
- 일반태그 선택자  : p
- 아이디 선택자    : #id
- 클래스 선택자    : .class
- 가상선택자       :  :hover , :first-child , :last-child

 
- 8. layout

1. float      : 좌, 우 정렬 (각 요소를 좌, 우에 띄워 배치) ==> clear : both 로 마무리함
2. position   : 절대 / 고정 위치 지정
3. display    : block / inline / inline-block / flex 구성
   margin & padding : 요소간 간격 조절에 사용           

---

### ■3.   Todo2:  java  CONTROL - SWITCH

제어문
1. 프로그램 코드 실행흐름
- 위 → 아래, 왼쪽 → 오른쪽
- 제어문은 개발자가 원하는 방향으로 변경할 수 있도록 도와줌.

2. 종류
  조건문 : if, switch
  반복문 : for, while, do while
  제어키워드 : break, continue

---

### ■4.  복습문제

■ 1. html + css

    1. 레이아웃잡는방법은? (   float  ,   position  ,        ,      )
    2. box를 왼쪽, 오른쪽에 붙이는 방법은?  float
    3. 다음박스를 왼쪽 오른쪽에 배치하려고 한다. 들어가야하는 코드는?  .box { float-left;}
    <style>
      .left{ float : left; }     .right{ float : right; }    .clear{ clear : both; }
    </style>
    <div class="box">
      <div class="left">LEFT</div>
      <div class="right">RIGHT</div>
      <div class="clear">안따라갈려고</div>
    </div>

    4. 다음li를 왼쪽으로 붙이려고한다. 코드는?  ※ list-style: none ==> 블릿기호 없애기
    <style>
      ul{ overflow:hidden; list-style: none; }    li{ float: left; }
    </style>
    <ul>
      <li>ONE </li><li>TWO</li><li>THREE</li>
    </ul>

    5. 내가 원하는 위치에 top, right, bottom, left 속성을 줘서 원하는 위치에 배치하는 방법은? position
     - 부모박스에  ( position : relative   )코드를 사용해   기준점을 잡고
     - 자식콘텐츠로  (  position : absolute    )를 사용해 배치한다.

    6.  스크롤할 때 상단에 계속 붙어 있도록 만드는 방법은?  sticky : top 0
    

■ 2. java

1. if버젼에 해당하는 다음에 연결해서 문제를 작성하시오.
    문자를 한개 입력받아 a이면 apple , b이면 banana, c이면 coconut
2. switch버젼에 해당하는 다음에 연결해서 문제를 작성하시오.
    문자를 한개 입력받아 a이면 apple , b이면 banana, c이면 coconut

    char ch='\u0000';
    Scanner scanner =new Scanner(System.in);

    System.out.println("a,b,c 중에 입력 > ");  
    ch = scanner.next().charAt(0);
    
3. for, while, do while 버젼으로  문제를 풀으시오!  
     1  2  3  4  5




