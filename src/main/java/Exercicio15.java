import javax.swing.JOptionPane;

public class Exercicio15{

    public static void main(String[] args) {
        
       String[] opcoes = {"Engenheiro", "Programador", "Médico", "Advogado", "Designer"};
         
            int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a profissão de Tibúrcio:",
            "Profissão de Tibúrcio",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        
       
     String profissao;


        if (escolha >= 0 && escolha < opcoes.length) {
            profissao = opcoes[escolha];
        } else {
            profissao = "DESEMPREGADO";
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Tibúrcio é " + profissao);
    }
}


