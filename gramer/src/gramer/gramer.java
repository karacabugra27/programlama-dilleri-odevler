package gramer;

import java.util.Scanner;

public class gramer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cümleyi gir : ");
		String cumle = scanner.nextLine();

		if (kontrol(cumle)) {
			System.out.println("EVET");
		} else {
			System.out.println("HAYIR");
		}
	}

	public static boolean kontrol(String cumle) {

		String kelime[] = cumle.trim().split("\\s+");

		boolean ozneMi = false;
		boolean nesneMi = false;
		boolean yuklemMi = false;

		if (kelime.length != 3) {
			return false;
		}
		if (kelime[0].equals("Ben") || kelime[0].equals("Sen") || kelime[0].equals("Hasan")
				|| kelime[0].equals("Nurşah") || kelime[0].equals("Elif") || kelime[0].equals("Abdulrezzak")
				|| kelime[0].equals("Şehribanu") || kelime[0].equals("Zeynelabidin") || kelime[0].equals("Naki")) {
			ozneMi = true;
		}
		if (kelime[1].equals("Bahçe") || kelime[1].equals("Okul") || kelime[1].equals("Park")
				|| kelime[1].equals("Sınıf") || kelime[1].equals("Yarın") || kelime[1].equals("Pazartesi")
				|| kelime[1].equals("Salı") || kelime[1].equals("Çarşamba") || kelime[1].equals("Perşembe")
				|| kelime[1].equals("Cuma") || kelime[1].equals("Cumartesi") || kelime[1].equals("Pazar")
				|| kelime[1].equals("Merkez") || kelime[1].equals("Ev") || kelime[1].equals("Kitap")
				|| kelime[1].equals("Defter") || kelime[1].equals("Güneş") || kelime[1].equals("Beydağı")) {
			nesneMi = true;
		}
		if (kelime[2].equals("Gitmek") || kelime[2].equals("Gelmek") || kelime[2].equals("Okumak")
				|| kelime[2].equals("Yazmak") || kelime[2].equals("Yürümek") || kelime[2].equals("Görmek")) {
			yuklemMi = true;
		}

		return ozneMi && nesneMi && yuklemMi;
	}
}