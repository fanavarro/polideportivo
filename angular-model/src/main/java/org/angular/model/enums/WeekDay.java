package org.angular.model.enums;

public enum WeekDay {
	MONDAY(1, "MONDAY"), TUESDAY(2, "TUESDAY"), WEDNESDAY(3, "WEDNESDAY"), THURSDAY(
			4, "THURSDAY"), FRIDAY(5, "FRIDAY"), SATRDAY(6, "SATRDAY"), SUNDAY(
			7, "SUNDAY");

	private final Integer id;
	private final String description;

	private WeekDay(Integer id, String description) {
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

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
