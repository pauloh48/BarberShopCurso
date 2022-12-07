/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author PAULO
 */
public class Cliente extends Pessoa{
    
    private String enderco;
    private String cep;

    public Cliente(String enderco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.enderco = enderco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String enderco, String cep) {
        super(id, nome);
        this.enderco = enderco;
        this.cep = cep;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }    
}
