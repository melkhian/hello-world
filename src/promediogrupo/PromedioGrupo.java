//6.	Promedio grupo. Crea un programa en Java que permita saber la nota promedio de un grupo de aprendices y saber cómo es académicamente teniendo en cuenta lo siguiente:
//a.	Si el promedio es mayor de 4.5 el grupo es Destacado
//b.	Si el promedio esta entre 4.0 y 4.5 el grupo es Sobresaliente
//c.	Si el promedio es mayor de 3.5 el grupo es Aceptable
//d.	Si el promedio es menor o igual a 3.5 el grupo Tiene inconvenientes y requiere una atención especial

package promediogrupo;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class PromedioGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Estudiantes= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes"));
         CalculoPromedio(Estudiantes);
    }
    
    public static double CalculoPromedio(double promedio){
        
        double PromedioCalculo = 0;
        double Notas[] = new double[100];
        
        for(int i=0; i<promedio;i++){
  
            
            Notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Estudiante "+i+" digite su nota:"));
            PromedioCalculo = PromedioCalculo + Notas[i];
        }
        PromedioCalculo= PromedioCalculo / promedio;
        
        
        if(PromedioCalculo>4.5){
            
            JOptionPane.showMessageDialog(null,"El grupo es destacado");
        }
        if(PromedioCalculo>4.0 && PromedioCalculo<4.6){
            
            JOptionPane.showMessageDialog(null,"El grupo es sobresaliente");
        }
        if(PromedioCalculo>3.5 && PromedioCalculo<4.0){
            
            JOptionPane.showMessageDialog(null,"El grupo es Aceptable");
        }
        if(PromedioCalculo<=3.5){
            JOptionPane.showMessageDialog(null,"El grupo Tiene inconventientes");
        }
        return 0;
        
        
    }
}

