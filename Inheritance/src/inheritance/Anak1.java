package inheritance;

// Ini adalah class anak dari induk
public class Anak1 extends Induk{
    Induk induk=new Induk();
    
    public void input()
    {
        System.out.println(" Angka Pertama  : "+a);
        System.out.println(" Angka Terakhir : "+b);
    }
    
    public void hasil()
    {
        System.out.println(" Hasil Penjumlahan : "+induk.Penjumlahan());
        System.out.println(" Hasil Pengurangan : "+induk.Pengurangan());
    } 
}
