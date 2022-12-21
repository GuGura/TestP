package chapter08.exam07;

public class CarExample {
    public static void main(String[] args) {
        //자동차 객체 생성
        Car car = new Car();

        //run()메소드 실행
        car.run();

        //타이어 객체 교체
        car.tire1 = new KumHoTire();
        car.tire2 = new KumHoTire();

        //run() 메소드 실행(다형성: 실행 결과가 다르다.)
        car.run();
    }
}
