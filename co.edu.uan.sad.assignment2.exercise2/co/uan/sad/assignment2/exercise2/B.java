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

/*	Usted podr�a tener otra clase C:

	La clase p�blica C extiende B {
	
	int cField;
	...
	}
	
	Por lo tanto, en el siguiente c�digo, la aserci�n se cumple 
	(que probablemente no sea lo que se desea) para la primera implementaci�n de B, 
	pero no para la segunda:
	
	B $ _ {b} $ = nuevo B ();
	C $ _ {c} $ = nuevo C ();
	afirmar b.equals (c);

	Si se comprueba 'A.class' y 'B.class', respectivamente, entonces cualquiera para
	\ cualquier objeto 'b' de tipo 'B', incluso 'b.equals (b)' ser�a falso, iguales 'de la clase' A '*/