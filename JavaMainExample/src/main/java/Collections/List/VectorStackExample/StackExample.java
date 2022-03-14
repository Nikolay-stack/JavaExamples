package Collections.List.VectorStackExample;

public class StackExample {
    public static void abc1(){
        System.out.println("abc1 start");
        System.out.println("abc1 end");
    }

    public static void abc2(){
        System.out.println("abc2 start");
        abc1();
        System.out.println("abc2 end");
    }

    public static void abc3(){
        System.out.println("abc3 start");
        abc2();
        System.out.println("abc3 end");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        abc3();
        System.out.println("main end");
    }
}
