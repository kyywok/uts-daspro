import java.util.Scanner;
public class menentukanBilanganTerbesar_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user memasukkan input
        System.out.print("\nmasukkan angka pertama = ");
        int a = input.nextInt();
        System.out.print("masukkan angka kedua = ");
        int b = input.nextInt();
        System.out.print("masukkan angka ketiga = ");
        int c = input.nextInt();

        // pemilihan terbesar
        int terbesar;
        if (a >= b && a >= c) {
            terbesar = a;
        } else if (b >= c && b >= a) {
            terbesar = b;
        } else {
            terbesar = c;
        }

        // pemilihan sama besar dan output
        if ( a == b && b == c) {
            System.out.println("semua bilangan sama besar" + a + b + c );
        } else if (a == terbesar && b == terbesar && c != b) {
            System.out.println("ada dua angka besar yaitu " + a + b);
        } else if (b == terbesar && c == terbesar && a != b) {
            System.out.println("ada dua angka terbesar yaitu " + b + c);
        } else if (a == terbesar && c == terbesar && b != a) {
            System.out.println("ada dua angka besar yaitu " + a + c);
        } else {
            System.out.println("angka terbesar adalah " + terbesar);
        }


        
    }
}