package task02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task02 {
	

	public static void main(String[] args) {
		Method02.hello();
		
		Method02.oneToTen();
		
		Method02.weekdayAfterThreeYears();
		
		Method02.isOne(1);
		
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
