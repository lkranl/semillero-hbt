/**
 * 
 */
package seedbed.unitTest;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.EstadoEnum;
import com.hbt.semillero.entidad.TematicaEnum;

/**
 * <b>Description:</b> Class that tests the creation of different arrays of comics
 * @author Andrés Cruz
 *
 */
public class CreationComicTest {
	
	private ArrayList<ComicDTO> comicList = new ArrayList<ComicDTO>();
	
	/**
	 * Method that creates 10 comics before the unit tests
	 */
	@BeforeTest
	public void createComicSucces() {
		ComicDTO comic = new ComicDTO();
		
		//Comic 1
		comic.setNombre("Hellblazer");
		comic.setAutores("Alan Moore, Stephen R. Bissette, John Ridgway");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.ACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 2
		comic = new ComicDTO();
		comic.setNombre("The Fantastic Four");
		comic.setAutores("John Byrne");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("Marvel");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.ACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 3
		comic = new ComicDTO();
		comic.setNombre("Constantine");
		comic.setAutores("Robert Venditti, Renato Guides");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.INACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 4
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.ACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 5
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.ACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 6
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.INACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 7
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.ACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 8
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.INACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 9
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.INACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
		
		// Comic 10
		comic = new ComicDTO();
		comic.setNombre("Hellblazer");
		comic.setAutores("John Shirley");
		comic.setCantidad(200L);
		comic.setColeccion("1-300");
		comic.setEditorial("DC Comics");
		comic.setColor(true);
		comic.setEstadoEnum(EstadoEnum.INACTIVO);
		comic.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic.setPrecio(BigDecimal.valueOf(15000.0));
		comic.setNumeroPaginas(1000);
		comicList.add(comic);
	}
	
	/**
	 * Method that creates an array, fills it with the active comics an returns it
	 * @return active: ArrayList with active comics
	 */
	public ArrayList<ComicDTO> checkActive() {
		ArrayList<ComicDTO> active = new ArrayList<ComicDTO>();
		for (ComicDTO comic: comicList) {
			if (comic.getEstadoEnum() == EstadoEnum.ACTIVO) {
				active.add(comic);
			}
		}
		return active;
	}
	
	/**
	 * Tests the method checkActive and prints the content of the array it returns
	 */
	@Test
	public void testActive() {
		ArrayList<ComicDTO> activeComics = this.checkActive();
		for (ComicDTO comic: activeComics) {
			System.out.println(comic.toString());
		}
	}
	
	/**
	 * Method that creates an array, fills it with the inactive comics an returns it
	 * @return active: ArrayList with inactive comics
	 */
	public ArrayList<ComicDTO> checkInactive() {
		ArrayList<ComicDTO> inactive = new ArrayList<ComicDTO>();
		try {
			for (ComicDTO comic: comicList) {
				if (comic.getEstadoEnum() == EstadoEnum.INACTIVO) {
					inactive.add(comic);
				}
			}
			
			throw new Exception();
		} catch (Exception e) {
			int totalComics = comicList.size();
			int inactiveComics = inactive.size();
			int activeComics = totalComics - inactiveComics;
			System.out.println("It's been detected that from " + Integer.toString(totalComics) +
					" comics, " + Integer.toString(activeComics) + "are active and " +
					Integer.toString(inactiveComics) + " are inactive.");
			System.out.println("The inactive comics are: ");
			for (ComicDTO comic: inactive) {
				System.out.println(comic.getNombre());
			}
		}
		return inactive;
	}
	
	/**
	 * Tests the method checkInactive and prints the content of the array it returns
	 */
	@Test
	public void testInactive() {
		ArrayList<ComicDTO> inactiveComics = this.checkInactive();
		for (ComicDTO comic: inactiveComics) {
			System.out.println(comic.toString());
		}
	}
}
