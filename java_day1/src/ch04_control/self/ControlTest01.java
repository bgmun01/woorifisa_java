package ch04_control.self;

public class ControlTest01 {

    public static void main(String[] args) {
        // TODO: 01. 1부터 20까지의 정수 중에서 2 또는(and) 3의 배수가 아닌 수의 총합을 구하시오.
//    	int sum = 0;
//    	for(int i=1; i<21; i++{
//    		if(i%2 != 0 || i%3 != 0)
//    		continue;
//    		}
//    		sum +=i;
//    	}
    	int sum = 0;
    	for (int i=1; i<=20; i++) {
    		if(i%2 !=0 && i%3!= 0) { //또는인데 &&? //숏서킷
    			sum +=i;
    		}
    	}
    	System.out.println(sum);
        // END
    }

}
