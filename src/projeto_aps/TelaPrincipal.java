package projeto_aps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurando o layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("O que deseja fazer?");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Botões
        JButton btnCadastrarImagens = new JButton("Cadastrar Imagens");
        JButton btnVisualizarImagens = new JButton("Visualizar Imagens Cadastradas");
        JButton btnOrdenarImagens = new JButton("Ordenar Imagens");
        JButton btnVisualizarRelatorios = new JButton("Visualizar Relatórios");

        // Ações dos botões (por enquanto apenas exibe uma mensagem)
        btnCadastrarImagens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new CadastroImagem();
                dispose();
            }
        });

        btnVisualizarImagens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Visualizar Imagens clicado");
            }
        });

        btnOrdenarImagens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ordenar Imagens clicado");
            }
        });

        btnVisualizarRelatorios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Visualizar Relatórios clicado");
            }
        });

        // Adiciona os componentes ao painel
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Espaço entre os componentes
        panel.add(btnCadastrarImagens);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(btnVisualizarImagens);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(btnOrdenarImagens);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(btnVisualizarRelatorios);

        // Alinhamento dos botões
        btnCadastrarImagens.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnVisualizarImagens.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnOrdenarImagens.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnVisualizarRelatorios.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(panel);
        setVisible(true);
    }

    
}
