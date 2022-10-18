package searching_sorting;

public class BinarySearch {
	
	public static int binarySearch(int[] input, int search) {
		int start = 0;
		int end = input.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(search < input[mid]) {
				end = mid-1;
			}
			else if(search > input[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,6,8};
		int search = 8;
		System.out.println(binarySearch(arr, search));
	}

}
