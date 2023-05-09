package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {

    public static void main(String[] args) {
        cadastrarProduto();

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto p = produtoDao.buscarPorId(1l);

        System.out.println(p.getNome());

        //List<Produto> todos = produtoDao.buscarTodos();
        //todos.forEach(item -> System.out.println(item.getDescricao()));

        //List<Produto> todosPorNome = produtoDao.buscarPorNome("Xiaomi");
        //todosPorNome.forEach(tpn -> System.out.println(tpn.getNome()));

        //List<Produto> buscaCategoria = produtoDao.buscarPorNomeDaCategoria("CELULARES");
        //buscaCategoria.forEach(bc -> System.out.println(bc.getNome()));

        BigDecimal buscarPreco = produtoDao.buscarPrecoDoProduto("Xiaomi");
        System.out.println("Preço do produto: " +buscarPreco);
    }

    private static void cadastrarProduto() {
        Categoria celulares = new Categoria("CELULARES");

        Produto celular = new Produto("Xiaomi", "Redmi 9",new BigDecimal("800"), celulares);
        Produto smartphone = new Produto("Motorola", "Moto G",new BigDecimal("900"), celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular); //adicionando o Produto na tabela
        produtoDao.cadastrar(smartphone);
        em.getTransaction().commit();
        em.close();
    }

}
