import javax.swing.JOptionPane;//importa a classe JOptionPane da biblioteca javax.swing, que é usada para criar janelas de diálogo.
public class Ex1{
    public static void main(String args[]){
//texto: Uma variável do tipo String é declarada para armazenar o texto que será exibido na janela de diálogo.
//r: Uma variável do tipo float é declarada e inicializada com o valor 3.5. O sufixo f indica que é um valor do tipo float.
    String texto;
    float r=3.5f;
    
    //Aqui, a variável texto é atribuída a uma string formatada usando String.format. A string "r =%.1f" indica que r será exibido com uma casa decimal. O valor de r (3.5) é então inserido nessa string, resultando em "r =3.5".
    texto = String.format("r =%.1f", r);

    JOptionPane.showMessageDialog(null,texto);
    //Esta linha exibe uma janela de diálogo com o texto armazenado na variável texto. O primeiro argumento (null) indica que a janela de diálogo não está associada a nenhuma janela específica (é uma janela independente).
    }
}