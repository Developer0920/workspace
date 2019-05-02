package java0502_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java124_RegEx {

	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "cont", "date",
				"disc" };

		String[] pattern = { ".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\w",
				"c\\d", "c.*t", "[b|c].*", ".*a.*", "a.*", ".*a.+", "[b|c].{2}" };

		for (int x = 0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + " 결과 : ");

			for (int i = 0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if (m.matches())
					System.out.print(data[i] + ",");
			}

			System.out.println();
		}

		Pattern p = Pattern.compile("c[a-z]*");

		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);

			if (m.matches())
				System.out.print(data[i] + ",");
		}
	}
}
