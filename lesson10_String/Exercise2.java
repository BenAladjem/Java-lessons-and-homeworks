package lesson10_String;

public class Exercise2 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * You are given a text. Write a program that
	 * makes changes the text in all regions identified
	 * by the tags <upcase> and </upcase> to
	 * uppercase. The tags cannot be nested
	 */
	public static void main(String[] args) {
		String text = "We are living in a <upcase>yellow " +
				"submarine</upcase>. We don't have " +
				"<upcase>anything</upcase> else.";
		String openTag = "<upcase>";
		String closeTag = "</upcase>";
		
		String result = "";
		
		int index = 0;
		while(index<text.length()) {
			int openTagIndex = text.indexOf(openTag, index);
			if(openTagIndex == -1) {
				result+= text.substring(index);
				break;
			}
			int closeTagIndex = text.indexOf(closeTag, openTagIndex);
			result += text.substring(index, openTagIndex);
			result += text.substring(openTagIndex+openTag.length(), closeTagIndex).toUpperCase();
			index = closeTagIndex+closeTag.length();
		}
		
		System.out.println(result);
	}

}
