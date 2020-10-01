package paypal;
public class Outer3 {
public static int temp1 =1;
private static int temp2 =2;
public int temp3 = 3;
private int temp4 = 4;
public static class Inner {
//	private static int temp5 = 5;
//	private static int getSumOf2() {
//		return (temp1+temp2);
//	}
//	private static int getSumOf3() {
//		return (temp1+temp3);
//	}
//	private static int getSumOf4() {
//		return (temp1+temp4);
//	}
//	private static int getSumOf5() {
//		return (temp1+temp5);
//	}
	
	private static int getSum() {
	return (temp1+temp2);
}
}
public static void main(String[] args) {
	Outer3.Inner obj = new Outer3.Inner();
	System.out.println(obj.getSum());
}
}
