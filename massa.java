
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class massa {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Massa Zat (m) ");
        System.out.println(" *************************************************************");

        double m = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Volume Zar (v) ");
        System.out.println(" ************************************************************* ");

        double v = sc.nextInt();

        double p = m / v;

        DecimalFormat df = new DecimalFormat("#.##");
        String formatp = df.format(p);
        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Hasil Massa Jenis (p) = " + formatp);
        System.out.println(" ********************************************************** ");
    }
}
