package linkedList;

import java.util.LinkedList;

public class LinkedListEjemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<>();
		
		linkedlist.add("elemento1");
		linkedlist.add("elemento2");
		linkedlist.add("elemento3");
		
		System.out.println("LinkedList: " + linkedlist);
		
		//Agregar un elemento de la lista
		linkedlist.addFirst("inicio");
		System.out.println("LinkedList después de agregar al inicio " + linkedlist);
		
		//Agregar un elemento al final de la lista
		linkedlist.addLast("fin");
		System.out.println("LinkedList después de agregar al final " + linkedlist);
		
		//Accede al primer y último elemento de la lista
		String firstElement = linkedlist.getFirst();
		String lastElement = linkedlist.getLast();
		System.out.println("Primer elemento " + firstElement);
		System.out.println("Último elemento " + lastElement);
		
		//Remueve el primer y último elemento de la lista
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("Linkedlist después de remover el primer y último elemento " + linkedlist);
	}

}
