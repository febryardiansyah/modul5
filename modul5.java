public class modul5{//kelas utama
  public static void main(String[] args) {
    Ninja [] m = new Ninja[3];//array

    // membuat objek 1
    m[0] = new Ninja();
    m[0].setNo("012606");
    m[0].setNama("Uciha Sasuke");
    m[0].setPeringkat("Genin");

    // membuat objek 2  
    m[1] = new Ninja();
    m[1].setNo("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    // membuat objek 3
    m[2] = new Ninja();
    m[2].setNo("012601");
    m[2].setNama("Haruno Sakura");
    m[2].setPeringkat("Chunin");

    // Menampilkan 3 objek dari array
    System.out.println("Data Shinobi\n");
    for(Ninja x:m){
      System.out.println ("No Registrasi : "+x.getNo());
      System.out.println ("Nama : "+x.getNama());
      System.out.println ("Peringkat : "+x.getPeringkat());
      System.out.println ();

    }
  }
}
class Ninja {
  private String no,nama,peringkat;//mendeklarasikan atribut

  // getter dan setter
  public void setNo (String no){
    this.no = no;
  }
  public String getNo(){
    return no;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public String getNama(){
    return nama;
  }
  public void setPeringkat(String peringkat){
    this.peringkat = peringkat;
  }
  public String getPeringkat(){
    return peringkat;
  }

}
