package aplication;

import java.util.Date;

import collection.StatusPedido;
import entities.Pedido;

public class Start_Pedido {

	public static void main(String[] args) {
		
		// Instanciar um pedido(objeto)
		
		Pedido pedido1 = new Pedido(123, new Date(), StatusPedido.PENDENTE_DE_PAGAMENTO);
		
		System.out.println(pedido1);
		
		// Converter um objeto String em enum
		// Instancia de pedido2, receber um startus de entregue
		
		StatusPedido pedido2 = StatusPedido.ENTREGUE;
		
		StatusPedido pedido3 = StatusPedido.valueOf("EM_PROCESSAMENTO");
		
		System.out.println(pedido2);
		System.out.println(pedido3);
		
	}

}
