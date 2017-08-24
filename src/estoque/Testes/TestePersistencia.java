/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.Testes;

import estoque.Models.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Not
 */
public class TestePersistencia {

    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("EstoquePU");
        EntityManager em = enf.createEntityManager();

        Produto p = new Produto();
        p.setNome("asdas");
        p.setEstoque(new Float(12.0));
        p.setEstoqueInicial(new Float(12.0));
        p.setQtdMinima(new Float(12.0));
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }

}
