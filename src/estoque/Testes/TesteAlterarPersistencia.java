package estoque.Testes;

import estoque.Models.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TesteAlterarPersistencia {

    public static void main(String[] args) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("EstoquePU");
        EntityManager em = enf.createEntityManager();

        Produto p = em.find(Produto.class, (long) 1);
        p.setNome("xxxxxx");
        p.setEstoque(new Float(20.0));
        p.setEstoqueInicial(new Float(20.0));
        p.setQtdMinima(new Float(2.0));
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        enf.close();
    }

}
