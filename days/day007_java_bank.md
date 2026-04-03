### #1. 복습문제
---

> 정리문제 (1) 
1. 웹페이지의 배경을 하늘색으로 바꾸고 싶다. 어떤 속성을 써야 할까?  background-color : skyblue
2. 제목 글자를 초록색으로 바꾸려면?    color : green
3. 본문 글자의 크기를 18px로 지정하려면?    font-size : 18px
4. 메뉴 글자를 오른쪽으로 정렬하려면?    text-align : right
5. 링크에 밑줄을 없애려면?    text-decoration : delete
6. 글꼴을 'Times New Roman'으로 바꾸려면?    font-family : Times New Roman
7. 강조하고 싶은 단어를 굵게 표시하려면?    font-weight : bold
8. 이미지를 가로 400px로 줄이고 싶다. 어떤 속성?    width : 400px
9. 박스 바깥쪽에 20px 여백을 주려면?    margin : 20px
10. 버튼 안쪽에 8px 여백을 주려면?    padding : 8px 
11. 카드 요소에 2px 점선 테두리를 주려면?    border : 2px dotted(점선) red
12. 프로필 사진 모서리를 둥글게 50%로 만들려면?    border-radius : 50%
13. 박스에 살짝 번지는 그림자 효과를 주려면?    box-shadow : 0 0 10px rgba(0,0,0,0.1)
14. 버튼에 마우스를 올렸을 때 부드럽게 색이 바뀌도록 하려면?  button : hover { }(마우스를 올렸을 때 움직임) 
                                                                                       transition : all 2s

> 정리문제 (2)
1. css 선택자 유일한 값 ? id
2. css 선택자 여러개 선택시? class 
 
> 정리문제 (3)
1. 숫자를 한개입력받아
2. 1이면 1이다, 2이면 2이다, 3이면 3이다  if로 작성 
int num = 0 ;
Scanner scanner = new Scanner(System.in);
System.out.println("숫자를 입력하시오 >");
num = scanner.nextInt();
if ( num == 1 )       {System.out.println("1이면 1이다");  } 
else if ( num == 2 )  {System.out.println("2이면 2이다");  }
else if ( num == 3 )  {System.out.println("3이면 3이다"); }
else                       {System.out.println("1,2,3 이 아니다"); }
System.out.println(num == 1 ?  "1이면 1이다" : (num == 2) ? "2이면 2이다" : (num == 3) ? "3이면 3이다" : "1,2,3 이 아니다");

천천히 움직이는 장면전환효과를 주는 속성은? transition : all 2s

