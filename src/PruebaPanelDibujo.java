import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        //Crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();
        //crea un nuevo marco para contener el panel
        JFrame aplicacion =new JFrame();

        // Establece el marco para salir cuando se cierre
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);// Agrega el panel al marco
        aplicacion.setSize(250,250);//Establece el tamaño del marco
        aplicacion.setVisible(true);//Se hace el marco visible

    }





}
