// Disciplina: Criação de Aplicação e Sistema
// Professora: Lucy Mari
// Módulos e Matriz no Java
import javax.swing.*;

public class AtividadePratica4 {
    public static void soma(int vet[]){
        int s=0;
        for (int i = 0; i<vet.length; i++){
            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria eh "+ s);
    }
    public static int produto (int vet[]){
        int p=1;
        for (int i = 0; i<vet.length; i++){
            p = p * vet[i];
        }
        return p;
    }
    public static void main(String entrada[]){
        int num1, num2, num3, num4, num5;
               
            num1= Integer.parseInt (JOptionPane.showInputDialog("Digite um número ineiro"));
            num2= Integer.parseInt (JOptionPane.showInputDialog("Digite outro número ineiro"));
            num3= Integer.parseInt (JOptionPane.showInputDialog("Digite outro número ineiro"));
            num4= Integer.parseInt (JOptionPane.showInputDialog("Digite outro número ineiro"));
            num5= Integer.parseInt (JOptionPane.showInputDialog("Digite outro número ineiro"));
        
        int s=0, vetor[] = {num1, num2, num3, num4, num5};
        int r;

        soma (vetor);
        r = produto (vetor);
        JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
        System.exit(0);
    }
}
