
public class Demo {
 public static void main(String[] args)
 {	hello();
	 
 }
 public static void hello() {
	int age=20;
	if (age>18&&age<35)
	{
		System.out.println(age);
	}
	else
	{
		throw new InvalidAgeException();
	}
 }
}
