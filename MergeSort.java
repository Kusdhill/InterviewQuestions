import java.util.Arrays;

public class MergeSort{
	public static void mergeSort(int[] a, int size){
		// base case
		if(size<2){
			return;
		}

		// split arrays into left and right half
		int mid = size/2;
		// "rightStart" is relative to the original array a
		int rightStart = size-mid;

		int[] left = new int[mid];
		int[] right = new int[rightStart];

		// put elements from original array into left and right halves
		for(int i=0; i<mid; i++){
			left[i] = a[i];
		}

		for(int i=mid; i<size; i++){
			right[i-mid] = a[i];
		}

		// recursive call to split arrays into left and right subarrays
		mergeSort(left, mid);
		mergeSort(right, rightStart);
		// call merge with subarrays
		merge(a, left, right, mid, rightStart);
	}

	private static void merge(int[] a, int[] left, int[] right, int mid, int rightStart){

		int leftInd = 0, rightInd = 0, aInd = 0;

		// add elements to array a. If left < right, add left to a
		while(leftInd<mid && rightInd<rightStart){
			if (left[leftInd]<right[rightInd]){
				a[aInd] = left[leftInd];
				leftInd+=1;
			}else{
				a[aInd] = right[rightInd];
				rightInd+=1;
			}
			aInd+=1;
		}

		// add the rest of the elements to a, if subarrays had odd number elements
		while(leftInd<mid){
			a[aInd] = left[leftInd];
			leftInd+=1;
			aInd+=1;
		}

		while(rightInd<rightStart){
			a[aInd] = right[rightInd];
			rightInd+=1;
			aInd+=1;
		}

	}

	public static void main(String[] args){
		int[] a = {9,4,6,2,8,5,1,3,7};
		mergeSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}