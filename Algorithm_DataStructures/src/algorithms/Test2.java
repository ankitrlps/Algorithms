package algorithms;

public class Test2 {
	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");

		if (str1 == str2) {
			System.out.println("str1 is equal to str2");
		}

		if (str2 == str3) {
			System.out.println("str2 is equal to str3");
		}

		if (str1.equals(str3)) {
			System.out.println("str1 is equals to str3");
		}
	}

}
