package datos;

import java.io.*;
import java.util.ArrayList;

public class datos {
    private ArrayList<String> rut = new ArrayList<>();
    private ArrayList<String> nombre = new ArrayList<>();
    private ArrayList<String> correo = new ArrayList<>();
    private GestorArchivo ga = new GestorArchivo();
    public datos(){
        crearArreglo();
    }
    public void crearArchivo() {
        ga.crearArchivo("ICC264.txt", "20583773619;ALIANTE POBLETE SEBASTIAN ANDRES;s.aliante01@ufromail.cl\n" +
                "20968025420;CALDERÓN RETAMAL GUSTAVO ALEJANDRO;g.calderon05@ufromail.cl\n" +
                "22456736720;CAÑETE NAHUELFIL NICOLÁS MATÍAS;n.canete01@ufromail.cl\n" +
                "21029594120;FERNÁNDEZ MILLAR NICOLÁS ANTONIO;n.fernandez07@ufromail.cl\n" +
                "20886090920;HENRÍQUEZ RETAMAL MARCELO IGNACIO;m.henriquez11@ufromail.cl\n" +
                "19809314918;HUENCHUÑAN CARES GONZALO NICOLAS;g.huenchunan01@ufromail.cl\n" +
                "20787295420;HUIRCALEO CANIUPÁN JOSÉ ENRIQUE;j.huircaleo01@ufromail.cl\n" +
                "20919321320;LAGOS LLANOS GERMÁN ALEXANDER;g.lagos05@ufromail.cl\n" +
                "20081365019;MORALES ALMEYDA IGNACIO ANDRÉS ANTONIO;i.morales04@ufromail.cl\n" +
                "20584002819;NAVARRO CUEVAS DIEGO ALEJANDRO;d.navarro03@ufromail.cl\n" +
                "20302902019;PAREDES SÁEZ PAOLO FABIÁN;p.paredes06@ufromail.cl\n" +
                "20652598319;PÉREZ LÓPEZ PABLO IGNACIO;p.perez14@ufromail.cl\n" +
                "20915656320;PINO BARRIENTOS LEANDRO BASTIÁN;l.pino06@ufromail.cl\n" +
                "20079931318;RAPOSO MÉNDEZ AGUSTÍN ANTONIO;a.raposo01@ufromail.cl\n" +
                "20617429319;SÁEZ ALMAZABAL ESTEBAN SIMÓN;e.saez07@ufromail.cl\n" +
                "20923634620;SANDOVAL ACUÑA BERNARDO ANTONIO;b.sandoval07@ufromail.cl\n" +
                "20366482618;VILLAGRAN OLIVERA JUAN FERNANDO;j.villagran03@ufromail.cl\n");
    }
    public void crearArreglo(){
        int posicionF = 0;
        int posicionI = 0;


        while (posicionI != ga.leerArchivo("ICC264.txt").length()){
            posicionF = ga.leerArchivo("ICC264.txt").indexOf(";",posicionI);
            rut.add(ga.leerArchivo("ICC264.txt").substring(posicionI,posicionF));
            posicionI = posicionF+1;
            posicionF = ga.leerArchivo("ICC264.txt").indexOf(";",posicionI);
            nombre.add(ga.leerArchivo("ICC264.txt").substring(posicionI,posicionF));
            posicionI = posicionF+1;
            posicionF = ga.leerArchivo("ICC264.txt").indexOf("\n",posicionI);
            correo.add(ga.leerArchivo("ICC264.txt").substring(posicionI,posicionF));
            posicionI = posicionF+1;
        }
    }
    public void agregarAlumno(String rut,String nombre,String correo){
        ga.agregarLinea("ICC264.txt",rut + ";" + nombre + ";" + correo + "\n");
        this.rut.add(rut);
        this.nombre.add(nombre);
        this.correo.add(correo);
    }

    public ArrayList<String> getRut() {
        return rut;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public ArrayList<String> getCorreo() {
        return correo;
    }
}
