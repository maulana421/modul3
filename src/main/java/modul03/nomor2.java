package modul03;
import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args) {
        int A ;
        int Data2[]= {2,4,6,8,10,12,14,16,18,20};
        int batasAwal = 0;
        int batasAkhir = Data2.length -1;
        int ketemu = 0;
        int point = 0;
        for (int i = 0; i < Data2.length; i++) {
            System.out.print(Data2[i]+" ");
            
        }
        System.out.println();
        Scanner key = new Scanner (System.in);
        System.out.println("Masukkan Angka yang mau anda cari : ");
        A = key.nextInt();
        while((batasAwal<= batasAkhir)&&(ketemu == 0)){
           point = (batasAwal + batasAkhir)/2;
            System.out.println("Pointer berada di : "+point);
            if(Data2[point]== A){
                ketemu = 1;
            }
            else{
                if(A < Data2[point]){
                    System.out.println("Cari di kiri");
                    batasAkhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasAwal = point +1;
                    
                }
            }
        }
        if(ketemu==1){
            System.out.println("Data "+A+" telah ditemukan pada index ke "
            +(point + " dan baris ke "+(point +1)));
        }else{
            System.out.println("Data "+A+" tidak ditemukan ");
        }
        System.out.println("\n");
        System.out.println("Maulana Ibnu Fajar");
       
    }
}
