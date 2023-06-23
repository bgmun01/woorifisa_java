package ch07.a_extend.spider;


// extends :  is a - single inheritance 단일 상속
public class SpiderMan extends Person{  //이러면 상속 끝
	boolean isSpider;
	// 상속 이외에 기능을 사용하고 싶다면  has  a 포함 관계를 사용한다.
	Spider spider = new Spider();
	
	public SpiderMan(String name) {
		super(name); // 이게 생략?
	}
	
	public SpiderMan(String name, boolean isSpider) {
		super(name);
		this.isSpider = isSpider;
		
	}
	public SpiderMan(String name, boolean isSpider, Spider spider) {
//		this.name = name;
//		this.isSpider = isSpider;
		this(name, isSpider);
		this.spider = spider;
	}
	
	public void fireWeb() {
		//System.out.println("어떻게 쏘지???");
		if(this.isSpider) {
			this.spider.fireWeb();
		}else {
			System.out.println("사람은 안돼");
		}
	} // 메서드 오버로딩 : 메서드 추가, 이름은 같고, 파라미터가 다르다
		void fireWeb(String gun) {
			System.out.println(gun+"발사 !!");}
		
	
			
		
		// method override : 조상의 메서드를 덮어쓰기, 창조적 계승 발전
		public void jump() {
			if(this.isSpider) {
				this.spider.jump();
			} else {
			//	System.out.println("뛰기");
			// 조상의 메서드를 부르자 !! this. : 자신의 reference, super. : 조상의 reference
				super.jump();
			}
		}
	}
