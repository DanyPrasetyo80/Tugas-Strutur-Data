public class Soal6 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        
        int[] number = new int[5];//Array ini dapat menyimpan 5 elemen bertipe int

        // Inisialisasi elemen sesuai kebutuhan
        number[0] = 1;
        number[1] = 1;
        number[2] = 3;
        number[3] = 2;
        number[4] = 5;

        // Mencetak elemen dalam satu baris dengan format yang diminta
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
