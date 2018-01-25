/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Servidor
 */
public class mercadoLivreModel {
     private String nome;
    private String estado;
    private String nivelLogin;
    private String numeroTelefone;
    private String saldoMercadoPago;
    private String segurancaLogin;
    private String testadoProxyEstado;

    public String getNivelLogin() {
        return nivelLogin;
    }

    public void setNivelLogin(String nivelLogin) {
        this.nivelLogin = nivelLogin;
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getSaldoMercadoPago() {
        return saldoMercadoPago;
    }

    public void setSaldoMercadoPago(String saldoMercadoPago) {
        this.saldoMercadoPago = saldoMercadoPago;
    }

    public String getSegurancaLogin() {
        return segurancaLogin;
    }

    public void setSegurancaLogin(String segurancaLogin) {
        this.segurancaLogin = segurancaLogin;
    }

    public String getTestadoProxyEstado() {
        return testadoProxyEstado;
    }

    public void setTestadoProxyEstado(String testadoProxyEstado) {
        this.testadoProxyEstado = testadoProxyEstado;
    }

    public mercadoLivreModel(String nome, String estado, String nivelLogin, String numeroTelefone, String saldoMercadoPago, String segurancaLogin, String testadoProxyEstado) {
        this.nome = nome;
        this.estado = estado;
        this.nivelLogin = nivelLogin;
        this.numeroTelefone = numeroTelefone;
        this.saldoMercadoPago = saldoMercadoPago;
        this.segurancaLogin = segurancaLogin;
        this.testadoProxyEstado = testadoProxyEstado;
    }

    

    public mercadoLivreModel() {
    }
    
    
}
