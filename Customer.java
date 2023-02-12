package Laundry;

public class Customer {
    String nama;
    String alamat;
    char jk;
    private int saldo;

    

    public Customer(String nama, String alamat, char jk, int saldo) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        setSaldo(saldo);
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    void display()
    {
        System.out.println("Nama: "+nama);
        System.out.println("Kelamin: "+jk);
        System.out.println("Alamat: "+alamat);
        System.out.printf("Saldo: %,d",getSaldo());
    }
}
