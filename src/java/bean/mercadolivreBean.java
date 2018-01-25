/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.mercadoLivreModel;

/**
 *
 * @author Servidor
 */
@ManagedBean(name = "MBMercadolivre")
@RequestScoped
public class mercadolivreBean {

    public mercadolivreBean() {
    }

    private static List lista = new ArrayList();

    public List<mercadoLivreModel> getLista() {
        return lista;
    }

    public void setLista(List<mercadoLivreModel> lista) {
        this.lista = lista;
    }

    //@PostConstruct
    public void listar() {
        mercadoLivreModel ml = new mercadoLivreModel();
        ml.setNome("Maria das graças");
        ml.setEstado("Bahia");
        ml.setNumeroTelefone("(85)98789765");
        ml.setSaldoMercadoPago("RS128,21");
        ml.setNivelLogin("4 Professional");
        ml.setSegurancaLogin("Nenhuma");
        ml.setTestadoProxyEstado("Bahia");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Antonio rafael");
        ml.setEstado("Goias");
        ml.setNumeroTelefone("(62)98568568");
        ml.setSaldoMercadoPago("R$0,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("3 Avancado");
        ml.setTestadoProxyEstado("Goias");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Rafael");
        ml.setEstado("Rio de Janeiro");
        ml.setNumeroTelefone("(11)956874582");
        ml.setSaldoMercadoPago("R$25,00");
        ml.setSegurancaLogin("SMS");
        ml.setNivelLogin("3 Avancado");
        ml.setTestadoProxyEstado("Rio de Janeiro");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Analice Carolina");
        ml.setEstado("São Paulo");
        ml.setNumeroTelefone("(15)965478231");
        ml.setSaldoMercadoPago("R$34,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("4 Profissional");
        ml.setTestadoProxyEstado("São Paulo");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Rafaela Mendonça");
        ml.setEstado("Rio de Janeiro");
        ml.setNumeroTelefone("(19)965874444");
        ml.setSaldoMercadoPago("R$10,17");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("4 Professional");
        ml.setTestadoProxyEstado("Rio de Janeiro");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Analia Rodrigues");
        ml.setEstado("Para");
        ml.setNumeroTelefone("(85)987568855");
        ml.setSaldoMercadoPago("R$14,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("3 Avancado");
        ml.setTestadoProxyEstado("Para");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Edimilson Carvalho");
        ml.setEstado("Sergipe");
        ml.setNumeroTelefone("(79)999658234");
        ml.setSaldoMercadoPago("R$0,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("4 Professional");
        ml.setTestadoProxyEstado("Sergipe");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Maria Cardoso");
        ml.setEstado("Bahia");
        ml.setNumeroTelefone("7796542133");
        ml.setSaldoMercadoPago("R$0,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("3 Avancado");
        ml.setTestadoProxyEstado("Bahia");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Analia Rodrigues");
        ml.setEstado("Minas Gerais");
        ml.setNumeroTelefone("(31)999886475");
        ml.setSaldoMercadoPago("R$0,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("4 Professional");
        ml.setTestadoProxyEstado("Minas Gerais");
        lista.add(ml);

        ml = new mercadoLivreModel();
        ml.setNome("Alex Monteiro");
        ml.setEstado("Rio de Janeiro");
        ml.setNumeroTelefone("(21)996335712");
        ml.setSaldoMercadoPago("R$0,00");
        ml.setSegurancaLogin("Nenhuma");
        ml.setNivelLogin("1 iniciante");
        ml.setTestadoProxyEstado("Rio de Janeiro");
        lista.add(ml);

    }

}
