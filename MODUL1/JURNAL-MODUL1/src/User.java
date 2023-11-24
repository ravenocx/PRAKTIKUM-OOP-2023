public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter
    private String nama;
    private int noHandPhone;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHandPhone(int noHandPhone) {
        this.noHandPhone = noHandPhone;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void register(){
        System.out.println("==============================");
        System.out.println("Register Berhasil");
        System.out.println("Nama: "+ nama);
        System.out.println("No Handphone: "+ noHandPhone);
    }
}
