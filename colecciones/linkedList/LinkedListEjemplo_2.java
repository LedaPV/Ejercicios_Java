package linkedList;

import java.util.LinkedList;

public class LinkedListEjemplo_2 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("elemento1");
		linkedList.add("elemento2");
		linkedList.add("elemento3");

		System.out.println("LinkedList: " + linkedList);

		// Agrega un elemento al inicio de la lista
		linkedList.addFirst("inicio");
		System.out.println("LinkedList después de agregar al inicio: " + linkedList);

		// Agrega un elemento al final de la lista
		linkedList.addLast("fin");
		System.out.println("LinkedList después de agregar al final: " + linkedList);

		// Accede al primer y último elemento de la lista
		String firstElement = linkedList.getFirst();
		String lastElement = linkedList.getLast();
		System.out.println("Primer elemento: " + firstElement);
		System.out.println("Último elemento: " + lastElement);

		// buscar un valor dentro de la lista usamos contains
		if (linkedList.contains("elemento2")) {

			System.out.println("Se encontró el elemento2 en la lista. ");

		} else {
			System.out.println("No se encontró el elemento2 en la lista.");
		}
		
		// devuelve la posición de un elemento
		int posicion = linkedList.indexOf("elemento1");
		if (posicion != -1) {
			System.out.println("El elemento1 se encuentra en la posición " + posicion + " de la lista.");
		} else {
			System.out.println("El elemento1 no se encuentra en la lista.");
		}
		
		// devuelve un valor según la posición get que localicemos.

		String elemento = linkedList.get(0);
		System.out.println("el valor es " + elemento);

		// Remueve el primer y último elemento de la lista
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("LinkedList después de remover el primer y último elemento: " + linkedList);

		// Remueve el elemento en la posición 1
		linkedList.remove(1);
		System.out.println("LinkedList después de remover el elemento en la posición 1: " + linkedList);

	}
}
