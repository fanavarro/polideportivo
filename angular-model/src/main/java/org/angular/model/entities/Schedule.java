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

@Entity
@Table(name="SCHEDULE")
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_SCHEDULE")
	private Integer id;
	
	@Column(name="WEEK_DAY")
	private Integer weekDay;
	
	@Temporal(TemporalType.TIME)
	@Column(name="START_HOUR")
	private Date startHour;
	
	@Temporal(TemporalType.TIME)
	@Column(name="END_HOUR")
	private Date endHour;

	public WeekDay getWeekDay() {
		return WeekDay.getWeekDay(weekDay);
	}

	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay.getId();
	}
	public void setWeekDay(Integer weekDay) {
		this.weekDay = weekDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartHour() {
		return startHour;
	}

	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	public Date getEndHour() {
		return endHour;
	}

	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	
	
}
