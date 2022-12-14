package br.com.curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import br.com.gethelp.factory.ConnectionFactory;
import br.com.gethelp.model.Curso;

public class CursoDAO {
	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */
	public void save(Curso curso) {
		String sql = ("INSERT INTO cursos (nome, disciplina, nivelDeEnsino, dataCadastro ) VALUES (?,?,?,?)");
		
		Connection conn = null;
		PreparedStatement st = null;
		try{
			//Criar conexão com banco de dados
			conn = ConnectionFactory.createConnectionToPostgresql();
			//criamos uma PreparedStatement para executar uma query
			st = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionar valores que são esperados pela query
            st.setString(1, curso.getNome());
            st.setString(2, curso.getDisciplina());
            st.setString(3, curso.getNivelDeEnsino() );
            st.setDate(4, (java.sql.Date) new Date(curso.getDataCadastro().getTime()));
            
            //executar a query
            st.execute();
 
        }catch(Exception e){
        	e.printStackTrace();
        }finally {
        	//fechar as conexões
        	try {
        		if(st!=null) {
        			st.close();
        		}
        		
        		if(conn!=null) {
        			conn.close();
        		}
        	}catch (Exception e) {
        		e.printStackTrace();
			}
        }
	}
}
