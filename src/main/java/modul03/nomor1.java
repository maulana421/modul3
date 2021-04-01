package modul03;
import java.util.Scanner;
public class nomor1 {
     public static void main(String[] args) {
        String A ;
        String Data [] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Faizal","Tesla"};
        boolean ketemu = false;
        Scanner key = new Scanner(System.in);
        System.out.println("Data : ");
        for (int i = 0; i < Data.length; i++) {
            System.out.print(Data[i]+" ");
        }
        System.out.println();
        System.out.println("Masukkan Nama Yang mau anda cari : ");
        A = key.nextLine();
        for (int i = 0; i <= Data.length; i++) {
            if(A.equalsIgnoreCase(Data[i])){
                ketemu = true;
                System.out.println("Nama "+A+" Berada di index ke "+i+" baris ke "+(i+1));
                break;
            } else{       
                break;
            }
        }
        if (ketemu == true){
            System.out.println("Kesimpulan : Data ditemukan ");
        }else{
            System.out.println("Kesimpulan : Data Tidak ditemukan");
            
        }
       
        System.out.println("\n");
        System.out.println("Maulana Ibnu Fajar");
        
    }
}
