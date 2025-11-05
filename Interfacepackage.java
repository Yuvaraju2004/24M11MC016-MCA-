package myinterface;

interface FirstInterface

{

final int b=10;

public void message();

}

interface SecondInterface

{

public void Display();

}

public class Interfacepackage implements FirstInterface, SecondInterface

{

public void message()

{

System.out.println("Welcome to first interface");

}

public void Display()

{

System.out.println("Welcome to second interface...");

}

}