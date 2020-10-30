package if1.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan saldo tabungan per-bulan
 * 
 */

public class SaldoTabungan {
   public static void main(String[] args) {
       int bulan = 6;
       int i = 1;
       int saldo = 2500000;
       double bunga = 0.15;
       double saldoBulanan;
       
       while (i<=bulan) {
           saldoBulanan = saldo * bunga;
           saldo = (int) (saldo + saldoBulanan);
           System.out.println("Saldo di bulan ke-" + i + " Rp." + saldo);
           i++;
       }
   }
}