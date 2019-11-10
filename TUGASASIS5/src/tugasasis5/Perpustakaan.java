package tugasasis5;

/**
 *
 * @author santiclara
 */
public class Perpustakaan {
    
}
class Buku extends Perpustakaan {
    private String Judul, Pengarang, Jenis;
    private int Halaman;

    public Buku() {
        Judul = "kosong";
        Pengarang = "kosong";
        Halaman = 0;
        Jenis = "kosong";
    }

    public Buku(String Judul, String Pengarang, String Jenis, int Halaman) {
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Halaman = Halaman;
        this.Jenis = Jenis;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        this.Judul = Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public int getHalaman() {
        return Halaman;
    }

    public void setHalaman(int Halaman) {
        this.Halaman = Halaman;
    }
    
    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    public void print() {
        System.out.println("Judul Buku = " + Judul + "\nNama Pengarang = " + Pengarang+ "\nHalaman Buku = " + Halaman + "\nJenis Buku = " + Jenis);
    }
    
    public String printt() {
        return "Judul Buku = " + Judul + "\n | Nama Pengarang = " + Pengarang+ "\n | Halaman Buku = " + Halaman + "\n | Jenis Buku = " + Jenis;
    }
    
    public String jarak() {
        return "                                                                   "
                + "";
    }
    
    
    class Fiksi extends Buku {
    private String JenisBuku;
    
    public Fiksi() {
        super();
        JenisBuku = "Fiksi";
    }

    public Fiksi(String JenisBuku, String Judul, String Pengarang, String Jenis, int Halaman) {
        super(Judul, Pengarang, Jenis, Halaman);
        this.JenisBuku = JenisBuku;
    }

    public String getJenisBuku() {
        return JenisBuku;
    }

    public void setJenisBuku(String JenisBuku) {
        this.JenisBuku = JenisBuku;
    }
    
}
    
    
    class NonFiksi extends Buku {
    private String JenisBuku;

    public NonFiksi() {
        super();
        JenisBuku = "Non Fiksi";
    }

    public NonFiksi(String JenisBuku, String Judul, String Pengarang, String Jenis, int Halaman) {
        super(Judul, Pengarang, Jenis, Halaman);
        this.JenisBuku = JenisBuku;
    }

    public String getJenisBuku() {
        return JenisBuku;
    }

    public void setJenisBuku(String JenisBuku) {
        this.JenisBuku = JenisBuku;
    }
    
    
   }
}


