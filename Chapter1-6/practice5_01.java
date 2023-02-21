/*一个人有10，0000元
  大于50000时过一次路口要交5%的路费
  小于50000时，过一次路口要交1000
  求此人能过几次路口
  用while break
*/
public class practice5_01 {
	
	public static void main(String[] args) {
		
		double rmb = 100000; //金额一般用double来表示
		int count = 0; //统计次数
		while(true) { //无限循环
			if(rmb > 50000) {
				rmb -= rmb*0.05; //不能用%来表示百分数，要用小数来表示
				count++; //rmb减少一次就统计一次
			} else if (rmb >= 1000) {
				rmb -= 1000; 
				count++; //rmb减少一次就统计一次
			} else{
				break; //不足1000元就break
			}			
		}
		System.out.println("通过次数为" + count + "还剩" + rmb);
	}
}

