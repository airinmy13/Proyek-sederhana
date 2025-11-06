import java.util.Scanner;

public class TokoMakeUp {

    
    public static int hitungTotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        produk foundation = new produk("Foundation", 75000);
        produk lipstik     = new produk("Lipstik", 50000);
        produk bedak       = new produk("Bedak Tabur", 60000);
        produk maskara     = new produk("Maskara", 85000);

        System.out.println("=== 💋 TOKO MAKE UP AIRIN BEAUTY 💋 ===");
        System.out.println("Daftar Produk:");
        
        System.out.print("1. "); foundation.tampilkanInfo(); 
        System.out.print("2. "); lipstik.tampilkanInfo();
        System.out.print("3. "); bedak.tampilkanInfo();
        System.out.print("4. "); maskara.tampilkanInfo();

        int totalBelanja = 0;
        
        String lanjut = "y"; 

        do {
            System.out.print("\nPilih nomor produk yang ingin dibeli: ");
            int pilih = input.nextInt();

            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();

            produk produkDipilih; 
            switch (pilih) {
                case 1: produkDipilih = foundation; break;
                case 2: produkDipilih = lipstik; break;
                case 3: produkDipilih = bedak; break;
                case 4: produkDipilih = maskara; break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-4.");
                    continue;
            }

            int subtotal = hitungTotal(produkDipilih.harga, jumlah);
            totalBelanja += subtotal;

            System.out.println("Subtotal untuk " + produkDipilih.nama + " = Rp" + subtotal);

            System.out.print("Apakah ingin membeli produk lain? (y/n): ");
            
            
            lanjut = input.next(); 

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Total yang harus dibayar: Rp" + totalBelanja);
        System.out.println("Terima kasih telah berbelanja di Toko Make Up Airin Beauty 💕");
        
        input.close(); 
    }
}