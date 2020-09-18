package aula198_HerancaMultipla.application;

import aula198_HerancaMultipla.devices.ComboDevice;
import aula198_HerancaMultipla.devices.ConcretePrinter;
import aula198_HerancaMultipla.devices.ConcreteScanner;

public class Program {
	//Neste exemplo o objetivo � criar heran�a multipla fazendo com que ComboDevice consiga herdar de Printer e Scanner (que eram classes concretas)
	public static void main(String[] args) { 

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081"); //Este implementa o Printer e o Scanner
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
