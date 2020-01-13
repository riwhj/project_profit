package profit;

import java.util.Scanner;

import testbyprofit.Employee;
import testbyprofit.Salary;

public class ProfitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		String id ;
		String name ;
		double salary ;
		double sales;
		double profit = 0 ;
		double bonus ;
		
		char ch;
		Employee[] em = new Employee [2] ;
		Salary[] sa = new Salary [2];
		do {
			for (int i=0;i<em.length;i++) {
				System.out.println("Employee id : ") ;
				id = sc.next();
				System.out.println("Employee name : ") ;
				name = sc.next();
				em[i] = new Employee (name,id);
				System.out.println("salary : ") ;
				salary = sc.nextDouble();
				
				System.out.println("Monthly sales : ") ;
				sales = sc.nextDouble();
				
				if (sales<=25000) {
					profit = (0.01*sales) ;
				} else if (sales>=25001 && sales<=50000) {
					profit = (0.02*sales);
				} else if (sales > 50001) {
					profit = (0.03*sales) ;
				}
				sa[i] = new Salary (salary,profit); 
			}
			for (int i=0;i<em.length;i++) 
				System.out.println(em[i].getName() +" and bonus : " +sa[i].toString()+ " baht ");
		
		System.out.println("Do you want to continue[y/n] : ");
		ch = sc.next().charAt(0);
		}while  (ch=='y') ;
			System.out.println("Bye Bye");
			
	}

}
