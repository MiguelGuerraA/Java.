
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Idade {
public static void main(String[] args) {
        
        // solicita a entrada do ano de nascimento e do ano atual
        String anoNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        String anoAtual = JOptionPane.showInputDialog("Digite o ano atual:");
        
        // converte os anos para números
        int nascimento = Integer.parseInt(anoNascimento);
        int atual = Integer.parseInt(anoAtual);
        
        // calcula a idade no ano atual
        int idadeAtual = atual - nascimento;
        
        // calcula a idade em 2050
        int idade2050 = 2050 - nascimento;
        
        // exibe as informações
        JOptionPane.showMessageDialog(null, "Idade no ano atual: " + idadeAtual +
                                            "\nIdade em 2050: " + idade2050);
    }
}


