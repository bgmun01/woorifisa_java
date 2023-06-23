package ch08.e_generic.basic;

// TODO: 멤버 변수 Object some을 갖는 NormalBox를 만들어보자.(생성자, set/getter 추가)
class NormalBox {
	private Object some;

	public NormalBox(Object some) {
		this.some = some;
	}

	public void setSome(Object some) {
		this.some = some;
	}

	public Object getSome() {
		return this.some;
	}
}
// END

// TODO: 멤버 변수 T some을 갖는 GenericBox를 만들어보자.(생성자, set/getter 추가)
class GenericBox<T>{
	T some;
	
	public GenericBox(T some) {
		this.some =  some;
	}
	
	public void setSome(T some) {
		this.some = some;
	}
	
	public T getSome() {
		return this.some;
	}
}
// END

public class BoxTest {

	private static void useNormalBox() {
		// TODO: NormalBox를 생성하고 저장된 값의 타입을 판단하고 타입에 특화된 작업을 해보자.
		NormalBox box = new NormalBox("Hello");
		Object obj = box.getSome();
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str+"은 문자열이고, 길이는 "+str.length());
		}
		box.setSome(1);
		//box.setSome(Integer.valueOf(1));
		// END
	}

	private static void useGenericBox() {
		// TODO: GenericBox를 생성하고 저장된 값의 타입을 판단하고 타입에 특화된 작업을 해보자.
		GenericBox<String> sbox = new GenericBox<>("Hello");
		String str = sbox.getSome();
		System.out.println(str+"은 문자열이고, 길이는 "+str.length());
		sbox.setSome("hi");
		
		GenericBox<Integer> ibox = new GenericBox<>(1);
		int num = ibox.getSome();
		//ibox.setSome("heelo");
		// END
	}

	public static void main(String[] args) {
		useNormalBox();
		useGenericBox();
	}
}
