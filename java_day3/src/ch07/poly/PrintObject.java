package ch07.poly;

class UserInfo {
    String name = "홍길동";

    // TODO: UserInfo를 잘 표현하도록 toString을 재정의해보자.
    public String toString() {
    	return "name: " + name;
    }

    // END
}

class MemberInfo extends UserInfo {
    String grade = "정회원";

    // TODO: MemberInfo를 잘 표현하도록 toString을 재정의 해보자.
    public String toString() {
    	return super.toString() + " , grade: " + grade;
    }
    // END
}

public class PrintObject {

    public static void main(String[] args) {
        Object member = new MemberInfo();
        System.out.print(member);
    }
}
