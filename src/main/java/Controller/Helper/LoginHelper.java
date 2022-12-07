/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author PAULO
 */
public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTextUserField().getText();
        String senha = view.getTextPasswordField().getText();
        Usuario modelo = new Usuario(0, nome, senha);
        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUserField().setText(nome);
        view.getTextPasswordField().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUserField().setText("");
        view.getTextPasswordField().setText("");
    }
}
