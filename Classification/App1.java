class Test {
    public static void main(String[] args) {
        //程式進入點
        Test.talk("Hello");//呼叫類別方法
        Test.talk("你好");
        int ans = BasicMath.add(3, 5);
        System.out.println(ans*100);
        ans = BasicMath.multiply(3, 7);
        System.out.println("乘法的結果是" + ans);
        //回傳值彈性的作用，不ㄧ定要放在下方的方法中
    }
    //定義更多自己的類別方法
    static void talk(String content){
        System.out.println(content);
    }
}
class BasicMath{
    static int add(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    /* //無回傳值的方法
    static void multiply(int n1, int n2){
        int result = n1*n2;
        System.out.println(result);
    }
    */
    //有回傳值的方法
    static int multiply(int n1, int n2){
        return n1*n2; 
    }
}