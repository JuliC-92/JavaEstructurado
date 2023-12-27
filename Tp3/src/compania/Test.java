package compania;

public class Test {

	public static void main(String[] args) {
		
		Area area1 = new Area ("A1");
		
		Area area2 = new Area ("A2");
		
		Compañia c1= new Compañia("Arturito");
		
		area1.crearOficina("Facturacion");
		
		area1.crearOficina("Marketing");
		
		area1.agregarEmpleado("Pepe", "32145216", "Yatay 245", "Marketing");
		
		area1.agregarEmpleado("Jorge", "35165216", "Yatay 165", "Marketing");
		
		area1.agregarEmpleado("Luis", "32145546", "Yatay 145", "Facturacion");
		
		area1.agregarEmpleado("Luis", "32145546", "Yatay 145", "Facturacion");
		
		
		System.out.println(c1);
		
		System.out.println("-------");
		
		c1.importarArea(area1);
		
		System.out.println(c1);
		
	}

}
