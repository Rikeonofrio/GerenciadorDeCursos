import beans.Curso;
import dao.CursoDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCRUD {
    private JPanel painelEsquerdo;
    private JPanel painelDireito;
    private JPanel Painelinferior;

    private JTextField duraçao;

    private JTextField nomeCurso;
    private JTextField nivelTextField;
    private JTextField idText;
    private JButton salvarButton;
    private JButton apagarButton;
    private JButton button5;

    public FormCRUD() {
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String curso1 = nomeCurso.getText();
                String nivel1 = nivelTextField.getText();
                String duracao1 = duraçao.getText();

                Curso curso = new Curso();
                curso.setNomecurso(curso1);
                curso.setNivel(nivel1);
                curso.setDuracao(Integer.parseInt(duracao1));

                CursoDAO cursoDAO = new CursoDAO();
                cursoDAO.inserir(curso);

                nomeCurso.setText("");
                nivelTextField.setText("");
                duraçao.setText("");
            }
        });
    }

    public JTextField getDuraçao() {
        return duraçao;
    }

    public JTextField getNomeCurso() {
        return nomeCurso;
    }

    public JTextField getNivelTextField() {
        return nivelTextField;
    }


}
