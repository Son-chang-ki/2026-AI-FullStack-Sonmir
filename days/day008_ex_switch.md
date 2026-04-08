### ■1.  복습문제

1. 마크업
1-1. 이미지태그를 이용해서 001.png 파일을 마크업하시오. <img src="경로" alt="이미지 설명"/>
1-2. naver로 링크하는 a태그를 적으시오. <a href="경로" title="링크경로설명" target="_blank"> 네이버 </a>

2. css
1. 배경을 노란색으로 설정하는 속성은?      background-color : yellow
2. 글자색상을 초록색으로 지정하는 속성은?    color : green
3. 글자 크기를 30px로 지정하는 속성은?    font-size : 30px
4. 글자를 오른쪽으로 정렬하는 속성은?     text-aline : right
5. 글자에 취소선을 추가하는 속성은?       text-decoration : line-through
6. 글꼴을 'Times New Roman'으로 지정하는 속성은?   font-family : Times New Roman
7. 글자를 굵은표시를 기본으로 표시하는 속성은?     font-weight : nomal
8. 요소의 세로 길이를 400px로 지정하는 속성은?   height : 400px
9. 요소의 바깥쪽 여백을 20px로 지정하는 속성은?  matgin : 20px
10. 요소의 안쪽 여백을 5px로 지정하는 속성은?  padding : 5px
11. 요소에 2px 점선 테두리를 추가하는 속성은? 2px dotted
12. 모서리를 둥글게 50%로 만드는 속성은?   border-radius : 50%
13. 그림자 효과를 빨간색으로 추가하는 속성은?  box-shadow : red
14. 빠르게 움직이는 장면전환효과를 주는 속성은?  transform rotate /translate

---
### ■2. Todo1 : css 기본
  -7. css(3) 가상선택자

  선택자 : 
  - 일반태그 선택자 : p
  - 아이디 선택자   : #id
  - 클래스 선택자   : .class
  - 가상선택자     :     : hover ,  :first-child ,  :last-child

  ---

  -8. layout
     

---
### ■3. Todo2 : java CONTROL - SWITCH

  제어문
  1. 프로그램 코드 실행흐름 :  
     - 위 → 아래, 왼쪽 → 오른쪽
     - 제어문은 개발자가 원하는 방향으로 변경할 수 있도록 도와줌.
    
  2. 종류 
     - 조건문 : if, switch 
     - 반복문 : for, while, do while 
     - 제어키워드 : break, continue

---

1. BANK 지난시간에 작성내용

2. 국어점수는 0100 사이만 입력받게
    수학점수는 0100 사이만 입력받게 영어점수는 0~100 사이만 입력받게
    학번 입력 > std111 국어점수 입력 > 100
    수학점수 입력 > 100 영어점수 입력 > 99

---
### ■4.  복습문제    
■1. html + css
   1.css 선택자 - 태그선택자, 아이디선택자, 클래스선택자 , ( 가상선택자 : 예 :hover, :first-child)
   2.내부적용을 이용해서 다음 css를 적으시오. h1 중앙정렬, 글자색상 : #34495e, 아래쪽여백 : 40px 
     ==> h1{ text-align: center; color: #34495e ; margin-bottom : 40px }

   3.여러개의 div태그에 .portfolio라는 클래스를 적용하고
     각각의 배경을다르게 설정하려고 한다. .p1은 배경 red, .p2는 gold html 설정에 css를 적용하는 코드를 적으시오
     ==> .portfolio .p1 {background-color : red ;}
     ==> .portfolio .p2 {background-color : gold ;}
       <div class="portfolio p1"> </div>

       <div class="portfolio p2"> </div>

   4. .portfolio마우스를 올렸을때 확대 + 회전 + 밝기 + 그림자 강조 css를 적으시오.
     ==> .portfolio:hover {transform: scale(1.5) rotate(-3deg); filter: brightness(1.05);
                           box-shadow:0 4px 12px rgba(0.1 0.1 0.1 0.1);}

   5. 가상선택자의 종류는? 
     5-1. 마우스를 올렸을때 : hover
     5-2. 부모안에서 첫번째 자식요소  : first-child
     5-3. 부모안에서 마지막 자식요소  : last-child

   6. .portfolio ul태그의 첫번째 li를 선택해서 좋아하는 배경색으로 넣기
     ==> .portfolio ul li:first-child {background-color ; gold;}

---

■2. java

  1) if 버젼 1을 입력받으면 1이다 / 2를 입력받으면 2이다 / 3을 입력받으면 3이다.

  2) switch 버젼 위의 내용을 switch 버젼으로

  3) 다음 무한반복을 빠져나오는 코드를 적으시오 int a = -1;

    for(;;){ 
 	     System.out.println("빠져나오실래요?  0이면 종료");
 	     a = scanner.nextInt();
 	     if(a==0) {        }
      }


---


      