package pboif2.pkg10119079.latihan58.tambahkurang;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class JumlahBilangan extends Bilangan{
        
    public void tampilHasilJumlah(){
        
        int jumlah = super.getX() + super.getY();
        System.out.println("Hasil Penjumlahan " + super.getX() + " + " + super.getY() + " = " + jumlah);
    }
}
