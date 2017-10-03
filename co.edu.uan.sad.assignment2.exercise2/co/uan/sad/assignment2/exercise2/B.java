package co.uan.sad.assignment2.exercise2;

public class B extends A {
		int bField;

		@Override
		public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (!super.equals(obj)){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		B other = (B) obj;
		if (bField != other.bField){
			return false;
		}
		return true;
	}
}

/*	Usted podría tener otra clase C:

	La clase pública C extiende B {
	
	int cField;
	...
	}
	
	Por lo tanto, en el siguiente código, la aserción se cumple 
	(que probablemente no sea lo que se desea) para la primera implementación de B, 
	pero no para la segunda:
	
	B $ _ {b} $ = nuevo B ();
	C $ _ {c} $ = nuevo C ();
	afirmar b.equals (c);

	Si se comprueba 'A.class' y 'B.class', respectivamente, entonces cualquiera para
	\ cualquier objeto 'b' de tipo 'B', incluso 'b.equals (b)' sería falso, iguales 'de la clase' A '*/