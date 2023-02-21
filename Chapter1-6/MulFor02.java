/*统计三个班，每个班5个学生的总成绩和平均分
  统计三个班的总成绩，并求出所有学生的平均分
  统计三个班的及格人数
*/
import java.util.Scanner;
public class MulFor02 {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0; //设置总分变量
		int passNum = 0; //设置合格人数变量
		for(int i = 1; i <= 3; i++) { // 统计3个班
			double sum = 0;
			for(int j = 1; j <= 5; j++) { //统计一个班的5名学生
				System.out.println("请输入第" + i + "班第" + j + "个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >=60){ //筛选合格的分数
					passNum++; // 累计合格人数
				}
				sum += score; //累计班级总分
				System.out.println("第" + i + "班第" + j + "个学生的成绩为" 
					+ score);
			}
			System.out.println("总成绩为" + sum + "平均分=" + (sum / 5));
			totalScore += sum; //累计年级成绩总值
		}
		System.out.println("三个班的总成绩为" + totalScore + "学生的平均分为"
		 + (totalScore / 15));	
		System.out.println("及格人数有" + passNum + "名");
	}
}