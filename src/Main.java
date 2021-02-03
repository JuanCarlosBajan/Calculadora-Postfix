import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

    CalculadoraGeneral calculadora = new CalculadoraJuanBajan();
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    String resp = "";

    try {
        archivo = new File ("C:\\Users\\juanc\\OneDrive\\Escritorio\\UVG\\Tareas\\Algoritmos y estructura de Datos\\Hoja de Trabajo3\\src\\archivo.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);

        String linea;
        while((linea=br.readLine())!=null) {
            resp = calculadora.Calculo(linea);
            System.out.println(resp);
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }



    }

    }
