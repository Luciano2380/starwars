package br.com.lpo.starwars.entidade;





import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "tripulacoes")
public class Tripulacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tri")
	private Integer id;
	@Column(name="nave_tri")
	private String nave;
	@Column(name="tripulante1_tri")
	private String tripulante1;
	@Column(name="tripulante2_tri")
	private String tripulante2;
	@Column(name="tripulante3_tri")
	private String tripulante3;
	@Column(name="tripulante4_tri")
	private String tripulante4;
	@ManyToOne
	@JoinColumn(name="usu_tri")
	private Usuario usuario;
	@Transient
	private Integer idUsuario;
	
	public Tripulacao() {
		
	}
	public Tripulacao(Integer id) {		
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNave() {
		return nave;
	}
	public void setNave(String nave) {
		this.nave = nave;
	}
	public String getTripulante1() {
		return tripulante1;
	}
	public void setTripulante1(String tripulante1) {
		this.tripulante1 = tripulante1;
	}
	public String getTripulante2() {
		return tripulante2;
	}
	public void setTripulante2(String tripulante2) {
		this.tripulante2 = tripulante2;
	}
	public String getTripulante3() {
		return tripulante3;
	}
	public void setTripulante3(String tripulante3) {
		this.tripulante3 = tripulante3;
	}
	public String getTripulante4() {
		return tripulante4;
	}
	public void setTripulante4(String tripulante4) {
		this.tripulante4 = tripulante4;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	

}
