/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execiciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Carvalho
 */
public class ExecicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, mCem = 0, totImp = 0, totPar = 0, tot = 0, m;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n(0 Interrompe)"));
            s += n;
            if (n != 0) {
                tot++;
                if (n >= 100) {
                    mCem++;
                } else if (n % 2 == 0) {
                    totPar++;
                } else {
                    totImp++;
                }
            }
        } while (n != 0);
        m = s / tot;
        JOptionPane.showMessageDialog(null,
                "<html>Resultado:<hr><br>"
                + "<br>Total de valores é: " + tot
                + "<br>Total de pares é: " + totPar
                + "<br>Total de ímpares é: " + totImp
                + "<br>Acima de 100 são: " + mCem
                + "<br>Média dos valores: " + m
                + "</html>",
                "Resultado final", JOptionPane.WARNING_MESSAGE);
    }

}
