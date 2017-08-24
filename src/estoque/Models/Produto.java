package estoque.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "nome", nullable = false, length = 30)
    private String nome;
    @Column(name = "estoque", nullable = false)
    private Float estoque;
    @Column(name = "estoque_inicial", nullable = false)
    private Float estoqueInicial;
    @Column(name = "qtd_minima", nullable = false)
    private Float qtdMinima;
    private Fornecedor fornecedor;
    private Categoria categoria;

    public Produto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getEstoque() {
        return estoque;
    }

    public void setEstoque(Float estoque) {
        this.estoque = estoque;
    }

    public Float getEstoqueInicial() {
        return estoqueInicial;
    }

    public void setEstoqueInicial(Float estoqueInicial) {
        this.estoqueInicial = estoqueInicial;
    }

    public Float getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(Float qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
