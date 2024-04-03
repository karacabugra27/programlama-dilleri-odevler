package odev2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Bagli_Sirala {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dosya adi gir : ");
		String dosya = scanner.nextLine();

		BufferedReader br = new BufferedReader(new FileReader(dosya));

		String line;
		Data dizi[] = new Data[100];
		int i = 0;
		int j = 0;

		while ((line = br.readLine()) != null) {
			int deger = Integer.parseInt(line);
			dizi[i] = new Data();
			dizi[i].sayi = deger;
			dizi[i].adres = j++;
			i++;
		}

		Data siraliDizi[] = new Data[i];
		int temp;

		for (int k = 0; k < i; k++) {
			siraliDizi[k] = new Data(dizi[k].sayi, dizi[k].adres);
		}

		for (int k = 0; k < i; k++) {
			for (int l = 0; l < i - 1; l++) {
				if (siraliDizi[l].sayi > siraliDizi[l + 1].sayi) {
					temp = siraliDizi[l].sayi;
					siraliDizi[l].sayi = siraliDizi[l + 1].sayi;
					siraliDizi[l + 1].sayi = temp;

					temp = siraliDizi[l].adres;
					siraliDizi[l].adres = siraliDizi[l + 1].adres;
					siraliDizi[l + 1].adres = temp;
				}

			}
		}

		for (int k = 0; k < i; k++) {
			System.out.println(dizi[k] + "\t" + siraliDizi[k]);
		}
	}

}
