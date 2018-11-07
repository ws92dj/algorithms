package algoritms;

import java.util.Arrays;
import java.util.Random;

import edu.princeton.cs.algs4.Merge;

public class ArraySortTest {
	private static double[] arr;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int length = 100000000;
		arr = new double[length];
		
		Random random = new Random();
		double tmp ;
		for(int i = 0;i < length;i++){
			tmp = random.nextDouble();
			arr[i] = tmp;
			
			
		}
		
		/*long sortStart = System.currentTimeMillis();
		quickSort(arr, 0, length-1);
		long sortEnd = System.currentTimeMillis();
		System.out.println("quickSort时间：" +(sortEnd-sortStart)/(1000.0)+"秒");*/
		
		   long sortStart = System.currentTimeMillis();
		    Arrays.sort(arr);
		   long sortEnd = System.currentTimeMillis();
		    //sortEnd = System.currentTimeMillis();
		    System.out.println(" Array默认排序时间: " + (sortEnd - sortStart) / (1000.0) + "秒");
	}
	
	private static void quickSort(double[] arr,int lo,int hi){
		if(hi- lo < 2) return ;
		int mi = partition(arr,lo,hi);
		quickSort(arr,lo,mi);
		quickSort(arr,mi+1,hi);
		
		
	}
	private static int partition(double[] arr,int lo,int hi){
		double pivot = arr[lo];
		while(lo < hi){
			while(lo < hi && (arr[hi] <= pivot))
				hi--;
			arr[lo] = arr[hi];
			while(lo < hi &&(pivot <= arr[lo]))
				lo++;
			arr[hi] = arr[lo];
		}
		arr[lo] = pivot;
		return lo;
		
	}
}
