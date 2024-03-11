public class DataTypeVariable {
    public static void main(String[] args) {
        // 在終端機印出各種資料型態的資料
        // 整數，預設是int型態
        int x;
        x=3;
        System.out.println(x);
        x=120;
        System.out.println(x);
        // 長整數，數字後特別加上 L
        long y=20000000000L;
        System.out.println(y);
        // 浮點數，預設為double型態
        double m=3.14159268;
        System.out.println(m);
        // 單精度浮點數，數字後特別加上 F
        float n=3.14159268F;
        System.out.println(n);
        // 布林值
        boolean b;
        b=true;
        System.out.println(b);
        // 字元
        char c='趙';
        System.out.println(c);
        // 字串：可以包含零到多個字元
        String s="趙子棋被我肛";
        System.out.println(s);
        s="小趙好漂亮";
        System.out.println(s);
    }
}
