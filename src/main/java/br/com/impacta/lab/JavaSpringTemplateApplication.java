package br.com.impacta.lab;

import br.com.impacta.models.*;
import java.util.ArrayList;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		
    ArrayList<Produto> listaProduto = new ArrayList();

    Produto camisa = new Produto();
    camisa.criarCodigo(1);
    //camisa.codigo = 1;
    camisa.descricao = "Camisa";
    camisa.valor = 70.00;
    listaProduto.add(camisa);

    Produto shorts = new Produto();
    shorts.criarCodigo(2);
    //shorts.codigo = 2;
    shorts.descricao = "Shorts";
    shorts.valor = 57.50;
    listaProduto.add(shorts);

    Produto luvas = new Produto();
    luvas.criarCodigo(3);
    //luvas.codigo = 2;
    luvas.descricao = "Luvas";
    luvas.valor = 60.00;
    listaProduto.add(luvas);

    for (int contador = 0; contador < listaProduto.size(); contador++) {
      
      Produto objetoDaLista = listaProduto.get(contador);
      if (objetoDaLista.retornaCodigo() == 100) {
        System.out.println(objetoDaLista.montarResumo());
      }
    }

    //Produto objetoDaLista = listaProduto.get(0);

    //System.out.println(objetoDaLista.montarResumo());

	}

}