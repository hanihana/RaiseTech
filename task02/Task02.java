package task02;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task02 {
	
	// Hello Worldを表示するメソッド
	private static void hello() {
		String greeting = "Hello World";
		System.out.println(greeting);
	}
	// 1~10までを足した結果を表示するメソッド
	private static void oneToTen() {
		int num = 0;
		for (int i = 1; i <= 10; i++) { num += i; }
		System.out.println(num);
	}
	// 3年後の今日の曜日を表示するメソッド
	private static void weekdayAfterThreeYears() {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime afterThreeYears = today.plusYears(3);
		DayOfWeek week = afterThreeYears.getDayOfWeek();
		System.out.println(week);
	}
	
	// 引数0ならfalse、1ならtrueを返すメソッド
	private static void isOne (int num) {
		boolean result;
		if (num == 1) { result = true; }
		else { result = false; }
		System.out.println(result);
	}

	public static void main(String[] args) {
		hello();
		
		oneToTen();
		
		weekdayAfterThreeYears();
		
		isOne(1);
		
		// Listの作成、表示
		List<String> bloodType = new ArrayList<>();
		bloodType.add("A型");
		bloodType.add("B型");
		bloodType.add("O型");
		bloodType.add("AB型");
		for (String s : bloodType) {
			System.out.println(s);
		}
		
		// Mapの作成。表示
		Map<String, String> japaneseKoreanMap = new HashMap<>();
		japaneseKoreanMap.put ("ひとつ", "하나");
		japaneseKoreanMap.put ("ふたつ", "둘");
		japaneseKoreanMap.put ("みっつ", "셋");
		for (String key : japaneseKoreanMap.keySet()) {
			System.out.println(key + ":" + japaneseKoreanMap.get(key));
		}
	}

}
