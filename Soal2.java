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
        

        
         for (int i = 0; i < number.length; i++) {
                System.out.print(number[i]);  
                 if (i<4) {
                         System.out.print(",");
             }     
         }
    }
}

     