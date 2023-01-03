import java.util.Scanner;

public class Main {
    private static String dorongKiriKanan (String s, int  m, int n) {

        for (int i = 0 ; i < m ; i++) {

            String kiriAwal, kiriAkhir;

            switch (s.substring(0,1)) {
                case "X" :
                    kiriAwal = s.substring(3, s.length());
                    kiriAkhir = s.substring(0, 3);
                    break;
                default:
                    kiriAwal = s.substring(1, s.length());
                    kiriAkhir = s.substring(0, 1);
                    break;
            }
            s = kiriAwal+kiriAkhir;
        }

        for (int j = 0 ; j < n ; j++) {

            String kananAwal;
            String kananAkhir;

            switch (s.substring(s.length()-1, s.length())) {
                case "Z" :
                    kananAwal = s.substring(s.length()-3, s.length());
                    kananAkhir = s.substring(0, s.length()-3);
                    break;
                default:
                    kananAwal = s.substring(s.length()-1, s.length());
                    kananAkhir = s.substring(0, s.length()-1);
                    break;
            }

            s = kananAwal+kananAkhir;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abcdXYZefgh";
        System.out.println("Tampilan Awal : "+ s +"\n");

        // Input User Geser Kiri dan Kanan
        Scanner scan = new Scanner(System.in);

        System.out.print("Geser Kiri Sebanyak : ");
        int kiri = scan.nextInt();
        System.out.print("Geser Kanan Sebanyak: ");
        int kanan = scan.nextInt();

        System.out.println("\nTampilan Akhir: "+ dorongKiriKanan(s,kiri,kanan));
    }
}
