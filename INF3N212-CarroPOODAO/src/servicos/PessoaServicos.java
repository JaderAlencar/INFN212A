/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import Model.Pessoa;
import dao.DAOFactory;
import dao.PessoaDAO;
import java.util.ArrayList;

/**
 *
 * @author 182120009
 */
public class PessoaServicos {
    
    public void cadastroPessoa(Pessoa pVO) {
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.cadastrarPessoaDAO(pVO);
        
    }
    
    public ArrayList<Pessoa> getPessoaDAO() {
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.getPessoas();
        
    }
    
    public Pessoa getPessoaByDoc(String cpf) {
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.getPessoaByDoc(cpf);
    }

    public void atualizarPessoa(Pessoa pVO) {
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.atualizarPessoaDAO(pVO);
        
    }

    public void deletarPessoa(String cpf) {
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.deletarPessoaDAO(cpf);
    }

    public Object getPessoas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
