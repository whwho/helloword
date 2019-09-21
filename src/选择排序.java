import java.util.Arrays;
/*
 * 选择排序
 * 不稳定
 * 时间复杂度：最好O(N)，平均O(N2)，最坏O(N2)
 * 空间复杂度：O(1)
 */
public class 选择排序 {
	public static void xuanze(int[] arr){
		for(int i=0;i<arr.length;i++){
			//选择最小的数放在前面
			int index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index=j;//保存最小下标
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr={8,1,3,2,7,5};
		xuanze(arr);
		System.out.print(Arrays.toString(arr));
	}

}
