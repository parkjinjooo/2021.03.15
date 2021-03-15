package day0315;
// 클래스 컨닝 페이퍼 
public class Class {
/*
 *  클래스란?
 *  객체지향 프로그램에서 프로그램의 최소단위이다.
 *  우리 프로그램에서는
 *  우리가 필요한 클래스를 만들어서 그 클래스의 변수인 "객체"를 통해서 
 *  그 객체를 이용하는 것이 목표가 된다.
 *  
 *  클래스의 구성요소 
 *  클래스는 필드와 메소드로 이루어져 있다.
 *  필드: 해당 클래스의 객체들이 어떤 정보를 가지고 있을지를 규정해 놓은 것
 *  메소드: 해당 클래스의 객체들이 공통적으로 가지고 있을 기능을 선언과 구현해 놓은 것
 *  
 *  생성자(Constructor)
 *  생성자란, 해당 클래스의 객체가 초기화 될때,
 *  호출되는 메소드이다.
 *  객체가 처음 초기화 될때
 *  필드의 초기값이나 특정한 행동을 해야할 경우, 우리가 직접 만들어 줄 수 있다.
 *  생성자는, 우리가 특별히 클래스 안에 만들어주지 않더라도 
 *  자바가 기본적으로 제공해준다.
 *  이러한 기본 생성자는 특별한 행동은 하지 않고
 *  기본형 데이터타입을 가진 필드는 0으로
 *  참조형 데이터타입을 가진 필드는 null로 초기화해준다. 
 *  
 *  우리가 직접 생성자를 만들어줄 수도 있는데 
 *  이때 주의해야할 점은 
 *  우리가 파라미터가 있는 생성자만 만들어줄 경우.
 *  더 이상 파라미터가 없는 생성자는 호출할 수 없다! (예시: Scanner)
 *  따라서, 파라미터가 있는 생성자와, 파라미터가 없는 생성자 모두 필요할 때에는
 *  두 종류를 다 만들어주어야 한다. 
 *  
 *  생성자를 만들 때에는
 *  리턴타입이 없어야 한다. 
 *  즉, 다음과 같은 양식을 갖춘다. 
 *  public 클래스이름(){
 *  
 *  }
 *  
 *  
 *  상속(inheritance)
 *  프로그래밍에서의 상속은 부모클래스가 가지고 있는 메소드를
 *  자식 클래스가 또 안만들어도
 *  그대로 쓸수 있게 하기 위해 사용된다. 
 *  
 *  우리가 직접 상속을 구현할 수도 있지만
 *  사실 우리가 만드는 모든 클래스들은 우리 모르게 상속을 받고 있다!
 *  자바의 모든 클래스는 java.lang.Object라는 클래스를 상속 받는다. 
 *   
 *  java.lang.Object 안에는 기본 생성자, toString(), equals() 등의
 *  기본적인 메소드가 선언과 구현되어있다. 
 *  따라서 우리가 그러한 메소드를 따로 만들지 않아도 사용 가능하다!
 *  하지만 java.lang.Object가 제공해주는 그러한 메소드들은 작은 문제가 하나 있다. 
 *  Object를 상속받는 클래스가 어떠한 필드가 있고, 어떠한 것을 기준으로 삼아서 
 *  비교를 해야하는지 모른다는 것이다.
 *  그래서, java.lang.Object 안의 메소드들은 모두다 
 *  매우 애매모호하게 구현되어있다.
 *  따라서, 우리 클래스가 해당 메소드들을 그대로 쓰기에는 문제가 있다. 
 *  그럴 경우에는 상속받은 메소드를 자식 클래스가 재정의 해주어야 하는데 
 *  이러한 메소드 재정의를 우리가 "오버라이드(override)" 라고 부른다.
 *  오바라이드를 할 때 주의할 점은 부모클래스가 메소드를 선언한 것과 똑같이 선언을 해주어야 한다는 것이다!!!
 *  
 *  오버라이드 예시)
 *  1.equals
 *  java.lang.Object는 equals 메소드를 다음과 같이 선언과 구현해놓았다.
 *  public boolean equals(Object o){
 *      return this == o
 *  } 
 *  즉, 메소드의 탈을 쓴 비교연산자 일 뿐이다!!!!
 *  
 *  따라서, 우리의 클래스가 equals() 메소드를 재정의할 때에는 
 *  위의 선언식은 똑같지만 안의 구현 내용이 달라지게 된다!
 *  
 *  
 *  
 *  
 *  다형성(polymorphism)
 *  다형성이란 "다"양한 "형"태를 가지는 "성"격을 다형성 이라고 한다. 
 *  자바에서 다형성이란, 파라미터나 리턴 타입에 부모 클래스를 적어주면 
 *  해당 부모 클래스와 그 부모 클래스를 상속받는 모든 클래스가 그 자리에 대신할 수 있는 성격을
 *  다형성이라고 한다.  
 *  예를 들어서 우리가 equals 메소드의 파라미터로 Object o 라고 적어주면 
 *  equals 메소드를 사용할 때 해당 메소드의 파라미터는 Object 클래스를 상속받는 모든 클래스가 
 *  들어갈 수 있게 된다. 
 *
 *  
 *  
 *  
 *  
 *  
 */
    
}
