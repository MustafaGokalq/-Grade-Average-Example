import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] notlar = new int[3];
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        System.out.print("Matematik: ");
        notlar[0]= scan.nextInt();
        System.out.print("Türkçe: ");
        notlar[1]=scan.nextInt();
        System.out.print("Edebiyat: ");
        notlar[2]= scan.nextInt();

        for (int not : notlar){
            toplam += not;
        }
        System.out.println("Ortalamanız: " + (toplam/ notlar.length));




    }
}