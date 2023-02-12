package Laundry;

// import java.util.ArrayList;

public class run {
    public static void main(String[] args) {
        // ArrayList<Laundry> jenis = new ArrayList<>();
        
        Customer pelanggan1 = new Customer("Bintang", "Sawojajar", 'L', 100000);
        Customer pelanggan2 = new Customer("Kurniawan", "Karangkates", 'L', 50000);
        Customer pelanggan3 = new Customer("Rehan", "Bogor", 'L', 30000);
        Laundry reguler = new Laundry("Reguler", 5000);
        Laundry express = new Laundry("Express", 8000);

        Kasir kasir = new Kasir("Ilham", 'L');
        
        kasir.addLaudry(reguler);
        kasir.addLaudry(express);
        kasir.addCustomer(pelanggan1);
        kasir.addCustomer(pelanggan2);
        kasir.addCustomer(pelanggan3);

        kasir.Pesan(12, 0, 2);

        // System.out.println(kasir.getLaundry().size());
        // for (int i = 0 ; i < kasir.getLaundry().size() ; i++) {
        //     kasir.getLaundry(i).display();
        // }

        // kasir.Pesan(1, 0);
        // kasir.getLaundry().get(0).display();


        // System.out.println(kasir.getLaundry().size());
        
    }
}
