package Karyawan;

/**
 *
 * Andi Prabandaru
 * A11.2021.13907
 */

public class KaryawanTetap extends Karyawan{
    private double gajiPokok = 2500000;
    private double tunjanganAnak = 100000;
    private int jumlahAnak;

    public KaryawanTetap(int jumlahAnak, String nama, String nip) {
        super(nama, nip);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

   
    public double hitungTotalGaji(){
        return gajiPokok + ((double)this.jumlahAnak * tunjanganAnak);
    }
}
