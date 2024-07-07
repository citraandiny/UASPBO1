package hotel;

//Inheritence pada kata(extends)suatu pewarisan class Hotelku  ke Hotelbaik
public class HotelBaik extends Hotelku {

    public HotelBaik(String nik, String nama, String type) {
        super(nik, nama, type);
    }
   public int getTahunMasuk() {
    return Integer.parseInt(getNik().substring(0,2))+ 2000;
}
   public String getBulanMasuk() {
        String bulanMasuk = getNik().substring(2, 4);
        // seleksi pada nama-nama bulan
        return switch (bulanMasuk) {
            case "01" -> "Januari";
            case "02" -> "Februari";
            case "03" -> "Maret";
            case "04" -> "April";
            case "05" -> "Mei";
            case "06" -> "Juni";
            case "07" -> "Juli";
            case "08" -> "Agustus";
            case "09" -> "September";
            case "10" -> "Oktober";
            case "11" -> "November";
            case "12" -> "Desember";
            default -> "Data Tidak Tersedia";
        
                };
                }
 public int getTanggalMasuk() {
        return Integer.parseInt(getNik().substring(4));
    }
    // polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun masuk: " + getTahunMasuk() +
                "\nBulan masuk: " + getBulanMasuk() +
                "\nTanggal masuk: " + getTanggalMasuk();
}

   }