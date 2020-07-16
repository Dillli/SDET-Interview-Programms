package JavaInterviewPrograms;

public class NumbersWithoutUsingLoops 
{
	public static void printNumbers(int number)
	{
		if(number<=100)
		{
			System.out.println(number);
			printNumbers(number+1);
		}
	}	
	
	public static void main(String[] args) 
	{
		printNumbers(1);
	}
}
