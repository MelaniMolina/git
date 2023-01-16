import javax.swing.JOptionPane;
public class Dialogo_nombre {
    public static void main(String[] args) {
        //Pide el mensaje
        String nombre = JOptionPane.showInputDialog("Cual es su nombre :)");
        // Se crea mensaje
        String mensaje = String.format("Bienvenido a la programacion en java " + nombre);
        //Muestra el mensaje para dar la bienvenida al usuario
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
