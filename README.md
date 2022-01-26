## 코드 모듈명
나중에 어? 이거 했었는데 어떤거에 있더라... 라고 하고 있는 나의 모습이 보여서 참고용으로 작성 (latest 2022.01.26)

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

**12강**

|모듈명|내용|
|:---:|---|
|ex1221|saveInstance 사용 예제, 화면 회전 시켰을 때 데이터가 유지되도록 하는 예제|

**13강**

|모듈명|내용|
|:---:|---|
|ex1321|유저 이벤트(play/pause 버튼 클릭)를 받아들이는 메인 스레드와 카운트다운 하는 스레드를<br> 분리 시켜서 anr 문제를 thread-handler 구조로 처리하는 예제|
|ex1331|유저 이벤트(play/pause 버튼 클릭)를 받아들이는 메인 스레드와 카운트다운 하는 스레드를<br> 분리 시켜서 anr 문제를 asynctask로 처리하는 예제|
|ex1341|2~30초 정도 걸리는 연산을 실행시키고, 동시에 editText에 글자를 입력해서<br> 발생하는 anr 문제를 coroutine으로 처리하는 예제|

**14강**

|모듈명|내용|
|:---:|---|
|ex1421|애플리케이션에 uses-permission 선언을 하고 애플리케이션이 실행되면 퍼미션 요청,<br> 허용시 토스트가 띄워지고 거부시 다이얼로그가 띄워져 사후처리|

**15강**

|모듈명|내용|
|:---:|---|
|ex1511|1번 버튼을 누르면 진동, 2번 버튼을 누르면 시스템의 기본 효과음이 울리게 하는 예제|
|ex1521|버튼을 눌렀을 때 각각 AlertDialog, 목록 다이얼로그, DatePicker 다이얼로그, TimePicker 다이얼로그가<br> 띄워지고 클릭시 아이템에 대한 토스트 메시지가 나오도록 하는 예제|

**16강**

|모듈명|내용|
|:---:|---|
|ex1621|SharedPreference 예제, 화면의 edit text와 체크 박스에 데이터를 입력하고 <br>첫번째 버튼 누르면 데이터 저장하고 두번째 버튼 누르면 저장된 데이터 조회|
|ex1631|settings.xml 예제, SwitchPreference 3개가 그룹으로 구분되어서 출력|
|ex1641|PreferenceFragmentCompat 예제, 상위 설정이 disable이면 하위 설정은 비활성 상태로,<br> enable이면 하위 설정은 활성 상태로 변하게 하고 값 입력시 summary가 바뀌는 예제|

**17강**

|모듈명|내용|
|:---:|---|
|ex1721|OpenHelper에서 데이터 insert 처리를 한 후, 애플리케이션 내의 버튼 누르면 데이터를 select 해서 <br>출력하는 예제|
|ex1731|MainActivity에서 글을 입력 받고 add 버튼을 누르면 db에 insert하고 화면 전환, ReadActivity에서 <br>select문으로 결과값 화면에 출력하는 예제|
|ex1741|ex1731과 동일, rawQuery(), execSql() 함수가 아닌 insert(), query() 함수로 sql문 작성|

**18강**

|모듈명|내용|
|:---:|---|
|ex1821|주소록앱 사용 예제, 주소록에서 하나를 선택하면 선택한 것의 데이터를 받아와서 이름과 번호 출력|
|ex1831|갤러리앱 사용 예제, 갤러리에서 하나를 선택하면 선택한 것의 데이터를 받아와서 이미지 출력|
|ex1841|Call앱 사용 예제, 유저에게 전화번호를 입력 받아 버튼을 눌렀을 때 Call App에 데이터가 전달되어 <br>전화걸기|
|ex1851|카메라앱 사용 예제, 1번 버튼 누르면 카메라 앱에서 사진 데이터를 획득 받아서 출력, 2번 버튼 누르면 <br>카메라 앱에서 파일을 저장하고 저장된 파일을 출력|

**19강**

|모듈명|내용|
|:---:|---|
|ex1921|BroadcastReceiver 예제, 시스템이 시작되었을 때 배터리의 상태 출력(출력 여부, 어떤 충전 중인지, <br>배터리 퍼센트), 임의의 리시버 만들고 버튼 눌렀을 때 이 리시버가 실행되도록 하는 예제|

**20강**

|모듈명|내용|
|:---:|---|
|ex2031|startService 예제, 음악 재생을 서비스에서 진행, 액티비티에서 발생한 유저이벤트에 대한 데이터를 <br>서비스에 전달하는 예제|
|ex2041|bindService 예제, ex2031과 동일|

**21강**

|모듈명|내용|
|:---:|---|
|ex2121|버튼을 눌렀을 때 notification이 뜨도록 하는 예제|
|ex2131|notification에 event, action, bigPictureStyle을 적용하는 예제|