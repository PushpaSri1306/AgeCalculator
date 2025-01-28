import java.util.Scanner;
public class AgeCalculator { 
	static void findAge(int current_date, int current_month, 
					int current_year, int birth_date, 
					int birth_month, int birth_year) 
	{ 
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 
							31, 30, 31, 30, 31 };  
		if (birth_date > current_date) { 
			current_month = current_month - 1; 
			current_date = current_date + month[birth_month - 1]; 
		} 
		if (birth_month > current_month) { 
			current_year = current_year - 1; 
			current_month = current_month + 12; 
		} 
		int calculated_date = current_date - birth_date; 
		int calculated_month = current_month - birth_month; 
		int calculated_year = current_year - birth_year;
		System.out.println("Present Age"); 
		System.out.println("Years: " + calculated_year + 
			" Months: " + calculated_month + " Days: " + 
			calculated_date); 
	} 
	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current date"); 
		int current_date = sc.nextInt(); 
        System.out.println("enter current month");
		int current_month = sc.nextInt();
        System.out.println("enter current year"); 
		int current_year = sc.nextInt();
        System.out.println("enter birth date");  
		int birth_date = sc.nextInt();
        System.out.println("enter birth month"); 
		int birth_month = sc.nextInt(); 
        System.out.println("enter birth year");
		int birth_year = sc.nextInt(); 
		findAge(current_date, current_month, current_year, 
			birth_date, birth_month, birth_year); 
        sc.close();
	} 
} 

