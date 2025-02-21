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

    }
}
        //Perulangan for berjalan dari indeks 0 hingga 4 (number.length bernilai 5).
        //Mencetak semua elemen array dengan spasi di antara elemen-elemen.
        //Output:1 2 3 4 5