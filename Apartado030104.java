package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a conversiones de tipo.
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030104 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Conversiones de tipo";
      }
   
   /**
    * Conversiones de tipo - Ejercicio1.
    *
    * </br>
    *
    * Comprobar cuales de las conversiones implicitas realizadas son correctas y comentar las incorrectas.
    */
      public void ejercicio01() {

      byte varByte = 50;
      short varShort = 1500;
      int varInt = 1500000;
      long varLong = 65000000L;
      float varFloat = 20.0E4F;
      double varDouble = 0.123456789e9;
      char varChar = 'H';
      boolean varBoolean = true;

      varInt = varShort;       // Correcta: de menor a mayor rango (widening)
      varDouble = varFloat;    // Correcta: de float a double
      varFloat = varLong;      // Correcta: de long a float
      varLong = varInt;        // Correcta: de int a long
      varLong = 9223372036854775807L;
      varFloat = varLong;      // Correcta: conversión implícita (puede perder precisión de dígitos)

    // varByte = varShort;   // Incorrecta: requiere cast explícito (narrowing)
    // varShort = varInt;    // Incorrecta: requiere cast explícito (narrowing)

      
      }
   
   /**
    * Conversiones de tipo - Ejercicio2.
    *
    * </br>
    *
    * Asignar varLong al resto de variables realizando las conversiones explicitas necesarias
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio02() {
         cabecera("02", "");
      
      // Inicio modificacion
        byte varByte;
        short varShort;
        int varInt;
        long varLong = 35000L;

        varInt = (int) varLong;
        varShort = (short) varLong;
        varByte = (byte) varLong;

        System.out.println("Int: " + varInt);
        System.out.println("Short: " + varShort);
        System.out.println("Byte: " + varByte);
      // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio3.
    *
    * </br>
    *
    * Asignar varFloat al resto de variables realizando las conversiones necesarias.
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio03() {
         cabecera("03", "");
      
      // Inicio modificacion
         byte varByte;
    short varShort;
    int varInt;
    long varLong;
    double varDouble;
    float varFloat = 123.1f;

    varByte = (byte) varFloat;
    varShort = (short) varFloat;
    varInt = (int) varFloat;
    varLong = (long) varFloat;
    varDouble = varFloat;      // Conversión implícita (widening)

    System.out.println("Byte: " + varByte);
    System.out.println("Short: " + varShort);
    System.out.println("Int: " + varInt);
    System.out.println("Long: " + varLong);
    System.out.println("Double: " + varDouble);
        // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio4.
    *
    * </br>
    *
    * Arreglar los posibles errores de compilacion y explicar en el fichero LEEME.TXT los resultados    */
       public void ejercicio04() {
         cabecera("04", "");
      
        double dGigante = 1.766e289;
    double dNormal = 35.987654321;
    double dMinimo = 0.2E-256;

    float fGigante = (float) dGigante;
    float fNormal = (float) dNormal;
    float fMinimo = (float) dMinimo;

    System.out.println("Gigante: " + fGigante);
    System.out.println("Normal: " + fNormal);
    System.out.println("Minimo: " + fMinimo);

    byte b = (byte) 130;
    short s = (short) 32770;
    int i = (int) 2147483650L;  // Se corrigió el literal fuera de rango asignando sufijo L al long
    System.out.println("Byte: " + b);
    System.out.println("Short: " + s);
    System.out.println("Int: " + i);

    float f = 1.3e22f;      // Se añadió el sufijo f para definir el literal como float
    System.out.println("f: " + f);
          
      }
   }
