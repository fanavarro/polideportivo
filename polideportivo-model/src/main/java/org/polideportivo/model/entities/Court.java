package org.polideportivo.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Court.
 */
@Entity
@Table(name="COURT")
public class Court implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6174450583446919614L;
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_COURT")
	private Integer id;
	
	/** The description. */
	@Column(name="DESCRIPTION")
	private String description;
	
	/** The sport. */
	@ManyToOne
	@JoinColumn(name="ID_SPORT")
	private Sport sport;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the sport.
	 *
	 * @return the sport
	 */
	public Sport getSport() {
		return sport;
	}

	/**
	 * Sets the sport.
	 *
	 * @param sport the new sport
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Court other = (Court) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * @autogenerated by CodeHaggis (http://sourceforge.net/projects/haggis)
	 * @overwrite toString()
	 * @return String returns this object in a String
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Court::[");
		sb.append(" " + super.toString() + "");
		sb.append(" id:=");
		sb.append(id);
		sb.append(" description:=");
		sb.append(description);
		sb.append(" sport:=");
		sb.append(sport);
		sb.append(']');
		return sb.toString();
	}
	
	

}
