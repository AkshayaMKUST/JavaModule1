package Statemachine;

import java.util.Scanner;

public class TestStateMachine {

	public static void main(String[] args) {

		StateIface s = new StateMachine();

		int amt;
		int deno;
		int f=2;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the amount to be withdrawn : ");
			amt = sc.nextInt();
			System.out.println("Enter the denomination : ");
			deno = sc.nextInt();
			if ((amt / deno >= 100) | (amt / deno >= 50) | (amt / deno >= 20) | (amt / deno >= 10)
					| (amt / deno >= 5)) {
				s.withdraw(amt, deno);
				
			}
			else {
				System.out.println("Wrong Denomination..Failed Attempts");
				System.out.println(f+" attempts remaining");
				if(f<0)
				System.out.println("Enter again");
				f--;
				continue;
				
			}
		}

	}

}
