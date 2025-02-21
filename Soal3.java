public class Soal3 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;

        
       
        

     
        // soal3 Menampilkan Elemen di Indeks Genap
         for (int i = 0; i < number.length; i++) {
            if (i%2==0) {
                System.out.print(number[i]);  
                if (i<4) {
                         System.out.print(",");
                    } 
            }     
         }

    }
}
        //Hanya elemen dengan indeks genap (0, 2, 4) yang dicetak: 1, 3, 5.
        //Terdapat pemisah koma, tetapi ada kesalahan kecil: koma masih muncul setelah indeks 4 (seharusnya tidak).
        //Output: 1,3,5, (Tapi ada koma berlebih di akhir)
