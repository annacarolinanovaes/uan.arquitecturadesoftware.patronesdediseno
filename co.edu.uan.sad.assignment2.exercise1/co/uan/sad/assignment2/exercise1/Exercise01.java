package co.uan.sad.assignment2.exercise1;

/*GRASP es una colección de principios de diseño que se preocupan, sobre todo, de separar correctamente 
 * las responsabilidades de cada clase, al tiempo que intenta reducir el número de dependencias para reducir
 *con ello las probabilidades de fallo.
 *
 * Los conceptos de cohesión y acoplamiento no están íntimamente relacionados, sin embargo se recomienda tener
 *  un mayor grado de cohesión con un menor grado de acoplamiento. De esta forma se tiene menor dependencia y se
 *   especifican los propósitos de cada objeto en el sistema.
 *   
**************************************************************************************************************
*
	********************* Alta cohesión *********************
	
	Nos dice que la información que almacena una clase debe ser coherente y debe estar (en la medida de lo posible) relacionada con la clase.
	
		Cohesión Coincidente: El módulo realiza múltiples tareas, sin ninguna relación entre ellas.
		
		Cohesión Lógica: El módulo realiza múltiples tareas relacionadas, pero, en tiempo de ejecución, 
		sólo una de ellas será llevada a cabo.
		
		Cohesión Temporal: Las tareas llevadas a cabo por un módulo tienen, como única relación "que 
		deben ser ejecutadas al mismo tiempo".
		
		Cohesión de Procedimiento: La única relación que guardan las tareas de un módulo es que corresponden
		 a una secuencia de pasos propia del “producto”.
		 
		Cohesión de Comunicación: Las tareas corresponden a una secuencia de pasos propia del “producto” y 
		todas afectan a los mismos datos.
		
		Cohesión de Información: Las tareas llevadas a cabo por un módulo tienen su propio punto de arranque, 
		su codificación independiente y trabajan sobre los mismos datos. El ejemplo típico: OBJETOS
		Cohesión Funcional: Cuando el módulo ejecuta una y sólo una tarea, teniendo un único objetivo a cumplir, 
		se dice que tiene Cohesividad Funcional.
	
	
	********************* Bajo acoplamiento *********************
	
	Es la idea de tener las clases lo menos ligadas entre sí que se pueda. De tal forma que en caso de producirse una modificación en alguna de ellas, se tenga la mínima repercusión posible en el resto de clases, potenciando la reutilización, y disminuyendo la dependencia entre las clases
	
	Acoplamiento de Contenido: Cuando un módulo referencia directamente el contenido de otro módulo. 
	(En lenguajes de alto nivel es muy raro)
	
	Acoplamiento Común: Cuando dos módulos acceden (y afectan) a un mismo valor global.
	
	Acoplamiento de Control: Cuando un módulo le envía a otro un elemento de control que 
	determina la lógica de ejecución del mismo.
	
*/
