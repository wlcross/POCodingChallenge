package september19;

public class SumDigits {

	public static int[] sum(int T, String[] S) {
		int[] result = new int[T];
		
		for (int i = 0; i < T; i ++) {
			char[] charray = S[i].toCharArray();
			for (int j = 0; j < charray.length; j ++) {
				if (charray[j] >= '0' && charray[j] <= '9') {
					//0 character is I believe 48 but this 
					//protects against that changing for whatever reason
					result[i] += charray[j] - '0';
				}
			}
		}
		
		return result;
	}
}
