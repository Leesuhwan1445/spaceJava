package classes2.car;

import classes2.singleton.CarFactory;

public class CarTest {

    public static void main(String[] args) {
        CarFactory factory1 = CarFactory.getInstance();
        
    //Car 생성자 호출
    Car car1 = factory1.createCar();
    Car car2 = factory1.createCar();
    Car car3 = factory1.createCar();


    System.out.println("차량번호 : " + car1.getCarNumber()); //1001;
    System.out.println("차량번호 : " + car2.getCarNumber()); //1002;
    System.out.println("차량번호 : " + car3.getCarNumber()); //1003;

    //인스턴스 출력 클래스 이름은 패키지이름.클레스이름
    // System.out.println(car1);

    }

}
