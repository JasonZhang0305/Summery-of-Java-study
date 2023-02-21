
//临时变量的使用
public class Temp {
	public static void main(String[] args) {
	    int i = 1;// i=1
        i = i++;/*从右边开始运算，i++为先赋值后运算，但是无值可赋，
        所以引入临时变量temp i -> temp=1 ; i = i+1; temp -> i = 1
        */
        System.out.println(i);//1 
        int j = 1;
        j = ++j;// j = j+1 =2; j -> temp = 2; temp -> j =2  
        System.out.println(j);//2
	}
}