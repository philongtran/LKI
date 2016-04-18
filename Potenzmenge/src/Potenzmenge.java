/**
 * 
 * @author Phi Long Tran
 *
 */

public class Potenzmenge {

	public static void main(String[] args) {
		int elements = 5;
		int[] menge = new int[elements];
		String binary;
		String potenzmenge = "P({";
		String result = "";
		String mengeString = "M = {";
		char bi;

		for (int i = 0; i < elements; i++) {
			menge[i] = i + 1;
			mengeString = mengeString + " " + menge[i] + ",";
		}
		mengeString = mengeString.substring(0, mengeString.length() - 1);
		System.out.println(mengeString + " }");

		for (int i = 0; i < Math.pow(2, elements); i++) {
			binary = Integer.toBinaryString(i);
			while (binary.length() < elements) {
				binary = "0" + binary;
			}
			System.out.println(binary);
			for (int a = 0; a < elements; a++) {
				bi = binary.charAt(a);
				if (Character.getNumericValue(bi) == 1) {
					result = result + " " + menge[a] + ",";
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
