package latihaninheritance;
public class LatihanInheritance {
    public static void main(String[] args) {
PersegiPanjang a= new PersegiPanjang();
a.setPanjang(6);
a.setLebar(5);
        System.out.println("");
        System.out.println("Contoh Program Pewarisan");
        System.out.println("");
        System.out.println("Superclass PersegiPanjang");
        System.out.println("Panjang : "+a.getPanjang());
        System.out.println("Lebar : "+a.getLebar());
        System.out.println("Luas : "+a.Luas());
        System.out.println("");

Balok b= new Balok();
b.setPanjang(4);
b.setLebar(3);
b.setTinggi(5);
        System.out.println("Subclass Balok");
        System.out.println("Panjang : "+b.getPanjang());
        System.out.println("Lebar : "+b.getLebar());
        System.out.println("Tinggi : "+b.getTinggi());
        System.out.println("Volume : "+b.Volume());
    }
    
}
