package co.uan.sad.assignment2.exercise1;

/*GRASP es una colecci�n de principios de dise�o que se preocupan, sobre todo, de separar correctamente 
 * las responsabilidades de cada clase, al tiempo que intenta reducir el n�mero de dependencias para reducir
 *con ello las probabilidades de fallo.
 *
 * Los conceptos de cohesi�n y acoplamiento no est�n �ntimamente relacionados, sin embargo se recomienda tener
 *  un mayor grado de cohesi�n con un menor grado de acoplamiento. De esta forma se tiene menor dependencia y se
 *   especifican los prop�sitos de cada objeto en el sistema.
 *   
**************************************************************************************************************
*
	********************* Alta cohesi�n *********************
	
	Nos dice que la informaci�n que almacena una clase debe ser coherente y debe estar (en la medida de lo posible) relacionada con la clase.
	
		Cohesi�n Coincidente: El m�dulo realiza m�ltiples tareas, sin ninguna relaci�n entre ellas.
		
		Cohesi�n L�gica: El m�dulo realiza m�ltiples tareas relacionadas, pero, en tiempo de ejecuci�n, 
		s�lo una de ellas ser� llevada a cabo.
		
		Cohesi�n Temporal: Las tareas llevadas a cabo por un m�dulo tienen, como �nica relaci�n "que 
		deben ser ejecutadas al mismo tiempo".
		
		Cohesi�n de Procedimiento: La �nica relaci�n que guardan las tareas de un m�dulo es que corresponden
		 a una secuencia de pasos propia del �producto�.
		 
		Cohesi�n de Comunicaci�n: Las tareas corresponden a una secuencia de pasos propia del �producto� y 
		todas afectan a los mismos datos.
		
		Cohesi�n de Informaci�n: Las tareas llevadas a cabo por un m�dulo tienen su propio punto de arranque, 
		su codificaci�n independiente y trabajan sobre los mismos datos. El ejemplo t�pico: OBJETOS
		Cohesi�n Funcional: Cuando el m�dulo ejecuta una y s�lo una tarea, teniendo un �nico objetivo a cumplir, 
		se dice que tiene Cohesividad Funcional.
	
	
	********************* Bajo acoplamiento *********************
	
	Es la idea de tener las clases lo menos ligadas entre s� que se pueda. De tal forma que en caso de producirse una modificaci�n en alguna de ellas, se tenga la m�nima repercusi�n posible en el resto de clases, potenciando la reutilizaci�n, y disminuyendo la dependencia entre las clases
	
	Acoplamiento de Contenido: Cuando un m�dulo referencia directamente el contenido de otro m�dulo. 
	(En lenguajes de alto nivel es muy raro)
	
	Acoplamiento Com�n: Cuando dos m�dulos acceden (y afectan) a un mismo valor global.
	
	Acoplamiento de Control: Cuando un m�dulo le env�a a otro un elemento de control que 
	determina la l�gica de ejecuci�n del mismo.
	
*/
