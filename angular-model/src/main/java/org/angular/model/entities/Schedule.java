package org.angular.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.angular.model.enums.WeekDay;

/**
 * Clase Schedule, que representa un turno (dia, hora de inicio y hora de fin)
 * @author fabad
 *
 */
@Entity
@Table(name="SCHEDULE")
public class Schedule {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_SCHEDULE")
	private Integer id;
	
	/** The week day. */
	@Column(name="WEEK_DAY")
	private Integer weekDay;
	
	/** The start hour. */
	@Temporal(TemporalType.TIME)
	@Column(name="START_HOUR")
	private Date startHour;
	
	/** The end hour. */
	@Temporal(TemporalType.TIME)
	@Column(name="END_HOUR")
	private Date endHour;

	/**
	 * Gets the week day.
	 *
	 * @return the week day
	 */
	public WeekDay getWeekDay() {
		return WeekDay.getWeekDay(weekDay);
	}

	/**
	 * Sets the week day.
	 *
	 * @param weekDay the new week day
	 */
	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay.getId();
	}
	
	/**
	 * Sets the week day.
	 *
	 * @param weekDay the new week day
	 */
	public void setWeekDay(Integer weekDay) {
		this.weekDay = weekDay;
	}

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
	 * Gets the start hour.
	 *
	 * @return the start hour
	 */
	public Date getStartHour() {
		return startHour;
	}

	/**
	 * Sets the start hour.
	 *
	 * @param startHour the new start hour
	 */
	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	/**
	 * Gets the end hour.
	 *
	 * @return the end hour
	 */
	public Date getEndHour() {
		return endHour;
	}

	/**
	 * Sets the end hour.
	 *
	 * @param endHour the new end hour
	 */
	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	
	
}
