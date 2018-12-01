package view;

import controller.BinaryTree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree b = new BinaryTree();
		b.inserir(b.raiz, 50);
		b.inserir(b.raiz, 40);
		b.inserir(b.raiz, 60);
		b.inserir(b.raiz, 35);
		b.inserir(b.raiz, 45);
		b.inserir(b.raiz, 55);
		b.inserir(b.raiz, 65);
		b.inserir(b.raiz, 46);
		System.out.println(b.buscar(60, b.raiz));
		System.out.println(b.printTree(b.raiz));
		b.remover(b.raiz, 40, b.raiz);
		System.out.println(b.printTree(b.raiz));
		b.remover(b.raiz, 45, b.raiz);
		System.out.println(b.printTree(b.raiz));

	}

}
