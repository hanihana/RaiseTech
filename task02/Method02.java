package task02;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Method02 {

	// Hello Worldを表示するメソッド
	static void hello() {
		String greeting = "Hello World";
		System.out.println(greeting);
	}
	// 1~10までを足した結果を表示するメソッド
	static void oneToTen() {
		int num = 0;
		for (int i = 1; i <= 10; i++) { num += i; }
		System.out.println(num);
	}
	// 3年後の今日の曜日を表示するメソッド
	static void weekdayAfterThreeYears() {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime afterThreeYears = today.plusYears(3);
		DayOfWeek week = afterThreeYears.getDayOfWeek();
		System.out.println(week);
	}
	
	// 引数0ならfalse、1ならtrueを返すメソッド
	static void isOne (int num) {
		boolean result;
		if (num == 1) { result = true; }
		else { result = false; }
		System.out.println(result);
	}
}
