package Laundry;

import java.util.ArrayList;

public class Kasir {
    String namaKasir;
    char jk;
    private ArrayList<Customer> customer = new ArrayList();
    // ArrayList
    private ArrayList<Laundry> laundry = new ArrayList();

    Kasir(String namaKasir, char jk)
    {
        this.namaKasir = namaKasir;
        this.jk = jk;
    }
    
    void Pesan(int Kg, int jenis, int id)
    {
        int total;
        total = Kg * getLaundry(jenis).getHarga();
        getCustomer().get(id).display();
        System.out.println("\n_-----__--__-___---__--_-");
        getLaundry().get(jenis).display();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("!!!Total Harga!!!");
        System.out.println("Berat(Kg) pakaian yang akan anda laundry: "+Kg+"Kg");
        System.out.printf("Total: "+Kg+" x "+getLaundry(jenis).getHarga()+" = %,d",total);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        if (getCustomer(id).getSaldo() >= total) {
            System.out.println("Pemesanan Berhasil");
            getCustomer(id).setSaldo(getCustomer(id).getSaldo() - total);//pengurangan saldo
            System.out.printf("Saldo anda tersisa: Rp. %,d",getCustomer(id).getSaldo());
        } else {
            System.out.println("Saldo anda Kurang!!!");
            System.out.printf("Total Pesanan: %,d",total);
            System.out.printf("\nSaldo: %,d",getCustomer(id).getSaldo());
        }

    }


    
    /*Encapsulation Customer*/
    public Customer getCustomer(int id) {
        return this.customer.get(id);
    }
    public ArrayList<Customer> getCustomer() {
        return customer;
    }
    public void addCustomer(Customer customer) {
        this.customer.add(customer);
    }
    void removeCustomer(int id)
    {
        getCustomer().remove(id);
    }

    /*Encapsulation Customer*/

    /*Encapsulation Laundry */
    public ArrayList<Laundry> getLaundry() {
        return laundry;
    }
    public Laundry getLaundry(int id) {
        return this.laundry.get(id);
    }
    public void addLaudry(Laundry laundry) {
        this.laundry.add(laundry);
    }
    public void removeLaundry(int id)
    {
        getLaundry().remove(id);
    }
    /*Encapsulation Laundry */
}
