/* 要求：参加歌手比赛，如果初赛成绩大于8.0则进入决赛，否则提示淘汰。
 * 并且根据性别提示进入男子组或女子组。
 */

import java.util.Scanner;
public class If03 {

	public static void main(String[]arge){
    	
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("请选手输入成绩:");
    	double score = myScanner.nextDouble();
    	if(score > 8.0) {
    		System.out.println("恭喜您将进入决赛，请输入姓名：");
    		String name = myScanner.next();
    		System.out.println("请输入性别：");
    		char gender =myScanner.next().charAt(0);
    		//条件嵌套
    		if(gender == '男') {
    			System.out.println("恭喜" + name + "进入男子组");
    		} else if (gender == '女') {
    			System.out.println("恭喜" + name + "进入女子组");    			
    		} else {
    			System.out.println("性别有误");
    		}
    	} else {
    		System.out.println("很遗憾，您已被淘汰。");
    	}
	}
}