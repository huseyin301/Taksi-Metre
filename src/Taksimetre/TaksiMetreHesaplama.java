package Taksimetre;
import java.util.Scanner;
public class TaksiMetreHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double km,tutar = 10,perkm ;
        perkm = 2.20 ;


        System.out.print("Gidilecek mesafeyi giriniz (km) : ");
        km = sc.nextDouble();
        tutar += (km * perkm);

        String str = tutar < 20 ? "Tutar minimum 20tl olmalıdır" : "Tutar 20tl'nin üzerinde" ;
        System.out.println(str);
        tutar = (tutar > 20) ? tutar : 20 ;

        System.out.println("Tutar : " + tutar);

    }
}
