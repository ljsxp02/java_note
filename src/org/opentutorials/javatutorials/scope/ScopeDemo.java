package org.opentutorials.javatutorials.scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v);
    }
}
 
public class ScopeDemo {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}