package org.angular.model.enums;

/**
 * The Enum WeekDay.
 */
public enum WeekDay {
	
	/** The monday. */
	MONDAY(1, "MONDAY"), 
 /** The tuesday. */
 TUESDAY(2, "TUESDAY"), 
 /** The wednesday. */
 WEDNESDAY(3, "WEDNESDAY"), 
 /** The thursday. */
 THURSDAY(
			4, "THURSDAY"), 
 /** The friday. */
 FRIDAY(5, "FRIDAY"), 
 /** The satrday. */
 SATRDAY(6, "SATRDAY"), 
 /** The sunday. */
 SUNDAY(
			7, "SUNDAY");

	/** The id. */
	private final Integer id;
	
	/** The description. */
	private final String description;

	/**
	 * Instantiates a new week day.
	 *
	 * @param id the id
	 * @param description the description
	 */
	private WeekDay(Integer id, String description) {
		this.id = id;
		this.description = description;
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
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the week day.
	 *
	 * @param id the id
	 * @return the week day
	 */
	public static WeekDay getWeekDay(Integer id) {
		WeekDay result = null;
		if (id != null) {
			for (WeekDay weekDay : WeekDay.values()) {
				if (weekDay.getId().equals(id)) {
					result = weekDay;
					break;
				}
			}
		}
		return result;
	}

}
