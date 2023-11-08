import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Daniel", "Pepe", "maria", "Paco", "Lalo","Raquel", "Lea"} ;
        int count = nombres.length;
        for(int i = 0; i<count; i++){
            if(nombres[i].equalsIgnoreCase("daniel") ||
                    nombres[i].equalsIgnoreCase("maria")){
                continue;
            }
            System.out.println(i + ".-" +nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count;i ++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontraDO");
        }else {
            JOptionPane.showMessageDialog(null,buscar + " NO fue encontraDO");
        }
    }
}
