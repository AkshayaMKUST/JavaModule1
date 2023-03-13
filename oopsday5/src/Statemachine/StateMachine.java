package Statemachine;

import java.util.Scanner;

public class StateMachine implements StateIface {

	private int huncnt = 100;
	private int fifcnt = 100;
	private int twencnt = 100;
	private int tencnt = 100;
	private int fivecnt = 100;
	private int hun;
	private int fif;
	private int twen;
	private int ten;
	private int five;
	private int statemachinebal = 0;

	@Override
	public void withdraw(int amount, int deno) {
		statemachinebal = (100 * 100) + (50 * 100) + (20 * 100) + (10 * 100) + (5 * 100);

		if (amount > statemachinebal) {
			System.out.println("State machine does not have enough balance");
		} else {

			if (amount / deno <= 100) {
				hun = (amount / 100);
				amount = amount - (hun * 100);
				// amount=amount%100;
			}

			if ((amount / deno <= 50)&&hun<deno) {
				fif = (amount / 50);
				amount = amount - (fif * 50);
				// amount=amount%50;
			}

			if ((amount / deno <= 20)&&hun<deno&&fif<deno) {
				twen = (amount / 20);
				amount = amount - (twen * 20);
				// amount=amount%20;
			}

			if ((amount / deno <= 10)&&hun<deno&&fif<deno&&twen<deno) {
				ten = (amount / 10);
				amount = amount - (ten * 10);
				// amount=amount%10;
			}

			if (amount / deno <= 5) {
				five = (amount / 5);
				amount = amount - (five * 5);
				// amount=amount%5;
			}

		}
		int Totalnotes = hun + fif + twen + ten + five;
		System.out.println("Total number of 100 notes = " + hun);
		System.out.println("Total number of 50 notes = " + fif);
		System.out.println("Total number of 20 notes = " + twen);
		System.out.println("Total number of 10 notes = " + ten);
		System.out.println("Total number of 5 notes = " + five);
		hun = 0;
		fif = 0;
		twen = 0;
		ten = 0;
		five = 0;

	}

	@Override
	public void balance(int denocnt) {

		huncnt = huncnt - hun;
		fifcnt = fifcnt - fif;
		twencnt = twencnt - twen;
		tencnt = tencnt - ten;
		fivecnt = fivecnt - five;
		System.out.println("Available Balance = "
				+ ((huncnt * 100) + (fifcnt * 50) + (twencnt * 20) + (tencnt * 10) + (fivecnt * 5)));

	}

}
