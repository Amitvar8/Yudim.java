package yudim;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//1		int x;
//		System.out.println("please enter num");
//		x = scan.nextInt();
//		if (x > 0) {
//			System.out.println("number is positive");
//
//		} else {
//			System.out.println("number is negative");
//		}
//2		int x;
//		int y;
//		System.out.println("please enter numbers");
//		x = scan.nextInt();
//		y = scan.nextInt();
//		if (x>y) {
//			System.out.println(y);
//			
//			
//		}else {
//			System.out.println(x);
//		}
//5		int x;
//		int y;
//		x = scan.nextInt();
//		y = scan.nextInt();
//		int z= x + (5-1) *y ;
//		System.out.println(z);
//		int f = x + (10-1) *y ;
//		System.out.println(f);
//   3  int num1;
//		int num2;
//		int num3;
//		int num4;
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		num3 = scan.nextInt();
//		num4 = scan.nextInt();
//		int x = num1 * num2;
//		int y = num3 * num4;
//		if(x>y) {
//		System.out.println("y");
//		
//			
//		}else {	
//		System.out.println("x");
//		
//		}
//  4   int num1,num2,num3;
//     num1 = scan.nextInt();
//     num2 = scan.nextInt();
//     num3 = scan.nextInt();
//     int x = (num1 + num2 + num3) /3;
//     System.out.println(x);		
		/*    7
		String x;
		String y;
		 String t;
		 x = scan.nextLine();
		 y = scan.nextLine();
		 t = scan.nextLine();
		 System.out.println("my name is "+ x + ",My school is "+ y + ", The number of subjects I study is "+ t );
	*/
	/*8      int x; 
	int y;
	int z;
	x = scan.nextInt();
	y = scan.nextInt();
	z = scan.nextInt();
	int sum = x+y+z;
		System.out.println(sum);
	if(sum % 2 == 0) {
		System.out.println("sum is even");
		
	}else {
		System.out.println("sum is not even");
		
	}*/
	}
}
6   int unit,num1,num2;
    System.out.println("enter num");
    unit = scan.nextInt();
    if((unit>0)&&(unit<10))
    	System.out.println(unit*1.2);
     else  if(unit>10 && unit<54) 
     {    
	    num1 = unit/10;
	    num2 = unit%10;
	    System.out.println((num1*10)+(num2 *1.2));
     }
     else if(unit==10) 
        System.out.println(10);
     else if(unit==54)	
    	System.out.println(50);
     else if((unit<108)&&(unit>54)) 
     {
        num1 = ((unit-54)/10);
        num2 = (unit-54)%10;
        System.out.println(50+(num1*10)+(num2 *1.2));
     }
     else if(unit==108) 
       	System.out.println(100);
