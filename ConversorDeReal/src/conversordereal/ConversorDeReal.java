package conversordereal;

//importando todas as funções das bibliotecas swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class ConversorDeReal {

    private JFrame janela; //cria componente JFrame
    private JPanel painelPrincipal; //cria componente JPainel
    private Label label1, lblResultado; // cria componentes label
    private TextField display; // cria componentes TextField
    DecimalFormat df = new DecimalFormat("0.00");
    ButtonGroup grupoDeBotoes = new ButtonGroup();

    public static void main(String[] args) {
        new ConversorDeReal().montaTela(); //define método montatela em Classe fatec, responsável pela interface gráfica
    }

    private void montaTela() {//chama os métodos que formarão a tela
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoRadioDolar();
        preparaBotaoRadioEuro();
        preparaBotaoRadioIene();
        preparaBotaoSair();
        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Conversor de Moeda para Real");
        // como é necessário utilizar o Jframe no método mostraJanela é necessário que
        // janela seja um atributo ao invés de uma variável local
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //indica ao nosso frame que a aplicação deve ser terminada quando o usuário fechar a janela
    }

    private void mostraJanela() {
        janela.pack(); // serve para organizar os componentes do frame para que eles ocupem o menor espaço possível.
        janela.setSize(350, 300); //dimensões do Frame
        janela.setVisible(true);// recebe um boolean indicando se queremos que 
        //a janela esteja visível ou não.
    }

// prepara o Painel que receberá os botões e adiciona o Painel no Frame
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        // layout em forma de tabela com 3 linhas e 2 colunas; 
        //painelPrincipal.setLayout(new GridLayout(5, 4));
        janela.add(painelPrincipal);
    }

// insere texto no label1 e adiciona o label no painel; 
    private void preparaLabel() {
        label1 = new Label("Valor em Reais");
        painelPrincipal.add(label1);
    }

    ;

// insere texto no label , espaços aos TextFields e adiciona os componentes no painel;
private void preparaText() {
        display = new TextField("");
        lblResultado = new Label("");
        painelPrincipal.add(display);
        painelPrincipal.add(lblResultado);
    }

    ;

    private void preparaBotaoRadioDolar() {
        final JRadioButton jRadioButtonDolar = new JRadioButton("Dolar");
        jRadioButtonDolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResultado.setText(String.valueOf("O valor em Dólar é US$ " + df.format(Double.parseDouble(display.getText()) / 5.44)));
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        grupoDeBotoes.add(jRadioButtonDolar);//adiciona botão ao painel
        painelPrincipal.add(jRadioButtonDolar);//adiciona botão ao painel
    }

    private void preparaBotaoRadioEuro() {
        final JRadioButton jRadioButtonEuro = new JRadioButton("Euro");
        jRadioButtonEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResultado.setText(String.valueOf("O valor em Euro é € " + df.format(Double.parseDouble(display.getText()) / 6.55)));
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        grupoDeBotoes.add(jRadioButtonEuro);//adiciona botão ao painel
        painelPrincipal.add(jRadioButtonEuro);//adiciona botão ao painel
    }

    private void preparaBotaoRadioIene() {
        final JRadioButton jRadioButtonIene = new JRadioButton("Iene");
        jRadioButtonIene.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResultado.setText(String.valueOf("O valor em Iene é ¥ " + df.format(Double.parseDouble(display.getText()) / 0.05)));
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        grupoDeBotoes.add(jRadioButtonIene);//adiciona botão ao painel
        painelPrincipal.add(jRadioButtonIene);//adiciona botão ao painel
    }

    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(botaoSair);//adiciona botão Sair ao painel
    }
}
