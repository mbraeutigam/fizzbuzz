package de.mb;

public class Main {
	public static void main(final String[] args) {
		// Die Spieler sitzen in der Regel im Kreis. Der als erste bestimmte
		// Spieler sagt die Zahl „1“, und jeder Spieler zählt von da an reihum
		// eine Zahl weiter. Jede durch drei teilbare Zahl wird jedoch durch das
		// Wort „fizz“ und jede durch fünf teilbare Zahl durch das Wort „buzz“
		// ersetzt. Durch 15 teilbare Zahlen werden zu „fizz buzz“. Ein Spieler,
		// der zögert oder einen Fehler macht, scheidet aus dem Spiel aus.
		// Eine typische Runde Fizz Buzz würde beispielsweise wie folgt
		// beginnen:
		//
		// Ergebnis: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13,
		// 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,
		// Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz …

		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
