package inheritance;
import java.util.Scanner;

// Ini adalah Class induk atau ibunya
public class Induk {
    Scanner input=new Scanner(System.in);
    
//Constructor Output
//===============================
int a=10, b=2;
    //===========================
    public int Penjumlahan()
    {
        return a+b;
    }
    //===========================
    
    //tempat pembuatan rumus pengurangan
    //===========================
    public int Pengurangan()
    {
        return a-b;
    }
    //===========================
//===============================    
    
//Constructor Input
//===============================
    String Nama;
    int Npm;
    //===========================
    public void inData(String nama, int npm)
    {
        Nama=nama;
        Npm=npm;
    }
    //===========================
}
