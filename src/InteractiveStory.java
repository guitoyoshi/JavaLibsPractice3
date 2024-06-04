import java.util.Scanner;
import javax.swing.JOptionPane;

public class InteractiveStory {

    public static void main(String[] args) {
        // Solicitar várias entradas do usuário
        String name = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        String animal = JOptionPane.showInputDialog(null, "Qual é o seu animal favorito?");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem?"));
        String mora = JOptionPane.showInputDialog(null, "Em que cidade você mora?");
        String[] acceptableValues = {"neymar ", "Cr7 ", "Messi ", "Calleri "}; //jogadores
        String string= (String)JOptionPane.showInputDialog(null, //abre a caixa de dialogo
       "goat do fortnite",
       "selecione",
       1, //inicia na primeira opção
       null,
       acceptableValues,
       acceptableValues[1]);
       
        // História interativa com partes modificadas pelo usuário
        String story = "seu nome é " + name + ".\n";
        story += "você gosta de " + animal + ".\n";
        story += "cê tem " + age + " anos e mora em " + mora + ".\n";
        story += "e você acha o " + string + " o goat do futebol";
     
        // Exibir a história resultante em uma caixa de diálogo
       JOptionPane.showMessageDialog(null, story);
        
       System.out.println("coloque 3 numeros para soma");
       Scanner scanner = new Scanner(System.in);
       int soma = 0;
       soma += scanner.nextInt();
       soma += scanner.nextInt();
       soma += scanner.nextInt();
               
               
       scanner.close();
       
       System.out.println("a soma dos numeros acima e :" + soma);
    }
}