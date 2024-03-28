# Source by 彭彭老師
[彭彭老師的頻道][1]

  [1]: https://www.youtube.com/@cwpeng-course       "游標顯示"
# 註解：寫給別人看的文字，執行時忽略
- 單行：//內容
- 多行：
  ```java
  /*
    第一行
    第二行  
  */
  ```

# 資料型態 Data Types：Java 程式中可以操作的各種資料
- 整數：代表各種範圍的整數
  - byte：-128~127
  - short：-32768~32767
  - ***int***：-2147483648~2147483647
  - long：-9223372036854775808~9223372036854775807
- 浮點數（小數）
  - float：小數點後7位
  - double：小數點後15位
- 布林值 boolean：正或反，true or false
- 字元 char：代表單一文字，使用單引號包住一個字
- 字串 String：代表零到多個字元，使用雙引號包住一串字

# 變數：用來儲存資料的名稱，可用變數名稱代替資料操作
- 宣告變數：使用變數前先宣告
  - 語法：*資料型態* 變數名稱;
  - 範例：  
    ```java
    int x;  
    double y;  
    boolean z;  
    char c;  
    String s;  
    ```
- 指定資料：資料必須符合宣告的資料型態
  - 法一：宣告變數、同時指定資料
    - *資料型態* 變數名稱＝資料;
  - 法二：先宣告變數、然後指定資料
    - *資料型態* 變數名稱;  
      變數名稱＝資料;
  - 範例：  
    ```java
    *int* x = 3;  
    *double* y;  
    y = 3.5
    ```
- 使用變數：在程式中使用變數名稱代替資料進行操作
  - 在終端機印出資料的指令：  
  ```java
  System.out.println(任意資料);
  ```
  - 沒有使用變數的範例：  
  ```java
  System.out.println(3);  
  System.out.println(true);
  ```
  - 使用變數的範例：  
  ```java
  *int* x = 3;
  System.out.println(x);  
  *boolean* y;
  y = true;
  System.out.println(y);
  ```

# 強型別程式語言：資料型態須嚴格的定義和檢查
- 每個變數都有明確的資料型態定義
- 變數中存放的資料，須符合變數宣告時定義的資料型態
## 數字類型的資料型態
- 範圍大小的排序：浮點數型態範圍皆大於整數型態
  - 整數：byte < short < int < long
  - 浮點數：float < double
- 基本轉換規則：根據資料型態的範圍來判定
  - 小範圍轉為大範圍：自動轉換  
  ```java
  *byte* n1 = 3;  
  *int* n2 = n1;//從byte轉為int  
  *long* n3 = 55555555;//從int轉為long  
  *float* n4 = n3;//從long轉為float
  ```
  - 大範圍轉小範圍：產生錯誤  
  ```java
  *int* n1 = 3;  
  *byte* n2 = n1;//錯誤
  *double* n3 = 3.5; 
  *float* n4 = n3;//錯誤  
  *float* n5 = 10.5;//錯誤
  ```
- 強制轉換：轉換後可能產生數字失真
  - 大範圍轉小範圍：使用*資料型態*強制轉換  
  ```java
  *int* n1 = 3;  
  *byte* n2 = (*byte*)n1;  
  *int* n3 = 1024;  
  *byte* n4 = (*byte*)n3;//數字和原先不同  
  *double* n5 = 3.1415926536;  
  *float* n6 = (*float*)n5;//數字失去精準度  
  ```
## 字串與數字
- 字串（任意文字）：可以和數字資料型態做轉換
  - 可以轉換為數字的字串：  
  ```java
  *String* x = "345";  
  *String* y = "3.14159";  
  ```
  - 不能轉換為數字的字串：  
  ```java
  *String* m = "Hello World";  
  *String* n = "哈囉你好";  
  ```
- 字串轉數字：不同的資料型態，使用的方法不同
  - 轉成int型態：Integer.pareInt("字串")  
  ```java
  String s = "56";  
  int x = Integer.parseInt(s);  
  ```
  - 轉成long型態：Long.pareLong("字串")  
  ```java
  long x = Long.parseLong("55555");  
  ```
  - 轉成float型態：Float.parseFloat("字串")  
  ```java
  float x = Float.parseFloat("3.14");  
  ```
  - 轉成double型態：Double.parseDouble("字串")  
  ```java
  Double x = Double.parseDouble("3.1415");  
  ```
- 數字轉字串：可以使用同一種方法完成
  - 使用 String.valueOf(數字) 轉換為字串  
  ```java
  int x = 3;
  String s1 = String.valueOf(x);
  String s2 = String.valueOf(1024L);  
  String s3 = String.valueOf(3.14F);  
  double y = 3.1415926256;
  String s4 = String.valueOf(y);  
  ```

# 基本運算符號：用來對資料做特定的操作
## 算術運算：基本數學運算
- 加減乘除：+、-、*、/
- 取餘數：%
- 運算符號使用範例：注意資料型態
  - 加減乘除  
  ```java
  int x = 5 + 2;
  int y = 5 - 2;
  int m = 5 * 2;
  int n = 5 / 2;//整數除法
  double o = 5 / 2.0;//浮點數除法
  ```
  - 取餘數
  ```java
  int x = 5 % 2;//整數餘數
  double y = 5 % 3.5;//浮點數餘數
  ```
## 指定運算
- 運算符號說明：主要用來將資料指定給變數
- 基本的指定運算：=
- 搭配算術運算更新變數自身的資料：+=, -=, *=, /=, %=
- 運算符號使用範例：透過指定運算才能更新變數的資料
  - 基本的指定運算
  ```java
  int x = 3;
  x = x + 1;
  System.out.println(x);//印出4
  ```
  - 搭配算術運算更新變數自身的資料
  ```java
  int x = 3;
  x += 1;//x=x+1;
  x *= 2;//x=x*2;
  System.out.println(x);//印出8
  ```
## 比較運算
- 運算符號說明：主要用來比較資料大小、是否相等
- 大小的比較：>, <, >=, <=
- 是否相等的比較：==, !=
- 運算符號使用範例：比較運算的結果是布林值型態
  - 大小比較
  ```java
  boolean x = 5 > 2;
  boolean y = 5 <= 5;
  boolean m = 5 < 5;
  boolean n = 2 >= 5;
  ```
  - 是否相等比較
  ```java
  //兩個等號和一個等號不同
  boolean x = 5 == 2;
  boolean y = 5 != 2;
  ```
## 單元運算
- 運算符號說明：主要針對單一資料做操作
- 針對單一變數做加一和減一：++, --
- 針對布林值做反轉：!
- 運算符號使用範例：需要做加一或減一最常用的寫法
  - 針對單一變數做加一和減一
  ```java
  int x = 3;
  x++;//x+=1;//x=x+1;
  x--;//x-=1;//x=x-1;
  System.out.printf(x);//印出3
  ```
  - 針對布林值做反轉
  ```java
  boolean x =! true;
  x =! x;
  System.out.printf(x);//印出true
  ```
## 邏輯運算
- 運算符號說明：主要針對兩個布林值進行操作
- 且，英文and，兩個布林值必須都是true，結果才是true：&&
- 或，英文or，兩個布林值其中一個是true，結果就是true：||
- 運算符號使用範例：兩個布林值只有四種組合
  - 且，英文and：
  ```java
  boolean x = true && true;
  boolean y = true && false;
  boolean m = false && true;
  boolean n = false && false;
  ```
  - 或，英文or：
  ```java
  boolean x = true || true;
  boolean y = true || false;
  boolean m = false || true;
  boolean n = false || false;
  ```
# 流程控制：程式最核心的運作邏輯
## 判斷式
### 程式區塊：程式碼中大括號圍起來的空間
- 程式區塊範例
  ```java
  public static void main(String[] args){
    //程式區塊
  }
### if判斷式：滿足某個條件，才執行程式
- 基礎語法
  ```java
  if(布林值){
    //如果布林值是true，執行此程式區塊
  }
  ```
- 程式範例
  ```java
  if(true){
    System.out.println("哈囉");
  }

  int x = 1000;
  if(x > 2000){
    System.out.println("哈囉");
  }
  ```
### if...else判斷式：處理反面的狀況
- 基礎語法
  ```java
  if(布林值){
    //如果布林值是true，執行此程式區塊
  }else{
    //如果布林值是false，執行此程式區塊
  }
  ```
- 程式範例
  ```java
  int x = 1000;
  if(x > 2000){
    System.out.println("大於2000");
  }else{
    System.out.println("小於等於2000");
  }
  ```
### if...else if...else判斷式：處理多個條件的狀況
- 基礎語法
  ```java
  if(布林值){
    //對應布林值是true，執行此程式區塊
  }else if{
    //對應布林值是true，執行此程式區塊  
  }else if{
    //對應布林值是true，執行此程式區塊  
  }else{
    //對應布林值是false，執行此程式區塊
  }
  ```
- 程式範例
  ```java
  String name = "子棋";
  if(name == "小棋"){
    System.out.println("我是小棋");
  }else if(name == "子棋"){
    System.out.println("我是子棋,好可愛");
  }else if(name == "大棋"){
    System.out.println("我是大棋");
  }
### switch判斷式：特別適合多條件的狀況
- 基礎語法
  ```java
  switch(變數名稱){
    case 比對的資料;
      //如果變數中的資料和比對的資料相同
      //執行這裡的程式
      break;
    case 比對的資料;
      //如果變數中的資料和比對的資料相同
      //執行這裡的程式
      break;
    default:
      //如果變數中的資料沒有比對到任何資料
      //執行這裡的程式
      break;
  }
  ```
- 程式範例
  ```java
  String name = "子棋";
  switch(name){
    case "小棋":
      System.out.println("我是小棋");
      break;
    case "子棋":
      System.out.println("我是子棋");
      break;
    default:
      System.out.println("不是小棋或子棋");
      break;
  }
  ```
### 標準輸入：讓使用者從終端機輸入資料
- 載入內建的java.util.Scanner類別
  ```java
  import java.util.Scanner;
  ```
- 程式範例
  ```java
  //建立一個Scanner物件
  Scanner s = new Scanner(System.in);
  //取得使用者輸入的整數
  int x = s.netInt();
  //取得使用者輸入的任意文字
  String text = s.next();
  ```
## 迴圈
### while迴圈：滿足某個條件，執行程式區塊，但重複執行到條件不滿足為止
- 基礎語法
  ```java
  while(布林值){
    //如果布林值是true，執行此程式區塊
    //執行完畢後，跳到迴圈上方再來一次
  }
- 程式範例
  ```java
  while(true){
    System.out.println("哈囉");
  }

  int x = 1;
  while(x<5){
    System.out.println(x);
    x++;
  }
### 簡化重複的程式碼
- 沒有迴圈的情況下，計算1+2+3+4的和
  ```java
  int total = 0;
  total = total + 1;
  total = total + 2;
  total = total + 3;
  total = total + 4;
  System.out.println(total);
  ```
- 使用迴圈簡化中間重複的程式碼
  ```java
  int total = 0;
  int n = 1;
  while(n<=4){
    total = total + n;
    n++;
  }
  System.out.println(total);
  ```
### for迴圈
- 基礎語法
  ```java
  for(初始化程式;布林值;每次轉圈的執行程式){
    //如果布林值是true，執行此程式區塊
    //執行完畢後，跳到迴圈上方再來一次
  }
  ```
- 程式範例
  ```java
  for(int x = 1;x < 5;x++){
    System.out.println(x);
  }
  ```
### while迴圈 v.s. for迴圈：for迴圈將關鍵資訊擺在最上方
- 使用while迴圈印出1,2,3,4
  ```java
  int x = 1
  while(x<5){
    System.out.println(x);
    x++;
  }
  ```
- 使用for迴圈印出1,2,3,4
  ```java
  for (int x = 1;x < 5;x++){
    System.out.println;
  }
  ```
## 迴圈指令：搭配迴圈運作的指令
- 強制返回迴圈開頭，進入下一圈
  ```java
  continue;
  ```
- 強制結束迴圈
  ```java
  break;
  ```
### continue指令：執行後，強制返回迴圈開頭
- 程式範例
  ```java
  for(int x = 1;x < 5;x++){
    if(x % 2 == 0){//可以被2整除，偶數
      continue;
    }
    System.out.println(x);
  }
  ```
### break指令：執行後，強制結束迴圈
- 程式範例
  ```java
  int x = 1;
  while(x < 5){
    if(x == 3){
      break;
    }
    System.out.println(x);
    x++;
  }
## 陣列資料型態
### 陣列 Array：資料型態的一種，用來存放許多同型態的資料
- 基本資料型態
  - int、long、double、boolean、char、String
- 陣列資料型態
  - int[]、long[]、double[]、boolean[]、char[]、String[]
### 宣告陣列變數
- 宣告陣列變數：陣列也是一種資料型態
  - 宣告變數的語法：
  ```java
  資料型態 變數名稱;
  ```
  - 範例
  ```java
  int[] x;  
  double[] y;  
  boolean[] z;  
  char[] c;  
  String[] s;  
  ```
## 陣列資料的操作
### 初始化陣列：初始化時，決定陣列的長度
- 初始化陣列資料的語法
  ```java
  new 資料型態[陣列長度];
  ```
- 範例
  ```java
  int[] x = new int[3];
  double[] y = new double[10];
  String[] s;
  s = new String[5];
  ```
### 陣列的長度：陣列可以存放的資料數量
- 取得陣列長度的語法
  ```java
  陣列變數名稱.length
  ```
- 範例
  ```java
  int[] x = new int[3];
  System.out.println(x.length);//印出3
  ```
### 陣列中的資料：陣列是容器的概念，用來存放許多同型態的資料
- 存取陣列中資料的語法
  ```java
  陣列變數名稱[資料編號];
  ```
- 範例
  ```java
  int[] x = new int[3];
  x[0];//第一筆資料
  x[1];//第二筆資料
  x[2];//第三筆資料
  //陣列長度3，最大編號為2
  ```
- 將資料存放到陣列中，範例
  ```java
  //初始化int陣列，資料預設為0
  int[] x = new int[3];
  ```
  |編號|0|1|2|
  |-|-|-|-|
  |資料|0|0|0|
  ```java
  System.out.println(x[0]);//印出0
  System.out.println(x[0]);//印出0
  System.out.println(x[0]);//印出0
  x[0] = 10;
  x[2] = 5;
  ```
  |編號|0|1|2|
  |-|-|-|-|
  |資料|10|0|5|
  ```java
  System.out.println(x[0]);//印出10
  System.out.println(x[0]);//印出0
  System.out.println(x[0]);//印出5
  ```
### 初始化陣列同時給定資料：初始化時，同時決定陣列長度和內部的資料
- 初始化陣列、同時給定資料的語法
  ```java
  new 資料型態[]{資料,資料,資料,...}
  ```
- 範例
  ```java
  int[] x = new int[3];
  x[0] = 2;
  x[1] = 8;
  x[2] = 5;
  //簡化後如下
  int[] y = new int[]{2,8,5};
  ```
## 陣列與迴圈
### 逐一取得陣列資料：使用for迴圈和陣列做搭配
- 範例
  ```java
  int[] x = new int[]{2,8,5};
  for(int i=0;i < x.length;i++){
    System.out.println(x[i]);
  }
  ```
# 類別Class：Java程式的核心概念
- 類別在程式中的角色
  - 組織程式的基礎單位
    - 類別的屬性
    - 類別的方法
  - 物件實體的藍圖
    - 物件實體的建構式
    - 物件實體的屬性
    - 物件實體的方法
## 定義類別：最基礎的類別定義
- 建立一個*程式檔案名稱*.java
  ```java
  //定義類別
  class 類別名稱{
    //沒有任何額外的內容
  }
  ```
- 定義多個類別：一個程式檔案可以包含多個類別定義
  - 建立一個 *程式檔案名稱*.java
  ```java
  //定義多個類別
  class 類別一{
    //沒有任何額外的內容
  }
  class 類別二{
    //沒有任何額外的內容
  }
  ```
- 編譯與執行：仔細觀察，了解程式的編譯與執行
  - 建立一個 *程式檔案名稱*.java
  ```java
  class 類別一{}
  class 類別二{}
  ```
- 編譯程式：針對程式檔案  
  ```java
  javac *程式檔案名稱*.java  
  ```
  產生兩個類別檔案  
  ```java
  類別一.class、類別二.class
  ```
- 執行程式：針對類別名稱  
  ```java
  java 類別一 > 執行失敗  
  java 類別二 > 執行失敗  
  ```
- 可執行的類別：類別定義中包含main方法，可被直接執行
  - 建立一個 *程式檔案名稱*.java  
  ```java
  class 類別一{
    public stativ void  main(String[] args){
      System.out.println("Hello");
    }
  }
  class 類別二
  ```
- 編譯程式：針對程式檔案
  ```java
  javac *程式檔案名稱*.java  
  ```
  產生兩個類別檔案  
  ```java
  類別一.class、類別二.class
  ```
- 執行程式：針對類別名稱
  ```java
  java 類別一 > 執行成功  
  java 類別二 > 執行失敗  
  ```
- 類別的組成：設計類別中包含的資料和功能
  - 類別的定義中，主要包含屬性和方法
  ```java
  class 類別名稱{
    //類別的屬性
    //類別的方法
  }
  ```
## 類別屬性的定義與操作
### 定義類別屬性：使用static關鍵字定義類別屬性
- 定義類別屬性
  ```java
  static 資料型態 屬性名稱 = 初始資料;
  ```
- 程式碼範例
  ```java
  class 類別名稱一{
    //類別的屬性
    static int x = 3;
  }
  class 類別名稱二{
    //類別的屬性
    static String text = "Hello";
    static double x = 8.7;
  }
  ```
### 操作類別的屬性：使用類別名稱.屬性名稱存取類別屬性
- 程式碼範例
  ```java
  class 類別名稱一{
    //類別的屬性
    static int x = 3;
    //類別的main方法：程式的進入點
    public static void main(String[] args){
      System.out.println(類別名稱一.x);
      System.out.println(類別名稱二.x);
      類別名稱二.text = "Hello Class";
      System.out.println(類別名稱二.text);
    }
  }
  class 類別名稱二{
    //類別的屬性
    static String text = "Hello";
    static double x = 8.7;
  }
  ```
### 類別的方法：用來包裝一段程式碼的結構
- 類別方法，包含以下重要觀念
  - 方法的名稱
  - 方法的程式區塊
  - 方法的參數
  - 方法的回傳值
## 類別方法的定義與呼叫
### 定義類別方法：使用static關鍵字定義類別方法
- 定義最基本的類別方法
  ```java
  static void 方法名稱(){
    //方法的程式區塊
  }
  ```
- 程式範例
  ```java
  class 類別名稱{
    static void 方法名稱(){
      System.out.println("Hello");
    }
  }
  ```
### 呼叫類別的方法：使用類別名稱.方法名稱()，呼叫方法：執行方法區塊的程式碼
- 程式碼範例
  ```java
  class 類別名稱{
    //類別的main方法：程式進入點
    public static void main(String[] args){
      類別名稱.hello();
    }
    //自定義的類別方法
    static void hello(){
      System.out.println("Hello");
    }
  }
  ```
## 類別方法的參數
### 定義方法的參數：小括號中定義0到多個參數，包含參數的資料型態和名稱
- 定義包含參數的類別方法
  ```java
  static void 方法名稱(資料型態 名稱,...){
    //方法的程式區塊
  }
  ```
- 程式碼範例
  ```java
  class 類別名稱{
    static void 方法名稱(String msg){
      //將參數當作資料未定的變數使用
      System.out.println(msg);
    }
  }
  ```
### 傳入參數資料：使用類別使用類別名稱.方法名稱(參數資料,...)，呼叫方法：帶入參數資料到方法中
- 程式碼範例
  ```java
  class 類別名稱{
    //類別的main方法：程式的進入點
    public static void main(String[] args){
      類別名稱.hello("Hello");
      類別名稱.hello("你好");
    }
    //自定義的類別方法
    static void hello(String msg){
      System.out.println(msg);
    }
  }
  ```
### 多個參數：多個參數用逗號隔開
- 程式碼範例
  ```java
  class 類別名稱{
    //類別的main方法：程式的進入點
    public static void main(String[] args){
      類別名稱.hello("子棋","Hello");
      類別名稱.hello("大棋","你好");
    }
    //自定義的類別方法
    static void hello(String name,String msg){
      System.out.println(name + "：" + msg);
  }
  ```
### 方法的回傳值：方法名稱前面定義回傳值資料型態
- 方法區塊中使用return資料中斷執行，並決定回傳的資料
- 定義包含參數和回傳值的類別方法
  ```java
  static 回傳值型態 方法名稱(資料型態 名稱,...);
  //方法的程式區塊
  return 回傳的資料
  ```
- 程式碼範例
  ```java
  class 類別名稱{
    static int 方法名稱(int n1,int n2){
      int result = n1 + n2;
      return result;
    }
  }
  ```
### 呼叫類別的方法：取得回傳的資料
- 關鍵字void代表此方法沒有回傳值，方法中直接使用return中斷執行
- 程式碼範例
  ```java
  class 類別名稱{
    public static void main(String[] args){
      //取得呼叫add方法後的回傳值
      int result = 類別名稱.add(3,4);
      System.out.println(result);
      //呼叫hello方法，沒有回傳值
      類別名稱.hello("你好");
    }
    //自定義的類別方法
    static int add(int n1,int n2){
      return n1 + n2;
    }
    static void hello(String msg){
      System.out.println(msg);
      return;
    }
  }
  ```
## 封包（Package）：多檔案、多類別專案的分群工具
### 多個程式檔案：調用的類別名稱必須和檔案名稱一致
- 建立一個 檔案名稱一.java
  ```java
  class 類別一{
    public static void main(String[] args){
      System.out.println(類別二.PI);
    }
  }
  ```
- 建立一個 檔案名稱二.java
  ```java
  class 類別二{
    static double PI = 3.1415926;
  }
  ```
- **檔案名稱二**，必須和**類別二**的名稱完全相同，否則會產生錯誤，無法順利調用
- **常見的習慣**
### 封包：對應專案中的資料夾
- 專案根資料夾
  - folder1
  - folder2
    - subfolder21
- 預設封包，無名稱
  - 對應封包名稱folder1
  - 對應封包名稱folder2
    - 對應封包名稱folder2.subfolder21
### 封包：用來分群程式檔案／類別
- 專案根資料夾
  - -App.java
  - -BasicMath.java
  - -Matrix.java
  - -Rectangle.java
  - -BasicCrawler.java
  - -FBCrawler.java
- 預設封包，無名稱
  - -App.java
    - math
      - -BasicMath.java
      - -Matrix.java
        - geometry
          - -Rectangle.java
    - crawler
      - FBCrawler.java
      - BasicCrawler.java
## 基礎權限控制
### 權限控制基本觀念：類別、屬性和方法的調用限制
- **預設權限**：僅同個封包中的其他類別可以調用
  ```java
  class BasicMath{
    static double PI = 3.1415926;
    static int add(int n1,int n2);{
      return n1 + n2;
    }
  }
  ```
- **公開權限**:使用public關鍵字，可被所有其他類別調用
  ```java
  public class BasicMath{
    public static double PI = 3.1415926;
    public static int add(int n1,int n2){
      return n1 + n2;
    }
  }
  ```
### 管理三個類別：基本結構對應
- *專案根資料夾（預設封包）*
  - -App.java
    - *math*
      - -BasicMath.java
        - *geometry*
          - -Rectangle.java
- App.java所屬封包名稱「無名稱」
  ```java
  class App{
    public static void main(String[] args){
      //程式進入點
    }
  }
  ```
- BasicMath.java所屬封包名稱「math」
  ```java
  class BasicMath{
    static double PI = 3.1415296;
  }
- Rectangle.java所屬封包名稱「math.geometry」
  ```java
  class Rectangle{
    static double G_RATIO = 1.618;
  }
  ```
### 宣告所屬封包：使用package關鍵字宣告
- *專案根資料夾（預設封包）*
  - -App.java
    - *math*
      - -BasicMath.java
        - *geometry*
          - -Rectangle.java
- App.java所屬封包名稱「無名稱」
  ```java
  class App{
    public static void main(String[] args){
      //程式進入點
    }
  }
  ```
- BasicMath.java所屬封包名稱「math」
  ```java
  pakage math;//宣告所屬封包，須在程式最前面
  class BasicMath{
    static double PI = 3.1415296;
  }
- Rectangle.java所屬封包名稱「math.geometry」
  ```java
  pakage math.geomrtry;//宣告所屬封包，須在程式最前面
  class Rectangle{
    static double G_RATIO = 1.618;
  }
  ```
### 調用封包中的類別：使用 *封包名稱.類別名稱* 調用
- *專案根資料夾（預設封包）*
  - -App.java
    - *math*
      - -BasicMath.java
        - *geometry*
          - -Rectangle.java
- App.java所屬封包名稱「無名稱」
  ```java
  class App{
    public static void main(String[] args){
      System.out.print(math.BasicMath.PI);//調用失敗：預設不可被封包外的類別使用
    }
  }
  ```
- BasicMath.java所屬封包名稱「math」
  ```java
  pakage math;//宣告所屬封包，須在程式最前面
  class BasicMath{
    static double PI = 3.1415296;
  }
- Rectangle.java所屬封包名稱「math.geometry」
  ```java
  pakage math.geomrtry;//宣告所屬封包，須在程式最前面
  class Rectangle{
    static double G_RATIO = 1.618;
  }
  ```
### 權限控制：使用public宣告可以被封包外的類別使用
- *專案根資料夾（預設封包）*
  - -App.java
    - *math*
      - -BasicMath.java
        - *geometry*
          - -Rectangle.java
- App.java所屬封包名稱「無名稱」
  ```java
  class App{
    public static void main(String[] args){
      System.out.print(math.BasicMath.PI);
    }
  }
  ```
- BasicMath.java所屬封包名稱「math」
  ```java
  pakage math;//宣告所屬封包，須在程式最前面
  public class BasicMath{
    public static double PI = 3.1415296;
  }
- Rectangle.java所屬封包名稱「math.geometry」
  ```java
  pakage math.geomrtry;//宣告所屬封包，須在程式最前面
  public class Rectangle{
    public static double G_RATIO = 1.618;
  }
  ```
### 載入類別：使用import *封包名稱.類別名稱* 載入
- *專案根資料夾（預設封包）*
  - -App.java
    - *math*
      - -BasicMath.java
        - *geometry*
          - -Rectangle.java
- App.java所屬封包名稱「無名稱」
  ```java
  import math.BasicMath;
  class App{
    public static void main(String[] args){
      System.out.print(math.BasicMath.PI);
    }
  }
  ```
- BasicMath.java所屬封包名稱「math」
  ```java
  pakage math;//宣告所屬封包，須在程式最前面
  public class BasicMath{
    public static double PI = 3.1415296;
  }
- Rectangle.java所屬封包名稱「math.geometry」
  ```java
  pakage math.geomrtry;//宣告所屬封包，須在程式最前面
  public class Rectangle{
    public static double G_RATIO = 1.618;
  }
  ```
### 載入封包中所有類別：使用import *封包名稱.** 載入封包中所有類別
- *專案根資料夾（預設封包）*
  - -App.java
    - *math*
      - -BasicMath.java
        - *geometry*
          - -Rectangle.java
- App.java所屬封包名稱「無名稱」
  ```java
  import math.geometry,*;
  class App{
    public static void main(String[] args){
      System.out.print(Rectangle.G_RATIO);
    }
  }
  ```
- BasicMath.java所屬封包名稱「math」
  ```java
  pakage math;//宣告所屬封包，須在程式最前面
  public class BasicMath{
    public static double PI = 3.1415296;
  }
- Rectangle.java所屬封包名稱「math.geometry」
  ```java
  pakage math.geomrtry;//宣告所屬封包，須在程式最前面
  public class Rectangle{
    public static double G_RATIO = 1.618;
  }
  ```
