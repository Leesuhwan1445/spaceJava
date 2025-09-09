package classes2;

public class MyMathTest {
    public static void main(String[] args) {
        //메서드 사용
        // MyMath math = new MyMath();

        // System.out.println(math.abs(-6));

        //클래스 이름으로 직접 접근
        int val1 = Math.abs(-6);
        System.out.println(val1);

        int val2 = Math.min(10,20);
        System.out.println(val2);
    }
}
