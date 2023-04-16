package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	
	static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while(i < j) {
            while(arr.get(i) <= pivot && i <= high-1) {
                i++;
            }
            //System.out.println("17");
            while(arr.get(j) > pivot && j >= low+1) {
                j--;
            }
            //System.out.println("21");
            if(i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                //j--;
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void quickSort(List<Integer> arr, int low, int high) {
        if(low < high) {
            int pIndex = partition(arr, low, high);
            //System.out.println("after pIndex");
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
            //System.out.println(arr);
        }
        //System.out.println(arr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList(Arrays.asList(new Integer[]{4,6,2,5,7,9,1,3}));
		System.out.println(arr);
		quickSort(arr, 0, arr.size()-1);
		System.out.println(arr);
	}

}
