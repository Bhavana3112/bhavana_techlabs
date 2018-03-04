package com.techlabs.set;

public class Set implements Comparable<Set> {
	private int id;
	private String name;

	public Set(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public int compareTo(Set b) {  
	    if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  

}
