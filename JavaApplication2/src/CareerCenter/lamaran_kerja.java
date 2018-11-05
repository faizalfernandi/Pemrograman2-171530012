package CareerCenter;



public class lamaran_kerja {
    String namaALumni;
    int idAlumni;
    String perusahaan;
    String alamatPerusahaan;
    String loker;
    String tglBukaLoker;
    String tglTutupLoker;
    int idLamaranKerja;
    String tglkirim;
    String status;
   
    lamaranMasukPerusahaan lamaranMasukPerusahaan = new lamaranMasukPerusahaan();
    lamaranAlumni lamaranAlumni = new lamaranAlumni();

    public String getNamaALumni() {
        return namaALumni;
    }

    public void setNamaALumni(String namaALumni) {
        this.namaALumni = namaALumni;
    }

    public int getIdAlumni() {
        return idAlumni;
    }

    public void setIdAlumni(int idAlumni) {
        this.idAlumni = idAlumni;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getLoker() {
        return loker;
    }

    public void setLoker(String loker) {
        this.loker = loker;
    }

    public String getTglBukaLoker() {
        return tglBukaLoker;
    }

    public void setTglBukaLoker(String tglBukaLoker) {
        this.tglBukaLoker = tglBukaLoker;
    }

    public String getTglTutupLoker() {
        return tglTutupLoker;
    }

    public void setTglTutupLoker(String tglTutupLoker) {
        this.tglTutupLoker = tglTutupLoker;
    }

    public int getIdLamaranKerja() {
        return idLamaranKerja;
    }

    public void setIdLamaranKerja(int idLamaranKerja) {
        this.idLamaranKerja = idLamaranKerja;
    }

    public String getTglkirim() {
        return tglkirim;
    }

    public void setTglkirim(String tglkirim) {
        this.tglkirim = tglkirim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
