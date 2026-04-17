Todo1: css(2) 내부적용 / id vs class
Todo2: java 제어문 - SWITCH

---

■ 1. 복습문제 - 노트 준비 ~09:40
■ 1. html + css ( java는 오후에 eclipse 로 진행합니다 )

1. float 속성을 사용할 때 부모 요소의 높이가 사라지는 문제를 해결하는 방법은? 
   ( - 부모요소에 : overflow:hidden )
   (- 안따라가는 콘텐츠 :  clear : both )
 
2. position: absolute로 자식 요소를 배치할 때, 부모 요소에 반드시 설정해야 하는 속성은?  
     ( position: relative )
 
3. 여러 요소를 가로 또는 세로로 쉽게 배치하기 위해 사용하는 레이아웃 방식은? ( display: flex )
 
4. float와 display의 차이점을 간단히 설명하시오.  
    ( float : 좌우 정렬시 사용, 여백은 margin 으로
      display : 속성변경시 사용, flex는 자식요소들의 배치방법법이 들어가는데 여백도 맞추는게 가능함, gap  )

5. position: sticky 속성은 어떤 상황에서 유용하게 사용되는가? 
    ( 스크롤할 때 특정위치에 계속 붙어 있도록 할때 )

6. margin: auto를 사용하여 블록 요소를 가운데 정렬하려면 어떤 조건이 필요한가? 
    ( text-align: center;  line-height:100px; )

7. z-index 속성은 어떤 경우에 사용되며, 값이 클수록 어떤 효과가 나타나는가?  
    ( 겹치는 요소의 시각적 쌓임 순서를 정하는 속성, 값이 클수록 앞에 표시 )

8. header 안에서 로고와 내비게이션을 양쪽 끝에 배치하고 간격을 일정하게 유지하려면 어떤 방법을 사용하는가?  
    (dispaly: flex; justify-content: space-between)

    
■ 2. java

1. if 버전
정수를 하나 입력받아 다음 조건에 따라 요일을 출력하는 프로그램을 작성하시오.
1 → "월요일"
2 → "화요일"
3 → "수요일"
4 → "목요일"
5 → "금요일"
그 외 → "주말"

2. switch 버전 - 위의 문제를 switch 문으로 작성하시오.

Scanner scanner = new Scanner(System.in);
System.out.print("요일 입력(1~7) > ");
int day = scanner.nextInt();
 
3. for, while, do while 버전
1 2 3 4 5 6 7 8 9 10

4. 이중 for 버전
다음과 같은 모양을 출력하는 프로그램을 작성하시오.
 
1234
1234
1234
1234

---

■ 2. Todo1: CSS기본
-  animation

---

■ 3. Todo2: java  array


---

■ 4. 복습문제

■ 1. html + css  
html + css 익히느라 수고하셨습니다~!
내일은 바로 부트스트랩 진행할께요~~! 

■ 2. java  [25분 안 쪽으로 끝나게 도전이요~!]

Scanner scanner = new Scanner(System.in);
System.out.print("숫자 입력(1,2,3) > ");
int day = scanner.nextInt();

1. if 버전  - 정수를 하나 입력받아 다음 조건에 따라 요일을 출력하는 프로그램을 작성하시오.
   1이라면 1이다, 2라면 2이다, 3이라면 3이다    1,2,3이 아니다

2. switch 버전 - 위의 문제를 switch 문으로 작성하시오.

3. for, while, do while 버전
1 2 3 4  

4. 이중 for 버전
다음과 같은 모양을 출력하는 프로그램을 작성하시오.
★
★★
★★★

5. 1차원배열  다음에 해당하는 값에서 index를 이용하여 3을 출력해주세요!
		int   [] arr2         =    {1,2,3}; 

6. 1차원배열      new 연산자 이용해서 배열만들기
    1. 배열명 : arr     
    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5    
       for+length 이용해보기
    3. for + length 로 출력




