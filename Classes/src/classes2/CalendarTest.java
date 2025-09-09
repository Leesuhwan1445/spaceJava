package classes2;
/*
 * java util 패키지(import 해야함)에 있는 Calendar
 * Calendar 날짜 및 시간 관련 메서드를 가지고 있음
 * -static에 있는 메서드를 포함하고 있어서 new 하지 않고 
 * Caledar로 직접 접근
 * 
 */

 import java.util.Calendar;

public class CalendarTest {
    //Calendar 인스턴스 생성
    public static void main(String[] args) {

    Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        //현재 날짜와 시간 출력 getTime()
        System.out.println(cal.getTime());

        //날짜 - 년 월 일 -get()
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);

        int date = cal.get(Calendar.DATE);

        // 시 분 초
        int hour = cal.get(Calendar.HOUR);

        int minute = cal.get(Calendar.MINUTE);
        
        int second = cal.get(Calendar.SECOND);

        System.out.println(hour + " : " + minute + " : " + second + " : ");

        // 일 월 화
        int day = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

        String[] days = {"일","월","화","수","목","금","토",};
        System.out.println("오늘은" + days[day-1] + "요일이다.");

    }
    
}
