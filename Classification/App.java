class Test1 {
    //類別的屬性 Class Attribute/Static Attribute
    static int a = 10;
    static String s = "Hello Class";
}
class Test2 {
    static double a = 3.4;
    public static void main(String[] args) {
        System.out.println(Test1.a);//10
        System.out.println(Test1.s);//Hello Class
        System.out.println(Test2.a);//3.4
        Test1.a ++;
        a = Test2.a+10;
        System.out.println(Test1.a);//11
        System.out.println(a);//13.4
    }
}
