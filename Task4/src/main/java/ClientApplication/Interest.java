package ClientApplication;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Interest
{
	public Interest()
	{
		Scanner scan=new Scanner(System.in);
		int chioce;
		float total_amount = 0,amount,rate_of_interest,time_period;
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("Enter the option in which you want to calculate interest:\n1)simple interest\n2)compound interest\n");
		chioce=scan.nextInt();
		output.println("enter principle amount");
		amount=scan.nextFloat();
		output.println("enter rate of interest");
		rate_of_interest=scan.nextInt();
		output.println("time (in years)");
		time_period=scan.nextFloat();
		switch(chioce)
		{
		case 1:
			total_amount=(amount*rate_of_interest*time_period)/100;
			output.println("amount="+(amount+total_amount));
			break;
		case 2:
			total_amount=(float) (amount*(Math.pow((1-rate_of_interest), time_period)));
			output.println("amount="+(amount+total_amount));
			break;
		default:
			output.println("please select a valid option");
		}
	}
}