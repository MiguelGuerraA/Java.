
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Tabuada7 {
public static void main(String[] args) {
    // Pede ao usuário para inserir um número
    String input = JOptionPane.showInputDialog(null, "Informe um número:");
    int numero = Integer.parseInt(input);

    // Cria uma string para armazenar a tabuada de multiplicação
    StringBuilder tabuada = new StringBuilder();
    for (int i = 0; i <= 10; i++) {
      int resultado = numero * i;
      tabuada.append(numero + " x " + i + " = " + resultado + "\n");
    }

    // Exibe a tabuada de multiplicação
    JOptionPane.showMessageDialog(null, tabuada.toString());
  }
}

