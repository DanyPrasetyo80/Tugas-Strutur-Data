public class Soal2 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;
        

        // soal 2 Menampilkan Elemen dengan Pemisah Koma
         for (int i = 0; i < number.length; i++) {
                System.out.print(number[i]);  
                 if (i<4) {
                         System.out.print(",");
             }     
         }
    }
}
        //perulangan berjalan dari 0 hingga 4.
        //Setiap elemen dicetak, dengan tambahan "," setelah elemen kecuali elemen terakhir.
        //Output:1,2,3,4,5
     