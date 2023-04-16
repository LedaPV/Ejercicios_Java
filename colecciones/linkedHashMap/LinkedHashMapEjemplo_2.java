package linkedHashMap;

import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

import java.util.stream.Collectors;

public class LinkedHashMapEjemplo_2 {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("Java", 2);
		linkedHashMap.put("Python", 1);
		linkedHashMap.put("JavaScript", 3);

		System.out.println("LinkedHashMap sin ordenar: " + linkedHashMap);

		List<Map.Entry<String, Integer>> list = linkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());
		
		LinkedHashMap<String, Integer> linkedHashMapOrdenado = new LinkedHashMap<>();
		
		for (Map.Entry<String, Integer> entry : list) {
			linkedHashMapOrdenado.put(entry.getKey(), entry.getValue());
		}

		System.out.println("LinkedHashMap ordenado por valor: " + linkedHashMapOrdenado);
	}
}
