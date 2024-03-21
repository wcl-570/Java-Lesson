public class Test {
    public static void main(String[] args){
    String name="子棋";
    switch(name){
        case"小棋":
            System.out.println("我是小棋");
            break;
        case"子棋":
            System.out.println("我是子棋");
            break;
        default:
            System.out.println("不是小棋或子棋");
            break;
    }
}
}