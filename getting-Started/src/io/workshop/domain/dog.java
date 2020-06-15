package io.workshop.domain;

public class dog {

private int weight;

public int getweight() {
	return weight;
}
public void setweight(int newWeight) {
	if(newWeight>0) {
		weight=newWeight;
	}
}
}
