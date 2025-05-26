package org.opentutorials.javatutorials.variables;

/**
 * 이 클래스는 간단한 계산을 수행합니다.
 * 
 * @author UserName
 * @version 1.0
 */
public class Calculator {

    /**
     * 두 수를 더하는 메소드입니다.
     *
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 두 숫자의 합
     */
      public int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // 객체 생성
        int a = 3;
        int b = 4;
        int c = calc.add(a, b); // add 메서드 호출
        System.out.println(c); // 결과 출력
}
}