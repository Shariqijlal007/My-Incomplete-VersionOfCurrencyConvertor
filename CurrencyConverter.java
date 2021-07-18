package currencyconverterproject;
import java.util.Scanner;
import java.lang.Math;
public class CurrencyConverter {

	public static void main(String[] args) {
		int B=0,E;// This statement will Declare variables B and E.
		double C=0,D=0;// This statement will Declare variables C and D.
		while (B!=(-1))// This statement will allow the program to repeat itself until the user enters -1.
		{
		System.out.println();// This statement will print a blank line.
		System.out.println("***************************** Welcome to Currency Converter *******************************");// This statement will print a Welcome line.
		Scanner A=new Scanner(System.in);// This statement will allow the program to accept input from user.
		System.out.println("-----------------------------------------MENU----------------------------------------------");// This statement will print MENU.
		System.out.println("1)DOllAR                                  2)EURO                                    3)POUND");// This statement will print the Currency Choice Menu. 
		System.out.println("4)RUPEES                                  5)YEN                                     6)CNY");// This statement will print the Currency Choice Menu.
		System.out.println(" __________________________________________________________________________________________");// This statement will print a line for Instructions box.
		System.out.println("|                                       Instructions                                       |");// This statement will print Instructions.
		System.out.println("|1. To Enter your desire Home Currency, Enter the Currency Number given in the above Menu. |");// This statement will print the first instruction.
		System.out.println("|2. To Enter your desire Away Currency, Enter the Currency Number given in the above Menu. |");// This statement will print the second instruction.
		System.out.println("|3. To Exit the Program then, Enter '-1' as Home Currency.                                 |");// This statement will print the third instruction.
		System.out.println("|Note:                                                                                     |");// This statement will print a Note.
		System.out.println("|The Program will continue to run until you Enter '-1' as Home Currency.                   |");// This statement will print the important note.
		System.out.println("|__________________________________________________________________________________________|");// This statement will print a line for Instructions box.
		System.out.print("Select your Home Currency : ");B=A.nextInt();// This statement will get input from user where user can select Home Currency of his/her choice.
	switch(B)// This statement will decide which condition to follow based on the user's choice.
	{
	case 1:// This statement will make the program to execute the commands based on condition 1.
		System.out.print("Select your Away Currency : "); E=A.nextInt();// This statement will get input from user where user can select Away Currency of his/her choice.
		System.out.print("Enter Amount : "); C=A.nextDouble();// This statement will get input form user where user can enter the amount to be converted.
	if(E==1)// This statement will work when the user selects Away Currency 1.
		{
		D=(C)*(1);// This statement will get carry out mathematical calculation.
		System.out.print(" ");// This statement will print a space of one letter.
		System.out.println(C+" Dollars = "+D+" Dollars");// This statement will print result in the same line.
		System.out.println("____________________________________________________________________________________________");// This statement will print a line to separate the result from the other lines to make it easy to read.
		}
	else if (E==2)// This statement will work when the user selects Away Currency 2.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.82); System.out.println(C+" Dollars = "+D+" Euros");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==3)// This statement will work when the user selects Away Currency 3.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.72);  System.out.println(C+" Dollars = "+D+" Pounds");// This statement will get carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==4)// This statement will work when the user selects Away Currency 4.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*150.93 ;  System.out.println(C+" Dollars = "+D+" Rupees");// This statement will get carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==5)// This statement will work when the user selects Away Currency 5.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*108.59;  System.out.println(C+" Dollars = "+D+" Yen");// This statement will get carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==6)// This statement will work when the user selects Away Currency 6.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*6.43;  System.out.println(C+" Dollars = "+D+" CNY");// This statement will get carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	break;// This statement will break the flow of control.
	case 2:// This statement will make the program to execute the commands based on condition 2.
		System.out.print("Select your Away Currency : "); E=A.nextInt();// This statement will get input from user where user can select Away Currency of his/her choice.
		System.out.print("Enter Amount : "); C=A.nextDouble();// This statement will get input form user where user can enter the amount to be converted.
	if(E==1)// This statement will work when the user selects Away Currency 1.
		{
		D=(C)*(1.22);// This statement will get carry out mathematical calculation.
		System.out.print(" ");// This statement will print a space of one letter.
		System.out.println(C+" Euros = "+D+" Dollars");// This statement will print result in the same line.
		System.out.println("____________________________________________________________________________________________");// This statement will print a line to separate the result from the other lines to make it easy to read.
		}
	else if (E==2)// This statement will work when the user selects Away Currency 2.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(1); System.out.println(C+" Euros = "+D+" Euros");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==3)// This statement will work when the user selects Away Currency 3.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.87);  System.out.println(C+" Euros = "+D+" Pounds");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==4)// This statement will work when the user selects Away Currency 4.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*183.58;  System.out.println(C+" Euros = "+D+" Rupees");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==5)// This statement will work when the user selects Away Currency 5.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*132.07;  System.out.println(C+" Euros = "+D+" Yen");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==6)// This statement will work when the user selects Away Currency 6.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*7.82;  System.out.println(C+" Euros = "+D+" CNY");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	break;// This statement will break the flow of control.
	case 3:// This statement will make the program to execute the commands based on condition 3.
		System.out.print("Select your Away Currency : "); E=A.nextInt();// This statement will get input from user where user can select Away Currency of his/her choice.
		System.out.print("Enter Amount : "); C=A.nextDouble();// This statement will get input form user where user can enter the amount to be converted.
	if(E==1)// This statement will work when the user selects Away Currency 1.
		{
		D=(C)*(1.40);// This statement will get carry out mathematical calculation.
		System.out.print(" ");// This statement will print a space of one letter.
		System.out.println(C+" Pounds = "+D+" Dollars");// This statement will print result in the same line.
		System.out.println("____________________________________________________________________________________________");// This statement will print a line to separate the result from the other lines to make it easy to read.
		}
	else if (E==2)// This statement will work when the user selects Away Currency 2.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(1.15); System.out.println(C+" Pounds = "+D+" Euros");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==3)// This statement will work when the user selects Away Currency 3.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(1);  System.out.println(C+" Pounds = "+D+" Pounds");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==4)// This statement will work when the user selects Away Currency 4.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*210.92;  System.out.println(C+" Pounds = "+D+" Rupees");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==5)// This statement will work when the user selects Away Currency 5.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*151.74;  System.out.println(C+" Pounds = "+D+" Yen");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==6)// This statement will work when the user selects Away Currency 6.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*8.99;  System.out.println(C+" Pounds = "+D+" CNY");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	break;// This statement will break the flow of control.
	case 4:// This statement will make the program to execute the commands based on condition 4.
		System.out.print("Select your Away Currency : "); E=A.nextInt();// This statement will get input from user where user can select Away Currency of his/her choice.
		System.out.print("Enter Amount : "); C=A.nextDouble();// This statement will get input form user where user can enter the amount to be converted.
	if(E==1)// This statement will work when the user selects Away Currency 1.
		{
		D=(C)*(0.0066);// This statement will get carry out mathematical calculation.
		System.out.print(" ");// This statement will print a space of one letter.
		System.out.println(C+" Rupees = "+D+" Dollars");// This statement will print result in the same line.
		System.out.println("____________________________________________________________________________________________");// This statement will print a line to separate the result from the other lines to make it easy to read.
		}
	else if (E==2)// This statement will work when the user selects Away Currency 2.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.0054); System.out.println(C+" Rupees = "+D+" Euros");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==3)// This statement will work when the user selects Away Currency 3.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.0047);  System.out.println(C+" Rupees = "+D+" Pounds");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==4)// This statement will work when the user selects Away Currency 4.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*1;  System.out.println(C+" Rupees = "+D+" Rupees");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==5)// This statement will work when the user selects Away Currency 5.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*0.72;  System.out.println(C+" Rupees = "+D+" Yen");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==6)// This statement will work when the user selects Away Currency 6.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*0.043;  System.out.println(C+" Rupees = "+D+" CNY");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	break;// This statement will break the flow of control.
	case 5:// This statement will make the program to execute the commands based on condition 5.
		System.out.print("Select your Away Currency : "); E=A.nextInt();// This statement will get input from user where user can select Away Currency of his/her choice.
		System.out.print("Enter Amount : "); C=A.nextDouble();// This statement will get input form user where user can enter the amount to be converted.
	if(E==1)// This statement will work when the user selects Away Currency 1.
		{
		D=(C)*(0.0092);// This statement will get carry out mathematical calculation.
		System.out.print(" ");// This statement will print a space of one letter.
		System.out.println(C+" Yen = "+D+" Dollars");// This statement will print result in the same line.
		System.out.println("____________________________________________________________________________________________");// This statement will print a line to separate the result from the other lines to make it easy to read.
		}
	else if (E==2)// This statement will work when the user selects Away Currency 2.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.0076); System.out.println(C+" Yen = "+D+" Euros");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==3)// This statement will work when the user selects Away Currency 3.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.0066);  System.out.println(C+" Yen = "+D+" Pounds");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==4)// This statement will work when the user selects Away Currency 4.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*1.39;  System.out.println(C+" Yen = "+D+" Rupees");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==5)// This statement will work when the user selects Away Currency 5.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*1;  System.out.println(C+" Yen = "+D+" Yen");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==6)// This statement will work when the user selects Away Currency 6.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*0.059;  System.out.println(C+" Yen = "+D+" CNY");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	break;// This statement will break the flow of control.
	case 6:// This statement will make the program to execute the commands based on condition 6.
		System.out.print("Select your Away Currency : "); E=A.nextInt();// This statement will get input from user where user can select Away Currency of his/her choice.
		System.out.print("Enter Amount : "); C=A.nextDouble();// This statement will get input form user where user can enter the amount to be converted.
	if(E==1)// This statement will work when the user selects Away Currency 1.
		{
		D=(C)*(0.16);// This statement will get carry out mathematical calculation.
		System.out.print(" ");// This statement will print a space of one letter.
		System.out.println(C+" CNY = "+D+" Dollars");// This statement will carry out mathematical calculation and print result in the same line.
		System.out.println("____________________________________________________________________________________________");// This statement will print a line to separate the result from the other lines to make it easy to read.
		}
	else if (E==2)// This statement will work when the user selects Away Currency 2.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.13); System.out.println(C+" CNY = "+D+" Euros");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==3)// This statement will work when the user selects Away Currency 3.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*(0.11);  System.out.println(C+" CNY = "+D+" Pounds");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==4)// This statement will work when the user selects Away Currency 4.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*23.46;  System.out.println(C+" CNY = "+D+" Rupees");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==5)// This statement will work when the user selects Away Currency 5.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*16.88;  System.out.println(C+" CNY = "+D+" Yen");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.
	else if (E==6)// This statement will work when the user selects Away Currency 6.
	{System.out.print(" ");// This statement will print a space of one letter.
	D=C*1;  System.out.println(C+" CNY = "+D+" CNY");// This statement will carry out mathematical calculation and print result in the same line.
	System.out.println("____________________________________________________________________________________________");}// This statement will print a line to separate the result from the other lines to make it easy to read.	
    break;// This statement will break the flow of control.
    }
		}
		System.out.println();// This statement will print a blank line.
		System.out.println("********************************************************************************************");// This statement will print a line made up of '*' for Thank You box.
		System.out.println("*                          Thank You for using Currency Converter.                         *");// This statement will print a Thank You line.
		System.out.println("********************************************************************************************");// This statement will print a line made up of '*' for Thank You box.
	}
}// Program ends.