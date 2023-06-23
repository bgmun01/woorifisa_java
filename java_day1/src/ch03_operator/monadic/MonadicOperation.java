package ch03_operator.monadic;

public class MonadicOperation {
    public static void main(String[] args) {
        // TODO: 각 단계에서 출력되는 값과 메모리에서의 값을 생각해보세요.
        int i = 5;
        i++;
        System.out.println(i);
        System.out.println("6으로 된상태이기 떄문에 그냥 6");
        ++i;
        System.out.println(i);
        System.out.println("6에서 7로 더해져서 출력");
        int j = ++i;
        System.out.println(j++);
        System.out.println("8로 더해졌고 8출력 후 9로만듬");
        System.out.println(--j);
        System.out.println("마지막은 8");
    }
}
