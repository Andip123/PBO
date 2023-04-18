package Karyawan;

/**
 *
 * Andi Prabandaru
 * A11.2021.13907
 */

public class Karyawan {
    private String nama;
    private String nip;

    public Karyawan(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}
