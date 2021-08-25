import javax.swing.JOptionPane;

public class NumerosPrimos{

    public static void main(String[] args) {
        
        int n, aux, i, contador = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        aux = n;
        for (i = 1; i <= aux; i++){

            if ((n % i) == 0){
                contador++;
            }

        }

        if (contador > 2){

            JOptionPane.showMessageDialog(null, "Esse numero nao e primo");
            JOptionPane.showMessageDialog(null, contador);

        }
        else{

            JOptionPane.showMessageDialog(null, "Esse numero e primo");
            JOptionPane.showMessageDialog(null, contador);

        }

    }

}