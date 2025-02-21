public class Soal5 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;
        
        
        // soal5 Menampilkan Elemen di Indeks Ganjil
         for (int i = 0; i < number.length; i++) {
             if (i%2==1) {
                 System.out.print(+number[i]);  
                 if (i<2) {
                     System.out.print(",");
                 } 
             }     
         }

    }
}
          //Hanya indeks ganjil (1, 3) yang ditampilkan: 2, 4.
          //Ada kesalahan pada kondisi koma (i < 2 seharusnya i < 3 untuk benar-benar menghindari koma yang salah).
          //Output:2,4
