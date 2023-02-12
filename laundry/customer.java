package Season2.laundry;

public class customer {
    private String namaCustomer;
    private String alamat; 
    private char jk;
    private int saldo;

    //nama customer
    public void setNamaCustomer(String namaCustomer){
        this.namaCustomer=namaCustomer;
    }
    public String getNamaCustomer(){
        return namaCustomer;
    }

    //alamat
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }

    //jenis kelamin
    public void setJk(char jk){
        this.jk=jk;
    }
    public char getJk(){
        return jk;
    }

    //saldo
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public int getSaldo(){
        return saldo;
    }

    //sisa saldo
    // public int sisaSaldo(int saldoAwal, int total){
    //     int sisaSaldo = saldoAwal-total;
    //     return sisaSaldo;
    // }
}
