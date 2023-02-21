//已知有个升序的数组，要求插入一个元素，该元素依旧是升序
//比如 [10, 12, 45, 90],添加23后，该数组为[10, 12, 23, 45, 90]
/*思路：先定位，再扩容
*/

public class c6P1 {
	
	public static void main(String[] args) {
		int[] arr = {10, 12, 45, 90};
		int insertNum = -1;
		int index = -1;
		for(int i = 0; i <= arr.length; i++) {
			if (insertNum <= arr[i]) {
				index = i;
				break;					
			} else if(index == -1){
				index = arr.length;
			}	
		}
		System.out.println(index);
		int[] arr2 = new int[arr.length + 1];
		for(int j = 0, i = 0; j < arr2.length; j++) {
			if (j != index) {
				arr2[j] = arr[i];
				i++;
			} else {
				arr2[j] = insertNum;
 			}
		}
		arr = arr2;
		System.out.println("========");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
}