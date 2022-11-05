import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pembeli beli = new Pembeli();
        Kasir kas1 = new Kasir();
        Kasir kas2 = new Kasir();
        Baju baj = new Baju();
        Import imp = new Import();
        Transaksi trans = new Transaksi();
        int menu, pilih, n, no, i, j;
        int[] id  = new int[10];
        char[] uk = new char[10];
        String[] war = new String[10];
        String[] merk = new String[10];
        int[] har = new int[10];
        String[] asl = new String[10];
        int[] id2 = new int[10];
        int id4, harga4, jumlah4, disk = 0;
        String tgl;
        String[] name2 = new String[10];
        char ulang;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\t\tDATA PENJUALAN TOKO BAJU");
            System.out.println("\t\t------------------------");
            System.out.println("Menu:");
            System.out.println("1. Daftar Baju");
            System.out.println("2. Data Pembeli");
            System.out.println("3. Data kasir");
            System.out.println("4. Transaksi");
            System.out.println("-----------------------------");
            System.out.print("Masukkan menu yang dipilih: ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Daftar baju");
                    System.out.println("-----------");
                    System.out.println("1. Import");
                    System.out.println("2. Lokal");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Baju Import");
                        System.out.println("-----------");
                        // Baju import 1
                        i = 1;
                        id[i] = 101;
                        uk[i] = 'S';
                        war[i] = "Hitam";
                        merk[i] = "Uniqlo";
                        har[i] = 180000;
                        asl[i] = "Jepang";
                        // Baju import 2
                        i = 2;
                        id[i] = 102;
                        uk[i] = 'M';
                        war[i] = "Putih";
                        merk[i] = "LV";
                        har[i] = 265000;
                        asl[i] = "Amerika";
                        for (i = 1; i <= 2 ; i++) {
                            System.out.println("Baju ["+i+"]");
                            imp.dataBaju(id[i], uk[i], war[i], merk[i], har[i], asl[i]);
                            imp.cetakBaju();
                        }
                    }
                    if (pilih == 2) {
                        // Baju lokal 1
                        i = 3;
                        id[i] = 103;
                        uk[i] = 'M';
                        war[i] = "Biru";
                        merk[i] = "Clarissa";
                        har[i] = 95000;
                        //Baju lokal 2
                        i = 4;
                        id[i] = 104;
                        uk[i] = 'L';
                        war[i] = "Merah";
                        merk[i] = "Tiara";
                        har[i] = 110000;
                        j = 1;
                        for (i = 3; i <= 4 ; i++) {
                            System.out.println("Baju ["+j+"]");
                            imp.dataBaju(id[i], uk[i], war[i], merk[i], har[i]);
                            imp.cetakBaju();
                            j++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Data Pembeli");
                    System.out.println("------------");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Update data");
                    System.out.println("---------------");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Tambah data");
                        System.out.println("-----------");
                        System.out.print("Banyak data pembeli yang ingin diinputkan: ");
                        n = in.nextInt();

                        for (i = 0; i < n; i++) {
                            System.out.println("Data pembeli [" + (i + 1) + "]");
                            System.out.print("Masukkan id pembeli: ");
                            id2[i] = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            name2[i] = in.next();
                        }
                        System.out.println("\nOutput data pembeli");
                        i = 0;
                        while (name2[i] != null) {
                            beli.tambahData(id2[i], name2[i]);
                            System.out.println("["+(i+1)+"] "+ beli.getId_pembeli()+" " +beli.getNama());
                            i++;
                        }
                    }
                    if (pilih == 2) {
                        System.out.println("Update Data");
                        System.out.println("-----------");
                        System.out.println("Output data pembeli");
                        i = 0;
                        while (name2[i] != null) {
                            beli.tambahData(id2[i], name2[i]);
                            System.out.println("[" +(i+1)+ "]"+beli.getId_pembeli()+" "+beli.getNama());
                            i++;
                        }
                        System.out.print("Masukkan nomor data yang ingin diubah: ");
                        no = in.nextInt();
                        no = no-1;
                        System.out.print("Masukkan id pembeli: ");
                        id2[no] = in.nextInt();
                        System.out.print("Masukkan nama: ");
                        name2[no] = in.next();
                        System.out.println("Mengubah data ke-"+beli.updateData(no, id2[no], name2[no])+"...");
                        System.out.println("Output setelah data pembeli diupdate");
                        i = 0;
                        while (name2[i] != null) {
                            beli.tambahData(id2[i], name2[i]);
                            System.out.println("[" +(i+1) + "] " + beli.getId_pembeli() + " " + beli.getNama());
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Data Kasir");
                    System.out.println("----------");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Update data");
                    System.out.println("---------------");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Tambah Data");
                        System.out.println("-----------");
                        System.out.println("Kasir 1");
                        System.out.print("Masukkan id_kasir: ");
                        kas1.id_kasir = in.nextInt();
                        System.out.print("Masukkan nama: ");
                        kas1.nama = in.next();
                        System.out.println("Kasir 2");
                        System.out.print("Masukkan id_kasir: ");
                        kas2.id_kasir = in.nextInt();
                        System.out.print("Masukkan nama: ");
                        kas2.nama = in.next();
                        System.out.println("Output data kasir");
                        System.out.println("Kasir 1");
                        System.out.println(kas1.getId_kasir()+" "+kas1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(kas2.getId_kasir()+" "+kas2.getNama());
                    }
                    if (pilih == 2) {
                        System.out.println("Update Data");
                        System.out.println("-----------");
                        System.out.println("Output data kasir");
                        System.out.println("Kasir 1");
                        System.out.println(kas1.getId_kasir()+" "+kas1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(kas2.getId_kasir()+" "+kas2.getNama());
                        System.out.print("Masukkan nomor data yang ingin diubah");
                        no = in.nextInt();
                        if (no == 1) {
                            System.out.println("Kasir 1");
                            System.out.print("Masukkan id_kasir: ");
                            kas1.id_kasir = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            kas1.nama = in.next();
                        }
                        if (no == 2) {
                            System.out.println("Kasir 2");
                            System.out.print("Masukkan id_kasir: ");
                            kas2.id_kasir = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            kas2.nama = in.next();
                        }
                        System.out.println("Output data kasir setelah diupdate");
                        System.out.println("Kasir 1");
                        System.out.println(kas1.getId_kasir()+" "+kas1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(kas2.getId_kasir()+" "+kas2.getNama());
                    }
                    break;
                case 4:
                    System.out.println("Transaksi");
                    System.out.println("---------");
                    System.out.print("Masukkan id transaksi: ");
                    id4 = in.nextInt();
                    trans.setId_transaksi(id4);
                    System.out.print("Masukkan tanggal beli: ");
                    tgl = in.next();
                    trans.setTgl_beli(tgl);
                    System.out.print("Masukkan harga: ");
                    harga4 = in.nextInt();
                    trans.setHarga(harga4);
                    System.out.print("Masukkan jumlah: ");
                    jumlah4 = in.nextInt();
                    trans.setJumlah(jumlah4);
                    System.out.println("---------------------------------------");
                    System.out.println("Total harga = "+trans.totalHarga(jumlah4, harga4));
                    if (trans.totalHarga(jumlah4, harga4) < 500000) {
                        System.out.println("Diskon = "+disk);
                    }
                    if (trans.totalHarga(jumlah4, harga4) >= 500000) {
                        System.out.println("Selamat pembelian sebesar 500k atau lebih dapat dikon 5%");
                        System.out.println("Diskon = "+trans.diskon());
                    }
                    System.out.println("Jumlah yang harus dibayar = "+trans.jumlahBayar());
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak tersedia!!!");
            }
            System.out.print("Pilih menu lainnya (y/t): ");
            ulang = in.next().charAt(0);
        } while(ulang != 't');

    }
}