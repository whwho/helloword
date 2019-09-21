package 交换排序;

import java.util.Arrays;
/*
 * 快速排序是对冒泡排序的改进
 * 不稳定
 * 时间复杂度：最好O(N*log2N)，平均O(N*log2N)，最坏O(N2)
 * 空间复杂度：O(log2n)~O(n)
 */
public class 快速排序 {
	//arr:待排序的数组，left:0		，right:arr.length-1
	public static void sort(int[] arr,int left,int right){
		
		if(left<right){
			int l=left,r=right,x=arr[left];
			while(l<r){
				while(l<r&&arr[r]>=x){
					r--;
				}
				if(l<r){
					arr[l++]=arr[r];
				}
				while(l<r&&arr[l]<x){
					l++;
				}
				if(l<r){
					arr[r--]=arr[l];
				}
			}
			arr[l]=x;
			sort(arr,left,l-1);
			sort(arr,l+1,right);
		}
	}
	public static void main(String[] args) {
		int[] arr={9,9,9,6,6,11,65,98,75,6,11,25,66,2,3,1};
		sort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}

}
