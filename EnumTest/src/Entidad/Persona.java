package Entidad;

import Enumeradores.SexoEnum;

import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private SexoEnum sexo;

    public Persona() {
    }

    public Persona(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }
    public void crearPersona(){
        String rta;
        boolean correcto = false;
        do {
            System.out.println("Ingrese un sexo");
            rta = leer.next();
            for(SexoEnum aux : SexoEnum.values()){
                if (aux.toString().equals(rta)){
                    System.out.println("El sexo ingresado es correcto");
                    this.sexo = aux;
                    correcto = true;
                    break;
                }else {
                    System.out.println("El sexo ingresado es incorrecto");
                }
            }
        }while (!correcto);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "sexo=" + sexo +
                '}';
    }
}
