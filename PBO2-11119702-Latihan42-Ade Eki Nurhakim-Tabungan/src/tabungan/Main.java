/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    Tabungan t = new Tabungan();
    Scanner i = new Scanner(System.in);
    System.out.println("======= Program Penarikan Uang =======");
    System.out.println("Masukkan Saldo Awal: ");
    t.setSaldo(i.nextInt());
    System.out.println("Jumlah Uang Yang Anda Ambil: ");
    t.setJumlah(i.nextInt());
    System.out.println("Saldo Anda Sekarang : "+t.sisaSaldo());
    }
}
