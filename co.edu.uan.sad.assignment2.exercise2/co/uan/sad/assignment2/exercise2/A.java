package co.uan.sad.assignment2.exercise2;

public class A {
	int aField;
	
	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		}
		if (o == null){
			return false;
		}
		if (getClass() != o.getClass()){
			return false;
		}
		A other = (A) o;
		if (aField != other.aField){
			return false;
		}
	return true;
	}
}