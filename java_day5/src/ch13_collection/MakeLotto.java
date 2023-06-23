package ch13_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random; // ctrl shift o 로 부족한거 생성 list하고 엔터 땅으로 자동완성
import java.util.Set;
//ctrl shift f??? 정렬기능 

public class MakeLotto {
	private static void testRandom() {
		Random rand = new Random();
		for(int i=0; i<6; i++) {
			int rnum = rand.nextInt(45)+1;
			System.out.println(rnum);
		}
	}
	private static void makeLottoByList() {
		List<Integer> lotto = new ArrayList<>();
		Random rand = new Random();
		for(; lotto.size() <6;) {
			int rnum = rand.nextInt(45)+1;
			if (!lotto.contains(rnum)) {
			lotto.add(rnum);
		}
		System.out.println(lotto);
	}
}

private static void makeLottoBySet() {
		Set<Integer> lotto = new HashSet<>();
		Random rand = new Random();
		for(; lotto.size()<6;) {
			int rnum = rand.nextInt(45)+1;
			lotto.add(rnum);
		}

	public static void main(String[] args) {
		testRandom();

	}

}
