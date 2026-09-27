public class Main {
	public static void main(String[] args) {
		int startP = 7;
		int endP = 21;
		int sizeP = (endP-startP)/2 +1;
		long[] p = new long[sizeP];
		int indexP = 0;
		for (int digitP = startP; digitP <= endP; digitP++) {
			if (digitP % 2 == 1) {
				p[indexP] = digitP;
				indexP++;
			}
		}

		double startX = -6.0;
		double endX = 14.0;
		int sizeX = 18;
		double[] x = new double[sizeX];
		int range = (int) (endX - startX);
		for (int indexX = 0; indexX < sizeX; indexX++) {
			x[indexX] = ((range * Math.random()) + startX);
		}

		double[][] h = new double[p.length][x.length];
		int i = 0;
		int j = 0;
		for (i = 0; i < p.length; i++) {
			for (j = 0; j < x.length; j++) {
				h[i][j] = countArray(p[i], x[j]);
			}
		}

		printMatrix(h);
	}

	public static double countArray(long pDigit, double xDigit) {
		if (pDigit == 15) {
			return Math.pow( (2.0/3.0) / (Math.PI - Math.cos(xDigit)), (Math.cos(Math.cbrt(xDigit)) - Math.PI) / 4.0);
		}
		else if (pDigit == 9 || pDigit == 13 || pDigit == 17 || pDigit == 21) {
			return Math.pow(Math.E, Math.cos(Math.pow(Math.E, xDigit)));
		} else {
			return Math.cos(Math.cbrt(Math.atan(Math.cos(xDigit))));
		}

	}

	public static void printMatrix(double[][] h) {
		for (int i = 0; i < h.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < h[i].length; j++) {
				System.out.print(Math.round(h[i][j] *100.0)/100.0 + " ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}
