public class InheritanceEx {
    public static void main(String[] args) {
        System.out.println("This is a shape class.");
        /* A1 a1 = new A1();
        a1.methodA();   
        B1 b1 = new B1();
        b1.methodA();   
        b1.methodB();   
        C1 c1 = new C1();   
        c1.methodA();   
        c1.methodB();   
        c1.methodC(); */   

        A1 a2=new B1();
        a2.methodA();
        //a2.methodB();
        // a2.methodC(); // This would cause a compile-time error since a2 is of type A1
        B1 b2=new C1();
        b2.methodA();
        b2.methodB();
        // b2.methodC(); // This would cause a compile-time error since b2 is of type B1
        C1 c2=new C1();
        c2.methodA();
        c2.methodB();
        c2.methodC();   

    }
}
class A1 {
    public void methodA() {
        System.out.println("This is method A.");
    }
}   
class B1 extends A1 {
    public void methodB() {
        System.out.println("This is method B.");
    }
}   
class C1 extends B1 {
    public void methodC() {
        System.out.println("This is method C.");
    }
}   