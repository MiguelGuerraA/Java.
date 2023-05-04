
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Raio {
public class Esfera {

    public static void main(String[] args) {
        
        // recebe o raio da esfera do usuário
        String raioStr = JOptionPane.showInputDialog("Digite o raio da esfera:");
        
        // converte o raio para o tipo double
        double raio = Double.parseDouble(raioStr);
        
        // calcula o comprimento da esfera
        double comprimento = 2 * Math.PI * raio;
        
        // calcula a área da esfera
        double area = Math.PI * Math.pow(raio, 2);
        
        // calcula o volume da esfera
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);
        
        // apresenta os resultados para o usuário
        JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + comprimento + "\nÁrea da esfera: " + area + "\nVolume da esfera: " + volume);
    }

}

}
