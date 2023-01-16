import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class IMC {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        try {

            //Pide la estatura
            double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Estatura (Metros): "));
            //Pide el peso
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Peso (Kilogramos): "));
            double imc = (peso/(Math.pow(estatura,2)));
            //Muestra el mensaje
            String mensaje = String.format("Su IMC es: "+df.format(imc));
            //Mensaje de usuario
            JOptionPane.showMessageDialog(null,mensaje);

        }catch ( Exception e){
            String Error = String.format("Datos Erroneos Vuelva a Ingresar");
            JOptionPane.showMessageDialog(null,Error);

        }finally {
            System.out.println("Fin del Programa!!");
        }
    }
}
