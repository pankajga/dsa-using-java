package searching_sorting;

public class LinearSearch {
	
	public static int linearSearch(int[] input, int search) {
		for(int i=0; i<input.length; i++) {
			 if(input[i] == search) {
				 return i;
			 }
		 }
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {4,1,3,6,8};
		 int search = 3;
		 System.out.println(linearSearch(arr, search));
	}

}
