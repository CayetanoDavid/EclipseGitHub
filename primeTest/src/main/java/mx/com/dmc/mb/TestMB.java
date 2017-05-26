package mx.com.dmc.mb;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="testMB")
@ViewScoped
public class TestMB {

	private ArrayList<Usuario> lista;	//Lista de usuarios para mostrar en table
	private Usuario usuarioSeleccionado; //Objeto Usuario que se setea cuando se seleccciona uno
	
	private String firstname; //NOMBRE PRIMARIO
	private String lastname; //ULTIMO NOMRE
	
	public TestMB(){
		System.out.println("Constructor TestMB");
		lista = new ArrayList<Usuario>();
		Usuario usuario;
		for(int i=0; i<10; i++){
			usuario = new Usuario("usuario "+i,"apellido "+i);
			lista.add(usuario);
		}
		
		usuarioSeleccionado = new Usuario();
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("@PostConstruct");
	}
	
	public void verifFilaSeleccionada(){
		System.out.println("fila seleccionada "+this.getUsuarioSeleccionado().getNombre());
	}

	public ArrayList<Usuario> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Usuario> lista) {
		this.lista = lista;
	}

	public Usuario getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
