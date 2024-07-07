package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelBersih {
    public static void main(String[] args) {
      
        //error handling (try)
        try {
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            List<HotelBaik> data = new ArrayList<>();
            boolean continueInput = true;

            // Penginputan nik, nama, type kamar
            // ARRAY
            while (continueInput) {
                System.out.print("Masukkan Nik Customer: "); // FORMAT NIK TAHUN,BULAN,TANGGAL
                // Contoh 21 04 001,002,003 dst sampai 999
                String nik = scanner.nextLine();
                System.out.print("Masukkan Nama Customer: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Type kamar Customer: "); // Contoh ada kamar (VIP, PREMIUM, NORMAL)
                String type = scanner.nextLine();
                System.out.println();

                // Objek dengan nama customer dari HotelBaik
                HotelBaik customer = new HotelBaik(nik, nama, type);
                data.add(customer);

                // Perulangan dengan pilihan mau menambahkan kostomer atau tidak
                System.out.print("Apakah Anda ingin menambahkan customer lain? (ya/tidak): ");
                String response = scanner.nextLine();
                if (!response.equalsIgnoreCase("ya")) {
                    continueInput = false;
                }
            }

            for (HotelBaik member : data) {
                System.out.println(member.displayInfo());
            }

            // Error handling suatu kesalahan penginputan maka kode tidak akan jalan seperti semstinya
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nik: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format nama: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan type abnormal: " + e.getMessage());
        }
    }
}
