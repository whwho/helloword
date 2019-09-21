package 交换排序;

import java.util.Arrays;
/*
 * 冒泡排序属于交换排序
 * 稳定
 * 时间复杂度：最好O(n),平均O(n2),最坏O(n2)
 * 空间复杂度：O(1)
 */
public class maipao {
	static int count=0;
	public static void test(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
				count++;
			}
			if(flag){
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr={3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
		test(arr);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.print(count);
	}

}
