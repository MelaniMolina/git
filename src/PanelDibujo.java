import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    //dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int anchura = getWidth();//Anchura total
        int altura = getHeight();//altura total

        //dinuja una linea de la esquina superior izquierda a la esquina superior derecha
        g.drawLine(15,150,50,60);
        g.drawLine(50,60,85,90);
        g.drawLine(85,90,120,60);

        // dibuja una linea de la esquina inferior izquierda a la esquina superior derecha

        //g.drawLine(0,altura,anchura,0);
        //g.drawLine(15,60,60,60);

       // g.drawLine(20,40,120,100);
       // g.drawLine(150,10,110,120);
        //g.drawLine(10,150,50,60);
        g.drawLine(120,60,155,150);

      ;
    }

}
