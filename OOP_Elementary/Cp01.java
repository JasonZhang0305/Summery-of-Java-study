
public class Cp01 {
	
	public static void main(String[] args) {

		String[] strs = {"zzj", "zjj", "jzj", "jzz"};
		Tools findS = new Tools();
		int index =  findS.find("zj", strs);
		System.out.println("索引为" + index);
	}
}
//编写一个类，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引
//如果找不到，返回-1
//分析：
//1. 类名 Tools
//2. 方法名 find
//3. 返回值 int
//4. 形参 （String, String[]）

class Tools {
	
	public int find(String findStr, String[] strs) {
		// 如果查到返回索引...如果没查到返回-1 -> 分支结构
		// 在数组中查询一个值并返回索引 -> 遍历数组 -> 循环结构
		for (int i = 0; i < strs.length; i++) {
			if (findStr.equals(strs[i])) { //字符串的判断要用equals!!
				return i;
			}
		}
		return -1;
	} 	
}