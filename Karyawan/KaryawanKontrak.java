package Karyawan;

/**
 *
 * NAndi Prabandaru
 * A11.2021.13907
 */

public class KaryawanKontrak extends Karyawan{
    private double upahHarian = 50000;
    private double tunjanganAnak = 100000;
    private int jumlahHariMasuk;
    private int jumlahAnak;

    public KaryawanKontrak(int jumlahHariMasuk, int jumlahAnak, String nama, String nip) {
        super(nama, nip);
        this.jumlahHariMasuk = jumlahHariMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(double upahHarian) {
        this.upahHarian = upahHarian;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    
    public double hitungTotalGaji(){
        return ((upahHarian * (double)this.jumlahHariMasuk) + ((double)this.jumlahAnak * tunjanganAnak));
    }
}
