package controller;

public class BinaryTree {
	public Node raiz; 
	
	public BinaryTree() {
		raiz = null;
	}
	
	public void inserir(Node p, int valor) {
		if (p == null) {
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) {
			if (p.esq != null) {
				inserir(p.esq, valor);
			} else {
				p.esq = new Node(valor, null, null);
			}
		} else if (valor > p.element) {
			if (p.dir != null) {
				inserir(p.dir, valor);
			} else {
				p.dir = new Node(valor, null, null);
			}
		}
	}
	
	public boolean buscar(int search, Node p) {
		if(p == null) {
			return false;
		}else {
			if(p.element == search) {
				return true;
			}else {
				return (p.element > search) ? buscar(search, p.esq) : buscar(search, p.dir) ;
			}
		}
	}
	
	public void inserirNode(Node p, Node novoNo) {
		if (p == null) {
			raiz = novoNo;
		} else if (novoNo.element <= p.element) {
			if (p.esq != null) {
				inserirNode(p.esq, novoNo);
			} else {
				p.esq = novoNo;
			}
		} else if (novoNo.element > p.element) {
			if (p.dir != null) {
				inserirNode(p.dir, novoNo);
			} else {
				p.dir = novoNo;
			}
		}
	}
	
	public void remover(Node no, int element, Node noPai) {
		if(no.element == element) {
			if(no.esq != null || no.dir != null) {
				Node node = no.esq;
				inserirNode(node, no.dir);
				if(node.element > noPai.element) {
					noPai.dir = node;
				}else {
					noPai.esq = node;
				}
			}else {
				if(no.element == noPai.esq.element) {
					noPai.esq = null;
				}else {
					noPai.dir = null;
				}
				
			}
		}else {
			noPai = no;
			if(no.element > element) {
				remover(no.esq, element, noPai);
			}else {
				remover(no.dir, element, noPai);
			}
		}
	}
	
	public String printTree(Node p) {
		String retorno;
		retorno = "(";
		if (p != null) {
			retorno += " " + p.element + " ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno = retorno + ") ";
		return retorno;
	}
	
	
}
