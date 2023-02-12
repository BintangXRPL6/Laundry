package Laundry;

public class Laundry {
    String jenislaundry;
    private int harga;

    public Laundry(String jenislaundry, int harga) {
        this.jenislaundry = jenislaundry;
        setHarga(harga);
    }

    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    void display()
    {
        System.out.println("Jenis laundry: "+jenislaundry);
        System.out.println("Harga per Kg: "+getHarga());
    }
}
