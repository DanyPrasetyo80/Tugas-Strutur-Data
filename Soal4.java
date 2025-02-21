public class Soal4 {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;

        // soal4 Menampilkan Elemen di Indeks Genap Secara Terbalik
       for (int i = 4; i > -1; i--) {
           if (i%2==0) {
                System.out.print(+number[i]); 
                if (i>1) {
                     System.out.print(",");
                 }
             } 
        }


    }
}
     //Perulangan dimulai dari indeks 4 hingga 0.
     //Hanya indeks genap (4, 2, 0) yang ditampilkan dalam urutan terbalik: 5, 3, 1.
     //Output:5,3,1

