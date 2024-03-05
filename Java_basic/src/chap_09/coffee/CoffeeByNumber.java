package chap_09.coffee;

// 스타벅스 커피 시스템을 생각해보자.
// 사이렌 오더로 주문하지 않았다면 번호를 완료 신호를 받게된다.
// 사이렌 오더로 주문을 했다면 특정한 닉네임으로 완료 신호를 받게된다.
public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 주문 완료 : " + waitingNumber);
    }
}
