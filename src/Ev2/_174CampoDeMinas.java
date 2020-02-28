package Ev2;

import java.util.Scanner;

public class _174CampoDeMinas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int x = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;

		do {
			x = tec.nextInt();
			y = tec.nextInt();

			String[][] campo = new String[y][x];

			int cont;
			int total = 0;

			if (x == 0 || y == 0) {
				x = 0;
				y = 0;
			} else {
				tec.nextLine();

				// Rellenar matriz
				for (int i = 0; i < campo.length; i++) {
					for (int j = 0; j < campo[i].length; j++) {
						campo[i][j] = tec.nextLine();
					}
				}

				// Recorrer matriz
				for (int i = 1; i < campo.length - 1; i++) {
					for (int j = 1; j < campo[i].length - 1; j++) {
						cont = 0;
						if (!campo[i][j].equals("*")) {
							// Recorrer alrededor de [i][j]
							for (int a = i - 1; a <= i + 1; a++) {
								for (int b = j - 1; b <= j + 1; b++) {
									if (campo[a][b].equals("*"))
										cont++;
								}
							}
						}
						if (cont >= 6)
							total++;
					}
				}
				System.out.println(total);
			}
		} while (x != 0 || y != 0);
	}
}
