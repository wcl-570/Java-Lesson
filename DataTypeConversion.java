public class DataTypeConversion {
    public static void main(String[] args) {
        //數字型態間的轉換
        //數字型態範圍大小的排序：byte < short < int < long < float < double
        //小範圍轉到大範圍：自動轉換
        /* 
        byte x=3;
        int y=x;//byte轉成int
        System.out.println(y);
        long z=y;//int轉成long
        System.out.println(z);
        double d=z;//long轉成double
        System.out.println(d);
        */

        //大範圍轉到小範圍：使用（資料型態）強制轉換
        /*
        int x=1024;
        //byte y=x; 錯誤：試圖把int轉成byte
        byte y=(byte)x;
        System.out.println(y);
        long z=102400;
        //int m=z; 錯誤：試圖把long轉成int
        int m=(int)z;
        System.out.println(m);
        //float f=3.141592689; 錯誤：試圖把double轉成float
        float f=(float)3.141592689;
        System.out.println(f);
        */

        //字串轉數字
        /*
        String text="34";
        int x=Integer.parseInt(text);
        System.out.println(x);
        text="3.1415";
        double d=Double.parseDouble(text);
        System.out.println(d);
        */

        //數字轉字串
        /* 
        int x=34;
        String s=String.valueOf(x);//把int型態的34轉成String型態的“34”
        System.out.println(s);
        long y=999999;
        s=String.valueOf(y);
        System.out.println(s);
        s=String.valueOf(3.14159F);
        System.out.println(s);
        */
    }
    
}
