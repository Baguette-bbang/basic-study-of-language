package chap_10;

public class _02_AnonymousClass2 {
    // 익명 클래스를 이용하게 된다면
    // 추상 클래스의 추상 메소드를 직접 구현하면서
     // 바로 이름 없이 추상 클래스를 구현한 객체를 전달 가능하다.
    public static void main(String[] args) {
        // 집에서 만드는 수제버거로 예시를 들어보자.
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();

        System.out.println("------------------------------");
        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {

            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추, 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해시블라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();
}

