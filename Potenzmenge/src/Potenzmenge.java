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
		int index = 0;
		String binary;
		String potenzmenge[] = new String[(int) Math.pow(2, elements)];
		String result = "";
		String mengeString = "M = {";
		String mengeString2 = "";
		String output = "P({";
		char bi;

		// fill menge with numbers and output it
		for (int i = 0; i < elements; i++) {
			menge[i] = i + 1;

			mengeString = mengeString + menge[i] + ",";
			mengeString2 = mengeString2 + menge[i] + ",";
		}
		if (elements > 0) {
			// cut of the last ","
			mengeString = mengeString.substring(0, mengeString.length() - 1);
			mengeString2 = mengeString2.substring(0, mengeString2.length() - 1);
		}
		System.out.println(mengeString + "}");
		output = output + mengeString2 + "}) = {";

		// create binary numbers
		for (int i = 0; i < Math.pow(2, elements); i++) {
			binary = Integer.toBinaryString(i);
			while (binary.length() < elements) {
				// add zeros in front for consistent look
				binary = "0" + binary;
			}
			// System.out.println(binary);
			// convert binary number to a number for the menge
			for (int index2 = 0; index2 < elements; index2++) {
				bi = binary.charAt(index2);
				if (Character.getNumericValue(bi) == 1) {
					result = result + menge[index2] + ",";
				}
			}
			if (result.length() > 2)
				// cut of the last ","
				result = result.substring(0, result.length() - 1).concat("}");
			else {
				result = result + result.concat("{}");
			}
			potenzmenge[index] = result;
			output = output + potenzmenge[i] + ",";
			result = "{";
			mengeString2 = "";
			index++;
		}
		// cut of the last ","
		output = output.substring(0, output.length() - 1);
		System.out.println(output + "}");
	}

}
