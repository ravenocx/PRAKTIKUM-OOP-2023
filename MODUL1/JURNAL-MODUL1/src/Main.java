import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        Database db = new Database();

        // TODO: Create Konser Object and Set the Attributes
        Konser Band1 = new Konser();
        Band1.setNamaBand("Noah");
        Band1.setTanggal("15-11-2023");
        Band1.setLokasi("Sukabirus");
        Band1.setHargaTiket(50000);

        Konser Band2 = new Konser();
        Band2.setNamaBand("Sheila on 7");
        Band2.setTanggal("16-11-2023");
        Band2.setLokasi("Sukapura");
        Band2.setHargaTiket(70000);

        // TODO: Insert Konser Object to Database
        db.insertKonser(Band1);
        db.insertKonser(Band2);

        // TODO: Display Greeting Message and Prompt User to Register
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==============================");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scan.nextLine();
        System.out.print("No Handphone: ");
        int noHandphone = scan.nextInt();

        // TODO: Create a User Object and Set the Attributes
        User user = new User();
        user.setNama(nama);
        user.setNoHandPhone(noHandphone);
        user.register();

        // TODO: Display Main Menu and Prompt User to Choose Menu
        while (true){
            System.out.println("================================");
            System.out.println("1. Lihat Konser");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Keluar");
            System.out.println("=================================");
            System.out.print("Silahkan Pilih Menu: ");
            int menu = scan.nextInt();
            if (menu == 1){
                db.showKonser();
            }
            else if (menu == 2){
                System.out.print("Pilih Nomor Konser yang akan dibeli: ");
                int nokonser = scan.nextInt();
                System.out.print("Jumlah Tiket yang akan dibeli: ");
                int jumlahTiket = scan.nextInt();
                db.beliTiket(nokonser-1, jumlahTiket);
            }
            else if (menu == 3){
                System.out.println("Terimakasih");
                scan.close();
                break;
            }
        }
    }
}
