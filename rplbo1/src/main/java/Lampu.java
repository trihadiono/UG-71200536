import java.awt.*;

public class Lampu {
    private Color warna;

    public void gantiWarna(Color color){
        warna = color;
    }

    public Color warnaSekarang(){
        return warna;
    }

    public void nyala(){
        warna = Color.WHITE;
    }

    public void mati(){
        warna = Color.BLACK;
    }
}
