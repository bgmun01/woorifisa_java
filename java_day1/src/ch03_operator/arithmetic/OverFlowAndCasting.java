package ch03_operator.arithmetic;

public class OverFlowAndCasting {

    public static void main(String[] args) {

        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        // TODO: i2의 값을 예상하고 출력하시오.
		System.out.println(i2 + "깨져");

        long l1 = i1 + 1;
        // TODO: l1의 값을 예상하고 출력하시오.
		System.out.println(l);

        long l2 = (long) (i1 + 1);
        // TODO: l2의 값을 예상하고 출력하시오.
		

        long l3 = (long) i1 + 1;
        // TODO: l3의 값을 예상하고 출력하시오.
		

        int i3 = 1000000 * 1000000 / 100000;
        int i4 = 1000000 / 100000 * 100000;
        // TODO: i3와 i4의 값을 예상하고 출력하시오.
		
    }
}
