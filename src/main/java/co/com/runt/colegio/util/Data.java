package co.com.runt.colegio.util;

import java.util.ArrayList;

/**
 * 
 * @author saligohe
 *
 * @param <T>
 */
public class Data<T> 
{
    private ArrayList<T> datos;

    public Data(ArrayList<T> datos) {
        this.datos = datos;
    }

    public Data() {
    }

	/**
	 * @return the datos
	 */
	public ArrayList<T> getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(ArrayList<T> datos) {
		this.datos = datos;
	}
    

}