public class Import extends Baju{
    String asal;
    @Override
    public void dataBaju(int id, char uk, String war, String merk, int har) {
        super.dataBaju(id, uk, war, merk, har);
    }

    //overloading
    public void dataBaju(int id, char uk, String war, String merk, int har, String asl) {
        super.dataBaju(id, uk, war, merk, har);
        this.asal = asl;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
}
