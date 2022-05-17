// Disciplina: Criação de Aplicação e Sistema
// Professora: Lucy Mari
// Introdução a Linguagem Java
import javax.swing.*;

public class AtividadePratica {
    public static void main(String[] args) {
        
        int num1, num2, divi;
        double poten;
        String msg="";
        
            num1= Integer.parseInt (JOptionPane.showInputDialog("Digite um número ineiro"));
            num2= Integer.parseInt (JOptionPane.showInputDialog("Digite outro número ineiro"));

            divi = (int)num1 / (int)num2;
            poten = Math.pow(num1, num2);

            msg = msg + "Quociente da divisão de " + num1 + " por " + num2 + " = " + divi + "\n";
            msg = msg + "Potência de " + num1 + " por " + num2 + " = " + poten + "\n";
            JOptionPane.showMessageDialog(null, msg);
    }  
    
}
