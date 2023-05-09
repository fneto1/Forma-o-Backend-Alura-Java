package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ClienteDao;
import br.com.alura.loja.dao.PedidoDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.*;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDePedido {
    public static void main(String[] args) {
        popularBancoDeDados();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        Produto produto = produtoDao.buscarPorId(1l);

        ClienteDao clienteDao = new ClienteDao(em);
        Cliente cliente = clienteDao.buscarPorId(1l);

        em.getTransaction().begin();

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10, produto, pedido));

        PedidoDao pedidoDao = new PedidoDao(em);
        pedidoDao.cadastrar(pedido);
        em.getTransaction().commit();

        BigDecimal totalVendido = pedidoDao.valorTotalVendido();

        System.out.println("Valor total: "+totalVendido);

        List<Object[]> relatorio = pedidoDao.relatorioDeVendas();
        for (Object[] obj: relatorio) {
            System.out.println(obj[0]);
            System.out.println(obj[1]);
            System.out.println(obj[2]);
        }

    }

    private static void popularBancoDeDados() {
        Categoria celulares = new Categoria("CELULARES");

        Produto celular = new Produto("Xiaomi", "Redmi 9",new BigDecimal("800"), celulares);
        Produto smartphone = new Produto("Motorola", "Moto G",new BigDecimal("900"), celulares);

        Cliente cliente = new Cliente("Cobra", "12345678");

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ClienteDao clienteDao = new ClienteDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular); //adicionando o Produto na tabela
        produtoDao.cadastrar(smartphone);
        clienteDao.cadastrar(cliente);
        em.getTransaction().commit();
        em.close();
    }
}
