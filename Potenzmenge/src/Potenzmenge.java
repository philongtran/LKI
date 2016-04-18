/**
 * 
 * @author Phi Long Tran
 *
 */

public class Potenzmenge {

	public static void main(String[] args) {
		int[] b = new int[5];
		String binary;
		String potenzmenge = "P({";
		String result = "";
		String menge = "M = { 1, 2, 3, 4, 5 }";
		char bi;

		for (int i = 0; i < 5; i++) {
			b[i] = i + 1;
		}
		System.out.println(menge);

		for (int i = 0; i < 32; i++) {
			binary = Integer.toBinaryString(i);
			while (binary.length() < 5) {
				binary = "0" + binary;
			}
			System.out.println(binary);
			for (int a = 0; a < 5; a++) {
				bi = binary.charAt(a);
				if (Character.getNumericValue(bi) == 1) {
					result = result + " " + b[a] + ",";
				}
			}
			if (result.length() > 2)
				result = result.substring(0, result.length() - 1);
			potenzmenge = potenzmenge + result + " })";
			System.out.println(potenzmenge);
			result = "";
			potenzmenge = "P({";
		}
	}

}
