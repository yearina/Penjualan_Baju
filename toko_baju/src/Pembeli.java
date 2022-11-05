public class Pembeli {
    public int id_pembeli;
    public String nama;

    public void tambahData(int id, String name){
        this.id_pembeli = id;
        this.nama = name;

    }

    public int updateData(int no, int id, String name){
        this.id_pembeli = id;
        this.nama = name;
        return no+1;
    }

    public int getId_pembeli() {
        return id_pembeli;
    }

    public String getNama() {
        return nama;
    }


}
