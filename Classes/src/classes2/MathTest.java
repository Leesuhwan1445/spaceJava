package classes2;

public class MathTest {
    public static void main(String[] args) {
        //Math 클래스의 메서드 사용
        //static 메서드는 new 하지 않고, 클래스이름으로 직접 접근
        // 절대값 계산 - abs()
        int v1 = Math.abs(-4);
        System.out.println(v1);

        //반올림 - round()
        long v2 = Math.round(5.6);
        System.out.println(v2);

        //올림 - ceil()
        double v3 = Math.ceil(4.1);
        System.out.println(v3);

        //버림 - floor()
        double v4 = Math.floor(5.9);
        System.out.println(v4);

        // 동전 던지기 - 앞면 / 뒷면
        int coin = (int) (Math.random() * 2);
        System.out.println(coin);
        
        if(coin == 0)
        System.out.println("앞면");
        else
        System.out.println("뒷면");
        // int dice = (int)(Math.random() * 6) + 1;
        // System.out.println(dice);

        //주사위 눈 : 1 ~ 6
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println(dice);
        
        //문자열 추출
        String[] country = {"한국","중국","일본","미국"};

        //int idx = (int)(Math.random() * 4); //(0 ~ 3)
        int idx = (int)(Math.random() * 4);
        System.out.println(country[idx]);


    }
}
