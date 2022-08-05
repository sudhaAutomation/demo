package basics;

public class StringsSwaping {

	public static void main(String[] args) {
		String a="Hyderabad";
		String b="Secunderbad";
		a=a+b;
		System.out.println("before swaping");
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

	}

}
