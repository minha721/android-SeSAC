## 코드 모듈명
나중에 어? 이거 했었는데 어떤거에 있더라... 라고 하고 있는 나의 모습이 보여서 참고용으로 작성 (latest 2022.01.10)

**5강**

|모듈명|내용|
|:---:|---|
|ex0521|View 클래스를 Activity에서 직접 생성해 화면 구성|
|ex0522|Layout XML 코드에 화면 구성을 위한 View를 태그로 등록|
|ex0531|visible, invisible 속성 확인 예제|
|ex0541|textView 속성 예제, autoLink, maxLines, ellipsize 속성 사용|
|ex0551|imageView 속성 예제, maxWidth, maxHeight, adjustViewBounds, scaleType 속성 사용|
|ex0561|Button 친구들(Button, CheckBox, RadioGroup, RadioButton), EditText 사용 예제|

**6강**

|모듈명|내용|
|:---:|---|
|ex0621|LinearLayout 사용 예제, layout 중첩, orientation, layout_weight, gravity 속성 사용|
|ex0631|RelativeLayout 사용 예제, layout_toRightOf, layout_alignLeft, layout_alignParentRight 등 속성 사용|
|ex0641|FrameLayout 사용 예제, 탭 버튼 누르면 화면 전환|
|ex0651|GridLayout 사용 예제, orientation, columnCount 속성 사용|
|ex0661|Constraint Layout 사용 예제|

**7강**

|모듈명|내용|
|:---:|---|
|ex0721|KeyEvent, 앱의 첫화면에서 back 버튼을 눌렀을 때 종료할건지 토스트를 띄우는 예제|
|ex0731|TouchEvent, 화면을 터치했을 때 터치 이벤트와 터치한 지점 좌표값 화면에 출력하는 예제|
|ex0741|ClickEvent, Chronometer 제어하는 프로그램, 즉 스탑워치 예제|

**8강**

|모듈명|내용|
|:---:|---|
|ex0821|xml 이미지 적용 예제, xml 이미지를 만들어서 image view와 button에 적용|
|ex0831|values에 string, color, dimen, style을 등록하고 적용시키는 예제|
|ex0841|폴더 조건 명시법에 따라 화면 방향과 언어권에 따른 설정|

**9강**

|모듈명|내용|
|:---:|---|
|ex0921|ArrayAdapter 적용 예제|
|ex0931|SimpleAdapter 적용 예제|
|ex0941|ListView 사용 예제, item을 동적으로 추가, 삭제|
|ex0951|CustomAdapter 적용 예제, item을 동적으로 삭제, **더 공부해볼 것!**|
|ex0961|spinner로 언어를 선택하고, autocompletetextview에 글자 입력하면 추천 단어 뜨게 하는 예제|

**10강**

|모듈명|내용|
|:---:|---|
|ex1011|ActionBar 색상 변경, 체크박스 활성화 색상 변경, ActionBar 숨기기|
|ex1021|메뉴에서 item 선택했을 때 이벤트 처리|
|ex1031|xml로 메뉴 구성을 해서 오버플로우 메뉴, action item, action view 추가|

**11강**

|모듈명|내용|
|:---:|---|
|ex1121|첫번째 액티비티에서 버튼을 클릭하면 두번째 액티비티를 실행|
|ex1131|첫번째 화면인 리스트뷰에서 항목 선택시 두번째 화면에서 id와 title 출력|
|ex1141|startActivityForResult와 ActivityResultLauncher를 각각 이용해서 두번째 액티비티로 넘어가고<br> 두번째 액티비티에서 버튼을 누르면 첫번째 액티비티로 돌아가면서 결과값(데이터)을 출력|
|ex1151|암시적 인텐트 예시, 두번째 액티비티에 intent-filter를 지정해서 intent 정보로 두번째 액티비티 실행|