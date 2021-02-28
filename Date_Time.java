import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Date_Time {

	public static void main(String[] args) {

		int movie = (int) ((Math.random() * 250) + 100);
		int hh = movie / 60;
		int ss = movie % 60;

		System.out.println("Movie Length in minutes: " + movie);
		System.out.println("Movie Length: " + hh + " hours, " + ss + " min");
		System.out.println("Local Time: " + now());

		findBigNum();
		System.out.println();
		lab2_1();
		System.out.println();
		lab2_2();
		System.out.println();
		lab2_3();
		System.out.println();
		lab2_4();
		System.out.println();
		lab2_5();
		System.out.println();
		lab3_1();
		System.out.println();
		lab3_3();
		System.out.println();
		lab4_2();
		System.out.println();
		lab4_3();
		System.out.println();
		lab4_4();
		System.out.println();
		lab4_5();
		System.out.println();
		lab4_6();
		System.out.println();
		lab4_7();
		System.out.println();
		lab4_8();
		System.out.println();
		lab5_1();
		System.out.println();
		lab5_2();
		System.out.println();
		lab5_3();
	}

	public static String now() {
		LocalDateTime now = LocalDateTime.now();
		int hh = now.getHour();
		int mm = now.getMinute();
		int ss = now.getSecond();
		String time = String.format("%02d:%02d:%02d", hh, mm, ss);
		return time;
	}

	public static void findBigNum() {

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);

		System.out.println("First Num: " + a);
		System.out.println("Second Num: " + b);

		if (a > b) {
			System.out.println("Frist Num is Bigger: " + a);

		} else {
			System.out.println("Second Num is Bigger: " + b);
		}

		return;
	}

	public static void lab2_1() {

		int a = (int) (Math.random() * 100);
		System.out.println(a);

		if (a < 50) {
			System.out.println("Small");
		} else if (a > 50) {
			System.out.println("Big");
		} else {
			System.out.println("Bingo");
		}
	}

	public static void lab2_2() {
		int a = (int) (Math.random() * 100);
		System.out.println(a);

		if (a <= 50) {
			if (a % 2 == 0) {
				System.out.println("A is a Small Even number!");
			} else {
				System.out.println("A is a Small Odd number!");
			}
		} else if (a % 2 != 0) {
			System.out.println("A is a Big Odd number!");
		} else {
			System.out.println("A is a Big Even number!");
		}
	}

	public static void lab2_3() {
		double salary = (int) (Math.random() * 1000 + 5000);
		System.out.println(salary);

		if (salary <= 6000) {
			salary = salary * 1.1;
			// System.out.println("A is a Small Odd number!");
		} else {
			salary = salary * 1.05;
			// System.out.println("A is a Big Even number!");
		}
		System.out.println(salary);
	}

	public static void lab2_4() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);

		System.out.println("lab2_4");
		System.out.println("Number a: " + a);
		System.out.println("Number b: " + b);
		System.out.println("Number c: " + c);

		if (a > b) {
			if (b > c) {
				System.out.println("a is bigger");
			} else if (a > c) {
				System.out.println("a is bigger");

			} else {
				System.out.println("c is bigger");

			}
		} else if (b > c) {
			System.out.println("b is bigger");

		} else {
			System.out.println("c is bigger");

		}
	}

	public static void lab2_5() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);

		System.out.println("lab2_5");
		System.out.println("Number a: " + a);
		System.out.println("Number b: " + b);
		System.out.println("Number c: " + c);

		if (a > b) {
			if (b < c) {
				System.out.println("b is smaller");
			} else if (a > c) {
				System.out.println("c is smaller");
			} else {
				System.out.println("b is smaller");

			}
		} else if (a > c) {
			System.out.println("c is smaller");

		} else {
			System.out.println("a is smaller");

		}
	}

	public static void lab3_1() {
		int salary = (int) (Math.random() * 1000000);

		double tax_rate1 = 0.10; // 10/100;
		double tax_rate2 = 0.20; // 20/100;
		double tax_rate3 = 0.30; // 30/100;
		double tax_rate4 = 0.40; // 40/100;

		int margin_a = 22999; // 10%
		int margin_b = 26999; // 20%
		int margin_c = 49999; // 30%
		int margin_d = 100000;// 40%

		double tax_margin_a = margin_a * tax_rate1;
		double tax_margin_b = margin_b * tax_rate2;
		double tax_margin_c = margin_c * tax_rate3;
		double tax_margin_d = margin_d * tax_rate4;

		double TaxAggregate_a = salary * tax_rate1;
		double TaxAggregate_b = tax_margin_a + (salary - margin_a) * tax_rate2;
		double TaxAggregate_c = tax_margin_a + tax_margin_b + (salary - margin_a - margin_b) * tax_rate3;
		double TaxAggregate_d = tax_margin_a + tax_margin_b + tax_margin_c + (salary - margin_d) * tax_rate4;

		System.out.println("lab3_1");
		System.out.println("Salary: שח " + salary);

		if (salary < 22999) {
			System.out.println("Marginal Tax: 10% ");
			System.out.println("Calc Tax: " + TaxAggregate_a);
			System.out.println("Net Salary: " + (salary - (TaxAggregate_a)));
		} else if (salary < 49999 && salary > 23000) {
			System.out.println("Marginal Tax: 20% ");
			System.out.println("Calc Tax: " + TaxAggregate_b);
			System.out.println("Net Salary: " + (salary - (TaxAggregate_b)));

		} else if (salary < 99999 && salary > 50000) {
			System.out.println("Marginal Tax: 30% ");
			System.out.println("Calc Tax: " + TaxAggregate_c);
			System.out.println("Net Salary: " + (salary - (TaxAggregate_c)));

		} else {
			System.out.println("Marginal Tax: 40% ");
			System.out.println("Calc Tax: " + TaxAggregate_d);
			System.out.println("Net Salary: " + (salary - TaxAggregate_d));

		}
	}

	public static void lab3_3() {

		int year = (int) ((Math.random() * 2000) + 1000);

		System.out.println("lab3_3");
		System.out.println("Year- " + year);

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("The year " + year + " is a Leap year");
		}

	}

	public static void lab4_2() {

		// int year = (int) ((Math.random() * 2000)+1000);

		System.out.println("lab4_2");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " Hello World!");
		}

		System.out.println();

		for (int i = 10; i >= 1; i--) {
			System.out.println(i + " Hello World!");
		}

		System.out.println();

		int i = 1;
		while (i <= 10) {
			System.out.println(i + " Hello World!");
			i += 1;
		}

		System.out.println();

		int J = 10;
		while (J > 0) {
			System.out.println(J + " Hello World!");
			J -= 1;
		}

	}

	public static void lab4_3() {
		
	System.out.println("lab4_3");

		int num = (int) (Math.random()*100);
		System.out.println("Random #: " + num);
		System.out.println();

		for (int i = 1; i <= num ; i++) {
		System.out.println(i);

		}
	
	}
	
	public static void lab4_4() {
		
	System.out.println("lab4_4");
	System.out.println();

		int num1 = (int) (Math.random()*10);
		int num2 = (int) (Math.random()*10);

		if (num1 > num2) {
			int temp;
			temp = num2;
			num2 = num1;
			num1 = temp;			
		}
		
		System.out.println("First  #- " + num1);
		System.out.println("Second #- " + num2);
		for (int i = num1+1; i < num2 ; i++) {
			System.out.println(i);
		}
		
	}

	public static void lab4_5() {
		
	System.out.println("lab4_5");
	System.out.println();

		int num = (int) (Math.random()*50);
		System.out.println("Random #: " + num);
	
		for (int i = 0 ; i <= num ; i++) {
			
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void lab4_6() {
		
	System.out.println("lab4_6");
	System.out.println();

		int max = (int) (Math.random()*50);
		int den = (int) (Math.random()*9+1);

		System.out.println("Max #: " + max);
		System.out.println("Den #: " + den);
		for (int i = 0; i <= max ; i++) {
			if (i%den==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void lab4_7() {
		
	System.out.println("lab4_7");
	System.out.println();

	int factorial = 1;		
	int num = (int) (Math.random()*6+1);
		System.out.println("FActorial #: " + num +"!");

		for (int i = 1; i <= num ; i++) {
			factorial *= i;
			System.out.println(factorial);

		}
		System.out.println("Factorial value of " + num + "!= " + factorial);
	}

	public static void lab4_8() {
		
	System.out.println("lab4_8");
	System.out.println();

	int factorial = 1;		
	int num = (int) (Math.random()*6+1);
		System.out.println("Using For Decremental loop\nFActorial #: " + num +"!");

		for (int i = num; i >= 1 ; i--) {
			factorial *= i;
			System.out.println(factorial);

		}
		System.out.println("Factorial value of " + num + "!= " + factorial);
	
		System.out.println();
		
		int ind = 1;
		int factor = 1;
		int rnd = (int) (Math.random()*6+1);
		System.out.println("Using Incremental While loop\nFactorial #: " + rnd +"!");

		while (ind <=rnd) {
	
			factor *= ind;
			ind++;
			System.out.println(factor);

		}
		System.out.println("Factorial value of " + rnd + "!= " + factor);

	
	
		System.out.println();
		
		int fact = 1;
		int rndom = (int) (Math.random()*6+1);
		int index = rndom;

		System.out.println("Using Decremental While loop\nFactorial #: " + rndom +"!");

		while (index >= 1) {
				fact *= index;
			index--;
			System.out.println(fact);
		}
		System.out.println("Factorial value of " + rndom + "!= " + fact);
	}

	public static void lab5_1() {
		
	System.out.println("lab5_1");
	System.out.println();
	int num = (int) (Math.random()*100000);
	System.out.println("Random #: " + num);
	int count = 0;
	for (int i = 1 ; num > 0 ; i++) {
		num /=10;
		count = i;
	}
	System.out.println("Number Of Digits = " + count);
	System.out.println(count);
}
	
	public static void lab5_2() {
		
	System.out.println("lab5_2");
	System.out.println();
	int num = (int) (Math.random()*10000);
	System.out.println("Random #: " + num);
	//int count = 0;
	num %=10;
	System.out.println("Right Digit: " + num);

}

	public static void lab5_3() {
		
	System.out.println("lab5_3");
	System.out.println();
	int num = (int) (Math.random()*100);
	System.out.println("Random #: " + num);
	//int count = 0;
	
	while (num != 0) {
		if (num/10 == 0) {
			break;
		}
		
		num /=10;
	}
	
	System.out.println("Left Digit: " + num);
}

	
	
	 
	
	
	
	
	
	
	
	
	
}
