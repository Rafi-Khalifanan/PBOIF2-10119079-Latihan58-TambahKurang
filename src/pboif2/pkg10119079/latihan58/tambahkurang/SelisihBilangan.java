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
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        int jumlah = super.getX() - super.getY();
        System.out.println("Hasil Selisih " + super.getX() + " - " + super.getY() + " = " + jumlah);
    }
    
}
