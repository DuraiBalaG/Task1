package org.emp;
public class Count {
//	private int SumOfNumber(int num ) {
//		int qu=num,rem=0,sum=0;
//		boolean status;
//		 while (qu>0) {
//			 rem=qu%10;
//			 sum=sum+rem;
//			 qu=qu/10;
//		}
//		return sum;
//		 
//	}
//public static void main(String[] args) {
//	Count c = new Count();
//	int i = c.SumOfNumber(141);
//	System.out.println(i);
//	int i1 = c.SumOfNumber(12345);
//	System.out.println(i1);
//	
//}
	private int SumOfNumber(int num ) {
		int qu=num,rem=0,sum=0;
		boolean status;
		 while (qu>0) {
			 rem=qu%10;
			 sum=sum+1;
			 qu=qu/10;
		}
		return sum;
		 
	}
public static void main(String[] args) {
	Count c = new Count();
	int i = c.SumOfNumber(141);
	System.out.println(i);
	int i1 = c.SumOfNumber(12345);
	System.out.println(i1);
	
}
}
