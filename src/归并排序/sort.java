package 归并排序;

import java.util.Arrays;
/*
 * 归并排序
 * 稳定
 * 时间复杂度：最好O(N*log2N)，平均O(N*log2N)，最坏O(N*log2N)
 * 空间复杂度：O(n)
 */
public class sort {
	//arr1:有序数组1，size1：arr1的元素个数，arr2：有序数组2，size2:arr2的元素个数
	public static int[] sort(int[] arr1,int size1,int[] arr2,int size2,int[] array){
		int a=0,b=0,c=0;
		while(a<size1&&b<size2){
			if(arr1[a]<arr2[b]){
				array[c++]=arr1[a++];
			}else{
				array[c++]=arr2[b++];
			}
		}
		while(a<size1){
			array[c++]=arr1[a++];
		}
		while(b<size2){
			array[c++]=arr2[b++];
		}
		return array;
	}
	public static int[] test(int[] arr1,int[] arr2,int[] array){
		return sort(arr1,arr1.length,arr2,arr2.length,array);
	}
	public static void main(String[] args) {
		int arr1[]= {23,47,81,95};
		int arr2[]= {7,14,39,55,62,74};
		int array[]= new int[arr1.length+arr2.length];
		array=test(arr1,arr2,array);
		System.out.print(Arrays.toString(array));
	}

}
