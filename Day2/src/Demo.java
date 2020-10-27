//import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		Employee e = new Employee("KAPIL",1200000, 13000);
		e.printEmp();
		Manager e1 = new Manager("KAPIL1",1200000, 13000);
		e1.printEmp();
		MarketingExecutive e3 = new MarketingExecutive("KAPIL2",1200000, 13000, 75);
		e3.printEmp();
//		System.out.println("ID: "+ Employee.empid);
//		int g = add();
		
	}
//	public static int add()	
//	{
//                  int n,sum=0;
//                  
//                  Scanner sc=new Scanner(System.in);
// 
//	    System.out.println("enter how many numbers you want sum");
//                   n=sc.nextInt();
//                   int a[]=new int[n]; 
//	    System.out.println("enter the "+n+" numbers ");
//                   for(int i=0;i<n;i++)
//                   {      
//	             System.out.println("enter  number  "+(i+1)+":");
//                           a[i]=sc.nextInt();
//                   }
//                   for(int i=0;i<n;i++)
//                   {
//                           sum+=a[i];
//                   }  	    
//                   System.out.println("sum of "+n+" numbers is ="+sum);    
//                   return sum;
//              	}

}
