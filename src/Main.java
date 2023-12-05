// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        POO MOTOS
        El objetivo de este ejercicio es practicar la creación de clases y métodos en Java mediante la implementación de una clase Moto que modele el comportamiento de una motocicleta.

        Crea una clase Moto que contenga las siguientes características la marca de la moto, modelo de la moto, color de la moto, velocidad actual de la moto (inicializada en 0)

        Implementa un constructor por defecto, otro con todos los atributos y uno copia que permita inicializar los atributos de la clase Moto.

        Implementa los siguientes métodos en la clase Moto:
        •	acelerar(int incremento): Aumenta la velocidad de la moto según el valor de incremento. Imprime un mensaje indicando la nueva velocidad.
        •	frenar(int decremento): Reduce la velocidad de la moto según el valor de decremento. Imprime un mensaje indicando la nueva velocidad.
        •	obtenerInformacion(): Devuelve una cadena de texto con la información de la moto (marca, modelo, color, velocidad actual).

        Crea una clase Main:
        •	En el método main, crea una instancia de la clase Moto.
        •	Realiza algunas llamadas a los métodos acelerar, frenar y obtenerInformacion para demostrar el funcionamiento de la clase.

         */

        Motorcycle BmwBike = new Motorcycle("BMW", "Motorrad", "Black");
        BmwBike.accelerate(120);
        BmwBike.accelerate(20);
        BmwBike.brake(60);
        BmwBike.getInformation();
    }
}