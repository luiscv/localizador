
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import localizador.localizador;

/**
 *
 * @author Luis
 */
public class grafico implements ActionListener {
    
    private JButton botao;
    private JFrame J;
    private JPanel conteudo;
    private JTextField text1;
    private JLabel l1, l2, l3, l4, ll1, ll2, ll3;
    localizador local;    
    
    public grafico() {
        local = new localizador();
        this.J = new JFrame();
        J.setLocation(200, 200);
        J.setTitle("Localizador de url's");
        J.setSize(460, 300);
        
        this.conteudo = (JPanel) J.getContentPane();
        conteudo.setLayout(null);
        
        this.text1 = new JTextField(20);
        this.ll1 = new JLabel("ip");
        this.ll2 = new JLabel("endereço");
        this.ll3 = new JLabel("dominio");
        this.l1 = new JLabel("Digite o ip ex: (127.0.0.1) ou a url ex (www.uol.com.br)");
        this.l2 = new JLabel("-");
        this.l3 = new JLabel("-");
        this.l4 = new JLabel("-");
        this.botao = new JButton("Acessar");
        
        text1.setBounds(20, 50, 380, 20);
        
        ll1.setBounds(20, 100, 80, 20);
        ll2.setBounds(20, 150, 80, 20);
        ll3.setBounds(20, 200, 80, 20);
        
        l1.setBounds(20, 20, 380, 20);
        l2.setBounds(120, 100, 380, 20);
        l3.setBounds(120, 150, 380, 20);
        l4.setBounds(120, 200, 380, 20);
        botao.setBounds(300, 80, 100, 20);
        
        conteudo.add(ll1);
        conteudo.add(ll2);
        conteudo.add(ll3);
        conteudo.add(l1);
        conteudo.add(l2);
        conteudo.add(l3);
        conteudo.add(l4);
        conteudo.add(text1);
        conteudo.add(botao);
        
     botao.addActionListener(this);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setResizable(false);
        J.setVisible(true);
    }
   
    @Override
     public void actionPerformed(ActionEvent e){
     String cmd = e.getActionCommand();
        if (cmd.equals("Acessar")){
            l2.setText(local.host(text1.getText())); 
        l3.setText(local.ip(text1.getText())); 
        l4.setText(local.canonical(text1.getText()));
        }
     
     }
}
