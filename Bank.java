
import java.util.Scanner;
public class Bank{
static Scanner var=new Scanner(System.in);
	public static void main(String[] args) {
	
    int choice;
	double balance=0;
	boolean isRuning=true;
		System.out.println("1.Show Balance");
		System.out.println("2.Deposite the Amount");
		System.out.println("3.WithDraw the Amount");
		System.out.println("4.Exit");
		System.out.println("1.Show Balance");
		while(isRuning){
	System.out.println("enter the choice(1-4)");
	choice=var.nextInt();
	switch(choice){
		case 1->ShowBalance(balance);
		case 2->balance+=Deposite();
		case 3->balance-=WithDraw(balance);
		case 4->isRuning=false;
		default-> System.out.print("Incorrect Choice");
		}
	}
		var.close();
	}
	static void ShowBalance(double balance){
	System.out.println("your Balance: "+balance);
	}
	static double Deposite(){
    double amount;
	System.out.println("enter the amount: ");
	amount=var.nextDouble();
	if(amount<0){
	System.out.println("re-enter positive amount");
	return 0;
	}
	else{
	return amount;
	}
	}
	static double WithDraw(double balance){
	double amount;
	System.out.println("enter the amount: ");
	amount=var.nextDouble();
	if(amount>balance){
	System.out.println("en-sufficent amount");
	return 0;
	}else if(amount<0){
	System.out.println("enter positive amount");
	return 0;
	}
	else{
	return amount;
	}
	}
}