package co.uan.sad.assignment2.exercise3;

/*
 * 
 *  
		 *  Examine la siguiente lista de APIs de Java e identifique el patrón de diseño presente.
		Para cada patrón encontrado describa porque el API lo sigue. Cada grupo de API
		enumerado corresponde al mismo patrón de diseño.
		
		a. Creacionales (Abstract Factory, Builder, Singleton, Static Factory Method)
		i. 
			(Singleton) 
			Crear una instancia única de una clase.  
			Se me ocurre que necesito obtener una lista de registros de una base de datos.
			
			● java.lang.Runtime
			● java.lang.Desktop
			
		ii. Builder
			● com.google.common.collect.MapMaker
			
		iii. Static factory method
			● java.util.Calendar
			● java.text.NumberFormat
			● java.nio.charset.Charset
			
		iv. Abstract factory
			● javax.xml.parsers.DocumentBuilderFactory
			● javax.xml.transform.TransformerFactory
			● javax.xml.xpath.XPathFactory
		
		
		
		b. Structural (Adapter, Decorator, Flyweight)
		i. Flyweight
			● java.lang.Integer
			● java.lang.Boolean
			
		ii. Adapter
			● java.io.InputStreamReader
			● java.io.OutputStreamWriter
			● java.util.Arrays
			
		iii. Decorator
			● java.io.BufferedInputStream
			● java.io.DataInputStream
			● java.io.BufferedOutputStream
			● java.util.zip.ZipOutputStream
			● java.util.Collections#checkedList()
		
		
		
		c. Behavioural (Chain of responsability, Command, Iterator, Observer, Strategy,
		Template Method)
		i. Chain of responsibility
			● javax.servlet.FilterChain
			
		ii. Command
			● java.lang.Runnable
			● java.util.concurrent.Callable
			
		iii. Iterator
			● java.util.Iterator
			
		iv. Strategy
			● java.util.Comparator
			● javax.servlet.Filter
			
		v. Template method
			● java.util.AbstractList, java.util.AbstractSet,
		java.util.AbstractMap
			● java.io.InputStream, java.io.OutputStream, java.io.Reader,
		java.io.Writer
		
		vi. Observer
			● java.util.EventListener
			● java.util.Observer/java.util.Observable

*/
