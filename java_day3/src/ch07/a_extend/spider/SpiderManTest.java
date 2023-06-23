package ch07.a_extend.spider;

public class SpiderManTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커", true, new Spider());
		
		sman.fireWeb();
		sman.isSpider = true;
		sman.fireWeb();
		
		sman.jump();

	}

}
