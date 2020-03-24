import java.util.Arrays;

class ReverseString{
	public static void reverse(char[] arrayOfChars){
		int i = 0;
		int j = arrayOfChars.length-1;
		while(i<j){
			char temp = arrayOfChars[i];
			arrayOfChars[i] = arrayOfChars[j];
			arrayOfChars[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args){
		final char[] chars = "ABCDE".toCharArray();
		reverse(chars);
		System.out.println(Arrays.toString(chars));
	}
}