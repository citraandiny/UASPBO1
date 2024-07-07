
package hotel;


public class Hotelku {
    //Enkaspsulasi (private) Atribut (nik,nama,type).
    private String nik; //Nomor induk kewarganegaraan
    private String nama;
    private String type; //Type yang dimaksud type ruangan contoh (Vip,premium,normal)

    //Konstruktor
    public Hotelku(String nik, String nama, String type) {
        this.nik = nik;
        this.nama = nama;
        this.type = type;
    }

    //Setter & getter (NIK,NAMA,TYPE)
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
        public String displayInfo() {
        return "Nomor: " + getNik() + "\nNama: " + getNama() + "\nType: " + getType();
    }
}


