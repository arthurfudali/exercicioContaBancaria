package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account; // declara a variavel antes para permitir ela ser utilizada em todos os lugares,
							// não só dentro do IF

		System.out.print("Type account number: ");
		int accNumber = sc.nextInt();

		System.out.print("Type your name: ");
		sc.nextLine(); // devido ao nextInt() anterior, é necessário um nextLine() adicional para
						// consumir a linha extra
		String name = sc.nextLine();

		System.out.print("Do you want to make an initial deposit? 'y' or 'n' ");
		char x = sc.next().charAt(0);

		if (x == 'y') {
			System.out.print("Type the value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accNumber, name, initialDeposit);
		} else {
			account = new Account(accNumber, name);
		}
		System.out.println();
		System.out.println("Account data: " + account);
		System.out.println();

		System.out.print("Type the value to be deposited: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("Account data: " + account);

		System.out.print("Type the value to be withdraw: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Account data: " + account);

		sc.close();

	}

}
