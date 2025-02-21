public class Soal1 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;

        //soal 1 Menampilkan Semua Elemen Array

         for (int i = 0; i < number.length; i++) {
                System.out.print(number[i]+" ");     
         }

        //Perulangan for berjalan dari indeks 0 hingga 4 (number.length bernilai 5).
        //Mencetak semua elemen array dengan spasi di antara elemen-elemen.
        //Output:1 2 3 4 5

        // soal 2 Menampilkan Elemen dengan Pemisah Koma
        for (int i = 0; i < number.length; i++) {
                 System.out.print(number[i]);  
                 if (i<4) {
                         System.out.print(",");
             }     
         }

        //perulangan berjalan dari 0 hingga 4.
        //Setiap elemen dicetak, dengan tambahan "," setelah elemen kecuali elemen terakhir.
        //Output:1,2,3,4,5



        // soal3 Menampilkan Elemen di Indeks Genap
         for (int i = 0; i < number.length; i++) {
             if (i%2==0) {
                 System.out.print(number[i]);  
                 if (i<4) {
                    System.out.print(",");
                  } 
             }     
         }

        //Hanya elemen dengan indeks genap (0, 2, 4) yang dicetak: 1, 3, 5.
        //Terdapat pemisah koma, tetapi ada kesalahan kecil: koma masih muncul setelah indeks 4 (seharusnya tidak).
        //Output: 1,3,5, (Tapi ada koma berlebih di akhir)

        // soal4 Menampilkan Elemen di Indeks Genap Secara Terbalik 
         for (int i = 4; i > -1; i--) {
             if (i%2==0) {
                 System.out.print(+number[i]); 
                 if (i>1) {
                     System.out.print(",");
                 }
             } 
         }

        //Perulangan dimulai dari indeks 4 hingga 0.
        //Hanya indeks genap (4, 2, 0) yang ditampilkan dalam urutan terbalik: 5, 3, 1.
        //Output:5,3,1

        // soal5 Menampilkan Elemen di Indeks Ganjil
         for (int i = 0; i < number.length; i++) {
             if (i%2==1) {
                 System.out.print(+number[i]);  
                 if (i<2) {
                     System.out.print(",");
                 } 
             }     
         }

        //Hanya indeks ganjil (1, 3) yang ditampilkan: 2, 4.
        //Ada kesalahan pada kondisi koma (i < 2 seharusnya i < 3 untuk benar-benar menghindari koma yang salah).
        //Output:2,4


        // soal6 Mencetak elemen dalam satu baris dengan format yang diminta
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]); // Tidak ada koma setelah elemen terakhir
            } else {
                System.out.print(number[i] + ",");
            }
        }
    }
}

//Perulangan for digunakan untuk menampilkan setiap elemen array.
//number.length mengembalikan jumlah elemen dalam array (yaitu 5).
//Pengecekan if (i == number.length - 1):
//jika indeks saat ini adalah indeks terakhir (i == 4), maka hanya mencetak angka tanpa koma (System.out.print(number[i])).
//Jika bukan indeks terakhir, maka angka akan diikuti dengan koma (System.out.print(number[i] + ",")).

    }
}
