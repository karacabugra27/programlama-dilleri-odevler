package odev2;

public class Data {
	int sayi;
	int adres;

	public Data(int sayi, int adres) {
		this.sayi = sayi;
		this.adres = adres;
	}

	public Data() {

	}

	@Override
	public String toString() {
		return "[sayi = " + sayi + ", adres = " + adres + "]";
	}

}
