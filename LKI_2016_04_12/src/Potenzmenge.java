/**
 * 
 * @author Phi Long Tran
 *
 */

public class Potenzmenge {

	public static void main(String[] args) {
		// number of elements in the menge (change to other number if needed)
		int elements = 5;
		int[] menge = new int[elements];
		String binary;
		String potenzmenge = "P({";
		String result = "";
		String mengeString = "M = {";
		char bi;

		// fill menge with numbers and output it
		for (int i = 0; i < elements; i++) {
			menge[i] = i + 1;
			mengeString = mengeString + " " + menge[i] + ",";
		}
		if (elements > 0) {
			// cut of the last ","
			mengeString = mengeString.substring(0, mengeString.length() - 1);
		}
		System.out.println(mengeString + " }");

		// create binary numbers
		for (int i = 0; i < Math.pow(2, elements); i++) {
			binary = Integer.toBinaryString(i);
			while (binary.length() < elements) {
				// add zeros in front for consistent look
				binary = "0" + binary;
			}
			// System.out.println(binary);
			// convert binary number to a number for the menge
			for (int index = 0; index < elements; index++) {
				bi = binary.charAt(index);
				if (Character.getNumericValue(bi) == 1) {
					result = result + " " + menge[index] + ",";
				}
			}
			if (result.length() > 2)
				// cut of the last ","
				result = result.substring(0, result.length() - 1);
			potenzmenge = potenzmenge + result + " }, )";
			System.out.print(potenzmenge);
			result = "";
			// potenzmenge = "P({";
		}
	}

}
