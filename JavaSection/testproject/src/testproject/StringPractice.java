package testproject;

public class StringPractice {

	static void tryString() {
		String s1 = "Wen Shufa";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(0));
		System.out.println(s1.concat(" test"));
		System.out.println(s1.contains("Wen"));
		System.out.println(s1.endsWith("fa"));
		System.out.println(s1);
	}
	
	static void tryStringBuilder() {
		//	mutable, modify the same string reference
		StringBuffer s1 = new StringBuffer();
		s1.append("Wen Shufa");
		System.out.println(s1.capacity());
		System.out.println(s1);
		s1.append("is a good man");
		System.out.println(s1.capacity()); // if more than the default size 16, then new size = 16 * 2 + 2
		System.out.println(s1);
	}

	public static void reverseString(String s) {
		StringBuffer res = new StringBuffer();
		for(int i =s.length() -1; i >= 0; i--) {
			res.append(s.charAt(i));
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tryString();
		// tryStringBuilder();
		reverseString("Wen Shufa");
	}

}
