public class Baju {
    public int id_baju;
    protected char ukuran;
    protected String warna;
    protected String merek;
    protected int harga;

    public void dataBaju (int id, char uk, String war, String merk, int har){
        setId_baju(id);
        setUkuran(uk);
        setWarna(war);
        setMerek(merk);
        setHarga(har);
    }

    public void cetakBaju(){
        System.out.println("Id baju: "+getId_baju());
        System.out.println("Ukuran: "+getUkuran());
        System.out.println("Warna: "+getWarna());
        System.out.println("Merek: "+getMerek());
        System.out.println("Harga: "+getHarga());
    }

    public int updateData(int no, int id, char uk, String war, String merk, int har){
        setId_baju(id);
        setUkuran(uk);
        setWarna(war);
        setMerek(merk);
        setHarga(har);
        return no;
    }
    public int getId_baju() {
        return id_baju;
    }

    public void setId_baju(int id_baju) {
        this.id_baju = id_baju;
    }

    public char getUkuran() {
        return ukuran;
    }

    public void setUkuran(char ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}