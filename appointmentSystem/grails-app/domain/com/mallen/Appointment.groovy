package com.mallen

class Appointment {

	Date appDate
	String appTime
	int appDuration
	String roomNumber
	String toString() { return appDate }

    static constraints = {

	appDate nullable: false, blank: false
	appTime nullable: false, blank: false, maxSize: 20
	appDuration nullable: false, blank: false, max: 120
	roomNumber nullable: false, blank: false, maxSize: 10

    }
}
