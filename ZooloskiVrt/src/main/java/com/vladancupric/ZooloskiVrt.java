package com.vladancupric;

import java.util.List;

public class ZooloskiVrt {
	private List<Animal> list;

	public List<Animal> getList() {
		return list;
	}

	public void setList(List<Animal> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Zivotinje koje se nalaze u nasem Zoo Vrtu: "+"\n");
		for(Animal animal : list) {
			sb.append(animal+ "\n"); 
		}
		return sb.toString();
		
	}
	

}
