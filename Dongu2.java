import java.util.Scanner;

public class Dongu2 {
    public static void main(String[] args) {

        int sayi, toplam=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz: ");
            sayi = input.nextInt();
            if (sayi%2 == 0 && sayi%4 == 0){
                toplam+=sayi;
            }

        }while (sayi %2 != 1);
        System.out.println(toplam);
    }
}
/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */