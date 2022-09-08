import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        lampu.nyala();
        System.out.println((lampu.warnaSekarang()));
        lampu.mati();
        System.out.println((lampu.warnaSekarang()));
        lampu.gantiWarna(Color.BLUE);
        System.out.println((lampu.warnaSekarang()));

        if (lampu.warnaSekarang() == Color.black){
            System.out.println("Lampunya mati");
        } else if (lampu.warnaSekarang() == Color.white) {
            System.out.println("Lampunya nyala");
        } else if (lampu.warnaSekarang() == Color.blue) {
            System.out.println("lampunya nyala");
        }
    }
}
