
public class LKI {

	public static void main(String[] args) {
		System.out.println("AB C D");
		System.out.println(evaluatea(true, true, true, true));
		System.out.println(evaluatea(true, true, true, false));
		System.out.println(evaluatea(true, true, false, true));
		System.out.println(evaluatea(true, true, false, false));
		System.out.println(evaluatea(true, false, true, true));
		System.out.println(evaluatea(true, false, true, false));
		System.out.println(evaluatea(true, false, false, true));
		System.out.println(evaluatea(true, false, false, false));
		System.out.println(evaluatea(false, true, true, true));
		System.out.println(evaluatea(false, true, true, false));
		System.out.println(evaluatea(false, true, false, true));
		System.out.println(evaluatea(false, true, false, false));
		System.out.println(evaluatea(false, false, true, true));
		System.out.println(evaluatea(false, false, true, false));
		System.out.println(evaluatea(false, false, false, true));
		System.out.println(evaluatea(false, false, false, false));

		System.out.println(evaluateb(true, true, true, true));
		System.out.println(evaluateb(true, true, true, false));
		System.out.println(evaluateb(true, true, false, true));
		System.out.println(evaluateb(true, true, false, false));
		System.out.println(evaluateb(true, false, true, true));
		System.out.println(evaluateb(true, false, true, false));
		System.out.println(evaluateb(true, false, false, true));
		System.out.println(evaluateb(true, false, false, false));
		System.out.println(evaluateb(false, true, true, true));
		System.out.println(evaluateb(false, true, true, false));
		System.out.println(evaluateb(false, true, false, true));
		System.out.println(evaluateb(false, true, false, false));
		System.out.println(evaluateb(false, false, true, true));
		System.out.println(evaluateb(false, false, true, false));
		System.out.println(evaluateb(false, false, false, true));
		System.out.println(evaluateb(false, false, false, false));

	}

	public static boolean imp(boolean x, boolean y) {
		return !x || y;
	}

	public static boolean equ(boolean x, boolean y) {
		return imp(x, y) && imp(y, x);
	}

	public static boolean evaluatea(boolean a, boolean b, boolean c, boolean d) {
		return imp(imp(a, b) && imp(b, c) && imp(c, d) && imp(d, a), equ(a, c));
	}

	public static boolean evaluateb(boolean a, boolean b, boolean c, boolean d) {
		return imp(a || b || c || d, imp(!a && !b, !d || c));
	}

}
