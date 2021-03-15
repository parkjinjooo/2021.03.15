package day0315;
// 강아지 클래스

// 필드: 이름, 등록번호(String), 품종, 나이
// 메소드: 사료먹기(사료종류), 짖기(), 자기(), 객체간 비교()

public class Dog {
    // 1. 필드
    String name;
    String id;
    String breed;
    int age;

    public void eat(String food) {
        System.out.println(food + "를 먹습니다!");
    }

    public void bark() {
        System.out.println("멍멍");
    }

    public void sleep() {
        System.out.println("쿨쿨");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog d = (Dog) obj;
            if (id.equals(d.id)) {
                return true;
            }
        }

        return false;
    }

}
