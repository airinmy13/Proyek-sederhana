public class produk {
    
    String nama;
    int harga;

    
    public produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    
    public void tampilkanInfo() {
        System.out.println(nama + " (Rp" + harga + ")");
    }
}