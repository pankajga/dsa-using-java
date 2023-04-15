package recursion;

public class MergeSort {
	
	static void merge(int[] arr, int low, int mid, int high, int n) {
		int[] output = new int[n];
		int left = low;
		int right = mid+1;
		int counter = 0;
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				output[counter] = arr[left];
				left++;
				counter++;
			}
			else {
				output[counter] = arr[right];
				right++;
				counter++;
			}
		}
		while(left <= mid) {
			output[counter] = arr[left];
			left++;
			counter++;
		}
		while(right <= high) {
			output[counter] = arr[right];
			right++;
			counter++;
		}
		for(int i=low; i<=high; i++) {
			arr[i] = output[i-low];
		}
	}

	static void sort(int[] arr, int low, int high, int n) {
		if(low == high) {
			return;
		}
		int mid = (high+low)/2;
		sort(arr, low, mid, n);
		sort(arr, mid+1, high, n);
		merge(arr, low, mid, high, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4,1,3};
		int low = 0;
		int high = arr.length-1;
		sort(arr, low, high, arr.length);
	}

}