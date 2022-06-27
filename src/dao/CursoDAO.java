package dao;

import beans.Curso;
import connection.Conectionjar;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CursoDAO {
    private Conectionjar conexao;
    private Connection conn;

    //Constructor

    //CursoDAO cursoDao = new CursoDAO();
    public CursoDAO () {
        this.conexao = new Conectionjar();
        this.conn = this.conexao.getConexao();
    }

    public void inserir (Curso curso) {
        String sql = "INSERT INTO cursos(nomeCurso, nivel, duracao) VALUES "
                +  "(?, ?, ?)";
        try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, curso.getNomecurso());
        stmt.setString(2, curso.getNivel());
        stmt.setInt(3,curso.getDuracao());
        stmt.execute();
        }
        catch (Exception e) {
            System.out.println("erro ao inserir Curso: " + e.getMessage());
        }
    }
}
