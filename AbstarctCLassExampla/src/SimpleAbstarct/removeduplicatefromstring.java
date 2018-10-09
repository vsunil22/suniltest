package SimpleAbstarct;

import java.util.LinkedHashSet;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class removeduplicatefromstring {

		public static void main(String[] args)
		{
			String string = "aabbccdefatafaz";

			char[] chars = string.toCharArray();
			LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
			
			for (char c : chars) {
			    charSet.add(c);
			}

			StringBuilder sb = new StringBuilder();
			for (Character character : charSet) {
			    sb.append(character);
			}
			System.out.println(sb.toString());

		}
		}