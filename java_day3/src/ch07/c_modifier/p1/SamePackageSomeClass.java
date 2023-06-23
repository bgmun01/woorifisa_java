package ch07.c_modifier.p1;

public class SamePackageSomeClass {
    public void useMember() {
//        this.publicVar = 10; 	//사용하려면 Parent를 통해 접근 해야함
//        this.protectVar = 10;
//        this.defaultVar = 10;
//        this.privVar = 10;       
        Parent p = new Parent();
        p.publicVar = 10;
        p.protectVar = 10;
        p.defaultVar = 10;
   //   p.privVar = 10;
    }
}
