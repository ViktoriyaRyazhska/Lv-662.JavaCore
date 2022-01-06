package hw3;

import java.util.Map;

public class IntegerToRoman {

	static String intToRoman(int num) {
		
		String[] m = {"", "M", "MM", "MMM"};
		String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		return m[num / 1000] + c[(num % 1000) / 100] + x[(num % 100) / 10] + i[num % 10];		
    }
	
	static int romanToInt(String s) {
		
		String modified  = s.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX")
				.replace("XC", "LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC");
		
		Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 
				'D', 500, 'M', 1000);
		
		int answer = 0;
		
		for (char c : modified.toCharArray()) {
			answer += map.get(c);
		}
		
		return answer;
        
    }
	
	public static void main(String[] args) {
		
		System.out.println(intToRoman(2923));
		System.out.println(romanToInt("MMCMXXIII"));

	}

}
