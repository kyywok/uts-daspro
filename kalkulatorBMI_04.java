import java.util.Scanner;

public class kalkulatorBMI_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user memasukkan input
        System.out.println("\nmasukkan berat badan");
        double bb = input.nextDouble();
        System.out.println("masukkan tinggi badan");
        double tb = input.nextDouble();

        // rumus
        double bmi = bb / tb * tb;

        // pemilihan BMI
        System.out.println("--- KATEGORI BMI ---");
        if (bmi < 18.5) {
            System.out.println(bmi + " : kurang berat badan (underweight)");
            System.out.println("risiko kesehatan : kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println(bmi + " : berat badan normal (normal weight)");
            System.out.println("resiko kesehatan : relatif rendah");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println(bmi + " : kelebihan berat badan (overweight)");
            System.out.println("resiko kesehatan : meningkatnya resiko penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker");
        } else {
            System.out.println(bmi + " : obesitas (obese)");
            System.out.println("resiko kesehatan : resiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker");
        }
        
    }
}
