package main;

import entities.ObjectA;
import entities.ObjectB;
import entities.ObjectC;

public class main {

	public static void main(String[] args) {
		ObjectA objetoA= new ObjectA(1,"Pepito","Grillo");
		ObjectB objetoB= new ObjectB(1,"Alfredo",25);
		ObjectC objetoC= new ObjectC(1,"Ana","Valencia");
		
		System.out.println(objetoA.toString());
		System.out.println(objetoB.toString());
		System.out.println(objetoC.toString());
	}
}
