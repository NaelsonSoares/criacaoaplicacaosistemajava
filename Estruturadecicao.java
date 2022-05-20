import javax.swing.*;
//class

public class Estruturadecicao {
    
    // variaveis
    public static void main(String[] args){
    int num;
    char op=0;
    String msg=" ", msgEntr="Digite 1 para par/impar\n Digite 2 para positivo/negativo";
    
    //entrada
    num = Integer.parseInt (JOptionPane.showInputDialog("Digite um número ineiro"));
    op = (JOptionPane.showInputDialog(msgEntr)). charAt(0);

    switch(op){
        case '1':{
            if(num % 2 == 0){
                msg= msg + num + " e par.\n\n"; 
            }
            else{
                msg= msg + num + " e impar.\n\n";
            }
            break;
        }
            case '2':{
                if(num > 0){
                    msg= msg + num + " e positivo.\n\n"; 
                }
                else{
                    msg= msg + num + " e nao positivo.\n\n";
                }
                break;
            }
                default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");             
        }
                if (op == '1' || op == '2'){ 
            
                JOptionPane.showMessageDialog(null, msg); 
                }    
    System.exit(0);
    }
}
