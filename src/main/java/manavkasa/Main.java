package manavkasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo?: ");
        armutKg = input.nextInt();
        System.out.print("Elma kaç kilo?: ");
        elmaKg = input.nextInt();
        System.out.print("Domates kaç kilo?: ");
        domatesKg = input.nextInt();
        System.out.print("Muz kaç kilo?: ");
        muzKg = input.nextInt();
        System.out.print("Patlican kaç kilo?: ");
        patlicanKg = input.nextInt();

        double toplam = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlicanFiyat * patlicanKg);
        System.out.print("Toplam Tutar: " + toplam);

    }
}