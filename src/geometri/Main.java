package geometri;
public class Main {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran(8);
        
        System.out.println("Luas Lingkaran : "+ling.luas());
        System.out.println("Keliling Lingkaran : "+ling.keliling());
        
        PersegiPanjang Perpan = new PersegiPanjang(8,2);
        
        System.out.println("Luas PersegiPanjang : "+Perpan.luas());
        System.out.println("Keliling PersegiPanjang : "+Perpan.keliling());
        
    }
}
