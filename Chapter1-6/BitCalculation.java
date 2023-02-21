public class BitCalculation {
	public static void main(String[] args) {
	    int a = 2;
	    int b = 3;
	    System.out.println(a|b);
	    /* 2的补码 00000000 00000000 00000000 00000010
	       3的补码 00000000 00000000 00000000 00000011
	     2｜3的补码 00000000 00000000 00000000 00000011
	     2｜3的原码同上，所以结果为3
	    */
	    System.out.println(a^b);
	    /* 2的补码 00000000 00000000 00000000 00000010
	       3的补码 00000000 00000000 00000000 00000011
	     2^3的补码 00000000 00000000 00000000 00000001
	     2^3的原码同上，所以结果为1 
	    */
	    System.out.println(3 << 2);//3 * 2 * 2= 12
	    System.out.println(16 >> 3);// 16 / 2**3 =2
	    int i = 66;
	    /* System.out.println(i++ + i);// 133
	    System.out.println(++i + i);// 134
        */
	}
}