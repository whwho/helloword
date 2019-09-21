package 插入排序;

import java.util.Arrays;
/*
 * 插入排序
 * 稳定
 * 时间复杂度：最好O(n),平均O(n2),最坏O(n2)
 * 空间复杂度：O(1)
 */
public class charu {
	public static void sort(int[] arr){
		int j=0;
		int temp=0;
		for(int i=1;i<arr.length;i++){
			/*
			 * 第一个for循环
			 * 把数组分成两部分，右边为未排序，左边为已排序
			 * 记录排序与未排序分割点temp（temp为下一个排序对象）
			 */
			temp=arr[i];
			for(j=i-1;j>=0;j--){
				/*
				 * 第二个for循环
				 * 将排序对象temp与已排序数组比较
				 * 当temp比最近左边的数大时（按从小到大循序排列时）
				 * 直接结束本次循环，进行下一个数排序
				 * 否则比左边这个数小时将这个数后移，腾出这个数的位置
				 */
				if(arr[j]>temp){
					arr[j+1]=arr[j];
				}else{
					break;
				}
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,32,3,12,33};
		sort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
