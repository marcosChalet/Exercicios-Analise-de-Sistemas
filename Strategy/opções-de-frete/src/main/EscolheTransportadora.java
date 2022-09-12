package main;

import java.util.Scanner;

import frete.ElementoNulo;
import frete.FreteStrategy;
import opcoesFrete.Fedex;
import opcoesFrete.JadLog;
import opcoesFrete.Pac;
import opcoesFrete.Sedex;

public class EscolheTransportadora {
	public static FreteStrategy transportadora() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Entre com a transportadora:\n"
				+ "[1] Sedex\n"
				+ "[2] Fedex\n"
				+ "[3] PAC\n"
				+ "[4] JadLog\n-> "
			);
			
			int transportadora = input.nextInt();

			if (transportadora == 1){
				return new Sedex();
			} else if (transportadora == 2) {
				return new Fedex();
			} else if (transportadora == 3) {
				return new Pac();
			} else if (transportadora == 4) {
				return new JadLog();
			} else {
				return new ElementoNulo();
			}

		}
	}
}
		

