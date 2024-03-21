import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        //陣列的基本操作練習
        /*
        int [] grades = new int[]{100,90,80};
        System.out.println("陣列長度：" + grades.length);
        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 80;
        for(int i = 0;i < grades.length;i++){
            System.out.println(grades[i]);
        }
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        */
        //輸入學生的數量，以及每位學生的成績，計算平均分數
        System.out.println("請輸入學生的數量：");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int [] grades = new int[num];
        System.out.println("請輸入學生成績：");
        for(int i = 0;i < grades.length;i++){
            grades[i] = s.nextInt();
        }
        int total = 0;
        for(int i = 0;i < grades.length;i++){
            total += grades[i];
        }
        System.out.println("平均分數：" + total/grades.length);
    }
    
}
