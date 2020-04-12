public class BalikBilanganInput1 {
    
        public static void main(String[] args) {
    
            int[] bilangan;  // Array untuk menyimpan nilai input dari user
            int jmlBilangan;    // Banyaknya bilangan yang sudah disimpan dalam array
            int bil;          // Bilangan yang diambil dari user
            bilangan = new int[100];   // Buat array dengan 100 bilangan int
            jmlBilangan = 0;                // Belum ada bilangan yang disimpan
    
            System.out.println("Masukkan bilangan bulat positif (paling banyak 100 bilangan)" + 
                ", masukkan nol untuk mengakhiri.");
    
            while (true) {
                System.out.print("? ");
                bil = KonsolIO.ambilInt();
                if (bil <= 0)
                    break;
                bilangan[jmlBilangan] = bil;
                jmlBilangan++;
            }
    
            System.out.println("\nBilangan yang Anda masukkan dalam urutan terbalik adalah :\n");
    
          for (int i = jmlBilangan - 1; i >= 0; i--) {
                System.out.println( bilangan[i] );
            }
    
        } // akhir main();
    
    }  // akhir kelas BalikBilanganInput 