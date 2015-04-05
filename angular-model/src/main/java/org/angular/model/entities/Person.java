package org.angular.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Clase que representa a una persona.
 * @author fabad
 *
 */
@Entity
@Table(name="PERSON")
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6647458659870521129L;

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PERSON")
	private Integer id;
	
	/** The name. */
	@Column(name="NAME")
	private String name;
	
	/** The surname. */
	@Column(name="SURNAME")
	private String surname;
	
	/** The login. */
	@Column(name="LOGIN")
	private String login;
	
	/** The age. */
	@Column(name="AGE")
	private Integer age;

	/** The sports. */
	@ManyToMany
	@JoinTable(name = "PERSON_SPORT", joinColumns = { @JoinColumn(name = "ID_PERSON") }, inverseJoinColumns = { @JoinColumn(name = "ID_SPORT") })
	private List<Sport> sports;
	
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the surname.
	 *
	 * @param surname the new surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Gets the login.
	 *
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the login.
	 *
	 * @param login the new login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Gets the sports.
	 *
	 * @return the sports
	 */
	public List<Sport> getSports() {
		return sports;
	}

	/**
	 * Sets the sports.
	 *
	 * @param sports the new sports
	 */
	public void setSports(List<Sport> sports) {
		this.sports = sports;
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
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", login=" + login + ", age=" + age + ", sports=" + sports
				+ "]";
	}


	
	
	
}
