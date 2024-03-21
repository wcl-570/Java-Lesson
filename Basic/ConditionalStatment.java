import java.util.Scanner;
public class ConditionalStatment {
    public static void main(String[] args) {
        //使用標準輸入（從終端機輸入資料）
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數：");
        int x = s.nextInt();
        System.out.println(x*10);
        */
        //if判斷式
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("請問你想領多少錢？：");
        int money = s.nextInt();
        if(money>100000){
            System.out.println("Too much");
        }else if(money>=100){
            System.out.println("OK");
        }else{
            System.out.println("Too little");
        }
        */
        //switch判斷式
        int n1 = 3;
        int n2 = 4;
        System.out.println("請問你想做什麼運算？(+-*/)");
        Scanner s = new Scanner(System.in);
        String op = s.next();
        System.out.println("使用者輸入的運算符號：");
        System.out.println(op);
        switch(op){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("不支援的運算");
                break;
        }
    }
}
