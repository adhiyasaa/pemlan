class buku {
    String judulBuku;
    String ISBN;
    String Penulis;
    String Halaman;

    buku(String judulBuku, String ISBN, String Penulis, String Halaman) {
        this.judulBuku = judulBuku;
        this.ISBN = ISBN;
        this.Penulis = Penulis;
        this.Halaman = Halaman;
    }

    void show() {
        System.out.println("Judul Buku = " + this.judulBuku);
        System.out.println("ISBN       = " + this.ISBN);
        System.out.println("Penulis    = " + this.Penulis);
        System.out.println("Halaman    = " + this.Halaman);
    }
}
