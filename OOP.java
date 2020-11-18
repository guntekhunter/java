package agung.oop;
class anjing{
    int jumlah_kaki;
    String nama;

}
class manusia{
        int NIM;
        String nama;
        }
public class OOP {
    public static void main (String[] args){
        System.out.println("masukkan nilai yang anda inginkan:");
        manusia manusiaPertama = new manusia();
        manusiaPertama.nama="agung";
        System.out.println(manusiaPertama.nama);
        anjing iniji = new anjing();
        iniji.jumlah_kaki = 10;
        System.out.println(iniji.jumlah_kaki);
        manusia nama2 = new manusia();
        nama2.nama = "Tor";
        System.out.println(nama2.nama);
    }
}
