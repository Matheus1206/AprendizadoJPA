package br.com.bamt.jpa.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.swing.JTextField;

import br.com.bamt.jpa.modelo.EntityManagerFactory;
import br.com.bamt.jpa.modelo.Produto;

public class ProdutoController implements ActionListener{
	
	private JTextField txtNomeProduto;
	private EntityManager em = EntityManagerFactory.getEntityManager();
	private Produto produto;
	
	public ProdutoController(JTextField txtNomeProduto) {
		this.txtNomeProduto = txtNomeProduto;
	}

	public void actionPerformed(ActionEvent ae) {
		String action = ae.getActionCommand();
		if(action.equalsIgnoreCase("cadastrar")) {
			cadastraProduto();
		}
		
	}
	
	public void cadastraProduto() {
		produto = new Produto();
		produto.setNomeProduto(txtNomeProduto.getText());
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();	
	}

}
