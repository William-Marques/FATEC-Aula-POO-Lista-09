package calculator;

//importando todas as funções das bibliotecas swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    private JFrame janela; //cria componente JFrame
    private JPanel painelPrincipal; //cria componente JPainel
    private Label label1, invisivel01, invisivel02; // cria componentes label
    private TextField display; // cria componentes TextField
    private double memoria = 0;
    private boolean ponto = false, fazendoOperacao = false, apagarParaOProximoNumero = false;
    private String operacao = "";

    public static void main(String[] args) {
        new Calculator().montaTela(); //define método montatela em Classe
//fatec, responsável pela interface gráfica
    }

    private void montaTela() {//chama os métodos que formarão a tela
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotao07();
        preparaBotao08();
        preparaBotao09();
        preparaBotaoDividir();

        preparaBotao04();
        preparaBotao05();
        preparaBotao06();
        preparaBotaoMultiplicar();

        preparaBotao01();
        preparaBotao02();
        preparaBotao03();
        preparaBotaoSubtrair();

        preparaBotao00();
        preparaBotaoPonto();
        preparaBotaoIgual();
        preparaBotaoSomar();
        //preparaBotaoSair();
        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Calculator");
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
        painelPrincipal.setLayout(new GridLayout(5, 4));
        janela.add(painelPrincipal);

    }

// insere texto no label1 e adiciona o label no painel; 
    private void preparaLabel() {
        label1 = new Label("");
        painelPrincipal.add(label1);
    }

    ;

// insere texto no label , espaços aos TextFields e adiciona os componentes no painel;
private void preparaText() {
        display = new TextField("0");
        invisivel01 = new Label("");
        invisivel02 = new Label("");
        painelPrincipal.add(invisivel01);
        painelPrincipal.add(invisivel02);
        painelPrincipal.add(display);
    }

    ;

//criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed
private void preparaBotao00() {
        JButton Botao00 = new JButton("0");
        Botao00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("0"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("0"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("0"));
                }
            }
        });
        painelPrincipal.setLocation(50, 150);//posição do painel no frame 
        painelPrincipal.add(Botao00);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

//criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed
    private void preparaBotao01() {
        JButton Botao01 = new JButton("1");
        Botao01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("1"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("1"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("1"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao01);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

//criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed
    private void preparaBotao02() {
        JButton Botao02 = new JButton("2");
        Botao02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("2"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("2"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("2"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao02);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

//criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed
    private void preparaBotao03() {
        JButton Botao03 = new JButton("3");
        Botao03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("3"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("3"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("3"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao03);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

//criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed
    private void preparaBotao04() {
        JButton Botao04 = new JButton("4");
        Botao04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("4"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("4"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("4"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao04);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotao05() {
        JButton Botao05 = new JButton("5");
        Botao05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("5"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("5"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("5"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao05);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotao06() {
        JButton Botao06 = new JButton("6");
        Botao06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("6"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("6"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("6"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao06);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotao07() {
        JButton Botao07 = new JButton("7");
        Botao07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("7"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("7"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("7"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao07);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotao08() {
        JButton Botao08 = new JButton("8");
        Botao08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("8"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("8"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("8"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao08);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotao09() {
        JButton Botao09 = new JButton("9");
        Botao09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equals("0")) {
                    display.setText(String.valueOf("9"));
                } else if (apagarParaOProximoNumero == true) {
                    display.setText(String.valueOf("9"));
                    apagarParaOProximoNumero = false;
                } else {
                    display.setText(display.getText() + String.valueOf("9"));
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(Botao09);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotaoPonto() {
        JButton BotaoPonto = new JButton(".");
        BotaoPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ponto == false) {
                    if (display.getText().equals("0")) {
                        display.setText(String.valueOf("0."));
                        ponto = true;
                    } else if (apagarParaOProximoNumero == true) {
                        display.setText(String.valueOf("0."));
                        apagarParaOProximoNumero = false;
                    } else {
                        display.setText(display.getText() + String.valueOf("."));
                        ponto = true;
                    }
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(BotaoPonto);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotaoIgual() {
        JButton BotaoIgual = new JButton("=");
        BotaoIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao) {
                    case "/":
                        if (memoria != 0) {
                            display.setText(String.valueOf(memoria / Double.parseDouble(display.getText())));
                            apagarParaOProximoNumero = true;
                            fazendoOperacao = true;
                            operacao = "/";
                            ponto = false;
                        }
                        ;
                        break;
                    case "*":
                        if (memoria != 0) {
                            display.setText(String.valueOf(memoria * Double.parseDouble(display.getText())));
                            apagarParaOProximoNumero = true;
                            fazendoOperacao = true;
                            operacao = "*";
                            ponto = false;
                        }
                        ;
                        break;
                    case "-":
                        if (memoria != 0) {
                            display.setText(String.valueOf(memoria - Double.parseDouble(display.getText())));
                            apagarParaOProximoNumero = true;
                            fazendoOperacao = true;
                            operacao = "-";
                            ponto = false;
                        }
                        ;
                        break;
                    case "+":
                        if (memoria != 0) {
                            display.setText(String.valueOf(memoria + Double.parseDouble(display.getText())));
                            apagarParaOProximoNumero = true;
                            fazendoOperacao = true;
                            operacao = "+";
                            ponto = false;
                        }
                        ;
                        break;
                    case "":
                        break;

                }
            }
        });

        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(BotaoIgual);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotaoDividir() {
        JButton BotaoDividir = new JButton("/");
        BotaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fazendoOperacao == false) {
                    memoria = Double.parseDouble(display.getText());
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "/";
                    ponto = false;
                } else {
                    display.setText(String.valueOf(memoria / Double.parseDouble(display.getText())));
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "/";
                    ponto = false;
                }
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(BotaoDividir);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotaoMultiplicar() {
        JButton BotaoMultiplicar = new JButton("*");
        BotaoMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fazendoOperacao == false) {
                    memoria = Double.parseDouble(display.getText());
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "*";
                    ponto = false;
                } else {
                    display.setText(String.valueOf(memoria * Double.parseDouble(display.getText())));
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "*";
                    ponto = false;
                }
            }
        });

        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(BotaoMultiplicar);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotaoSubtrair() {
        JButton BotaoSubtrair = new JButton("-");
        BotaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fazendoOperacao == false) {
                    memoria = Double.parseDouble(display.getText());
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "-";
                    ponto = false;
                } else {
                    display.setText(String.valueOf(memoria - Double.parseDouble(display.getText())));
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "-";
                    ponto = false;
                }
            }
        });

        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(BotaoSubtrair);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed

    private void preparaBotaoSomar() {
        JButton BotaoSomar = new JButton("+");
        BotaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fazendoOperacao == false) {
                    memoria = Double.parseDouble(display.getText());
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "+";
                    ponto = false;
                } else {
                    display.setText(String.valueOf(memoria + Double.parseDouble(display.getText())));
                    apagarParaOProximoNumero = true;
                    fazendoOperacao = true;
                    operacao = "+";
                    ponto = false;
                }
            }
        });

        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(BotaoSomar);//adiciona botão ao painel
    } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed


    /*private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        painelPrincipal.add(botaoSair);//adiciona botão Sair ao painel
    }*/
}
