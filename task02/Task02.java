package task02;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task02 {

	public static void main(String[] args) {
		// 変数を使ってのHello Worldの表示
		String greeting = "Hello World";
		System.out.println(greeting);
		
		// 1~10までを足した結果を表示
		int num = 0;
		for (int i = 1; i <= 10; i++) { num += i; }
		System.out.println(num);
		
		// 3年後の今日の曜日
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime afterThree = today.plusYears(3);
		DayOfWeek week = afterThree.getDayOfWeek();
		System.out.println(week);
		
		// 引数0ならfalse、1ならtrueの実行、表示
		System.out.println(judge(1));
		
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
		Map<String, String> seventeen = new HashMap<>();
		seventeen.put ("推し", "정한");
		seventeen.put ("顔推し", "조슈아");
		seventeen.put ("沼", "에스쿱스");
		for (String key : seventeen.keySet()) {
			System.out.println(key + ":" + seventeen.get(key));
		}
	}
	
		// 引数0ならfalse、1ならtrueのメソッド
	public static boolean judge (int num) {
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}
}
