package queue;

import java.util.PriorityQueue;

public class MetodoPoll {
	public static void main(String [] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Rojo");
		priorityQueue.add("Amarillo");
		priorityQueue.add("Azul");
		
		System.out.println("Priority Queue: " + priorityQueue);
		
		//En la clase priorityQueue de java, poll() es un método que se utiliza 
		//para obtener y eliminar el primer elemento de la cola (es decir, el elemento con
		//la prioridad más alta
		String primerElemento = priorityQueue.poll();
		System.out.println("Priority Queue poll: " + primerElemento);
		
	}
}
