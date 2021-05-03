package calculadoraimc;

//importando todas as funções das bibliotecas swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CalculadoraIMC {

    private JFrame janela; //cria componente JFrame
    private JPanel painelPrincipal; //cria componente JPainel
    private Label label1, lblPesoKg, lblAlturaMt, lblIMC, lblSituacao; // cria componentes label
    private TextField txtPesoKg, txtAlturaMt; // cria componentes TextField
    DecimalFormat df = new DecimalFormat("0.00");    
    double situacao;

    public static void main(String[] args) {
        new CalculadoraIMC().montaTela(); //define método montatela em Classe fatec, responsável pela interface gráfica
    }

    private void montaTela() {//chama os métodos que formarão a tela
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCalcular();
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
        label1 = new Label("Calculadora de Índice de Massa Corpórea");
        painelPrincipal.add(label1);
    }

    ;

// insere texto no label , espaços aos TextFields e adiciona os componentes no painel;
private void preparaText() {
        lblPesoKg = new Label("Peso em KG");
        txtPesoKg = new TextField("");
        lblAlturaMt = new Label("Altura em Metros");
        txtAlturaMt = new TextField("");
        lblIMC = new Label("");
        lblSituacao = new Label("");
        painelPrincipal.add(lblPesoKg);
        painelPrincipal.add(txtPesoKg);
        painelPrincipal.add(lblAlturaMt);
        painelPrincipal.add(txtAlturaMt);
        painelPrincipal.add(lblIMC);
        painelPrincipal.add(lblSituacao);        
    }
    ;

private void preparaBotaoCalcular() {
        JButton botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                situacao = ( (Double.parseDouble(txtPesoKg.getText())) / ( (Double.parseDouble(txtAlturaMt.getText())) * (Double.parseDouble(txtAlturaMt.getText())) ) );
                lblIMC.setText(String.valueOf(df.format(situacao)));
                if(situacao < 18.5){
                    lblSituacao.setText("Você está abaixo do peso ideal");                    
                } else if(situacao >= 18.5 && situacao <= 24.9){
                    lblSituacao.setText("Parabéns - você está em seu peso normal!");                    
                } else if(situacao >= 25.0 && situacao <= 29.9){
                    lblSituacao.setText("Você está acima de seu peso (sobrepeso)");                    
                } else if(situacao >= 30.0 && situacao <= 34.9){
                    lblSituacao.setText("Obesidade grau I");                    
                } else if(situacao >= 35.0 && situacao <= 39.9){
                    lblSituacao.setText("Obesidade grau II");                    
                } else if(situacao >= 40.0){
                    lblSituacao.setText("Obesidade grau III");                    
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(botaoCalcular);//adiciona botão Sair ao painel
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
