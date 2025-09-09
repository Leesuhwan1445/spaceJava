package classes2.car;
/*
 * static이 있는 변수는
 * 그 값을 생성된 인스턴스가 공유함(유지)
 * 
 */

public class Car {
    private int serialNum = 1000;
    private int carNumber;

    public Car(){
        serialNum++; // serialNum = serialNum + 1
        carNumber = serialNum;
    }
    //차량번호를 반환(가져오기)
    public int getCarNumber() {
        return carNumber;
    }
}