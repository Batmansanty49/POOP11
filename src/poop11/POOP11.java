/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;
/**
 * Librerias usadas
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/**
 * Clase principal, donde se ejecuta la P11 y la act extra
 * @author Jacinto Robledo Valeria Berenice
 */
public class POOP11 {

    /**
     * Main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*System.out.println("******** File ********");
        File archivo=new File("archivo.txt");
        System.out.println("Archivo existe: "+archivo.exists());
        if(!archivo.exists()){  //si el archivo no existe
            try {
            boolean seCreo = archivo.createNewFile();
                System.out.println("Se creo un archivo: "+seCreo);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
         System.out.println("******** FileWriter ********");
         try {
            System.out.println("Lectura desde teclado");
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba el texto para el acrchivo");
            String texto= br.readLine();
            System.out.println("El usuario escribio: "+texto);
            
            System.out.println("Escritura del archivo");
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos =new PrintWriter(bw);
            impresoraDeArchivos.print(texto); //con printl es para que imprima con el salto de linea
            
            impresoraDeArchivos.close();
            
             System.out.println("Lectura del archivo");
             FileReader fr = new FileReader("archivo.txt");
             br =new BufferedReader(fr);
             System.out.println("El texto del archivo es: ");
             String linea = br.readLine();
             while (linea!=null) {
                 System.out.println(linea);
                 linea=br.readLine();
             }
             br.close();
             
             System.out.println("StringTokenizer");
             String alumno = "Hector,Jimenez,Maya,320046862,20,8.3";
             System.out.println("Cadena a tokenizar: "+alumno);
             StringTokenizer tokenizador = new StringTokenizer(alumno, ",");
             while (tokenizador.hasMoreTokens()) {
                 System.out.println(tokenizador.nextToken());
             }
             
             
             
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
         */
        /*System.out.println("Actividad extra");
         try {
            
            System.out.println("Escritura del archivo");
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos =new PrintWriter(bw);
            impresoraDeArchivos.println("Rogrigo,Sanchez,Perez,20,123456,9.9,Copilco,Coyoacan");
            impresoraDeArchivos.println("Sandra,Sanchez,Perez,18,123456,9.8,Copilco,Coyoacan");
            impresoraDeArchivos.println("Itzel,Sanchez,Perez,19,123456,9.7,Copilco,Coyoacan");
            impresoraDeArchivos.println("Rogrigo,Sanchez,Perez,21,123456,9.6,Copilco,Coyoacan");
            impresoraDeArchivos.println("Eduardo,Sanchez,Perez,23,123456,9.5,Copilco,Coyoacan");
            impresoraDeArchivos.println("Marco,Sanchez,Perez,22,123456,9.4,Copilco,Coyoacan");
            
            
            impresoraDeArchivos.close();
            
             System.out.println("Lectura del archivo");
             FileReader fr = new FileReader("alumnos.csv");
             BufferedReader br =new BufferedReader(fr);
             System.out.println("El texto del archivo es: ");
             String linea = br.readLine();
             while (linea!=null) {
                 System.out.println(linea);
                 linea=br.readLine();
             }
             br.close();
             
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        */
     
        System.out.println("Actividad extra");
        //inicialización de los datos del alumno
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("Maria", "Garcia", "Perez", "0123456789",21);
        alumnos[1] = new Alumno("Juan","Perez","Garcia","5678901234",18);
        alumnos[2] = new Alumno("Laura","Martinez","Gomez","2345678901",19);
        alumnos[3] = new Alumno("Alejandro","Martinez","Gomez","7890123456",24);
        alumnos[4] = new Alumno("Andrea","Rodriguez","Perez","4567890123",23);
        //pasandolos a cadena para ponerlos en un archivo
        
        
        /**
         * Escritura en el archivo csv (primera parte del archivo)
         * El try revisa que no se genere un error debido a la falta de un archivo o dato
         */
        try{
            System.out.println("Escritura del archivo");
            FileWriter fw = new FileWriter("alumnosExtra.csv");
            BufferedWriter bw=new BufferedWriter(fw);
            try (PrintWriter imprimeAlumnos = new PrintWriter(bw)) {
                for (Alumno alumno : alumnos) {
                    String lineas = alumno.getNombre() + "," +
                           alumno.getApPat() + "," +
                           alumno.getApMat() + "," +
                           alumno.getNumCuenta() + "," +
                           alumno.getEdad();
                    imprimeAlumnos.println(lineas);
                }
                imprimeAlumnos.close();
            }
        /**
         * Lanza la excepcion y la imprime un pantalla
         */
        }catch (IOException ex){
             System.out.println(ex.getMessage());
         }
        
        /**
         * Leer el archivo y con eso crear nuevos alumnos 
         * El try revisa que no se genere un error debido a la falta de un atributo o documento
         */
        try{
            System.out.println("Lectura del archivo");
            FileReader fr = new FileReader("alumnosExtra.csv");
            BufferedReader br =new BufferedReader(fr);
            
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null && contador < 5) {
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");
                String nombre = tokenizer.nextToken();
                String apPat = tokenizer.nextToken();
                String apMat = tokenizer.nextToken();
                String numCuenta = tokenizer.nextToken();
                int edad = Integer.parseInt(tokenizer.nextToken());

                Alumno nuevoAlumno = new Alumno();
                nuevoAlumno.setNombre(nombre);
                nuevoAlumno.setApPat(apPat);
                nuevoAlumno.setApMat(apMat);
                nuevoAlumno.setNumCuenta(numCuenta);                
                nuevoAlumno.setEdad(edad);
                contador++;
            }


            br.close();
        /**
         * Lanza la excepcion y la imprime un pantalla
         */
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

         
         
    }
    
}