//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Appointment
class Appointment {

//Defining Variables and Data Types

	Date appDate
	String appTime
	int appDuration
	String roomNumber
	//Many to one relationship with class Doctor
	Doctor ownedAppointments
	//Surgery is the owner of the relationship
	static belongsTo=[Surgery]
	//Method to return the appDate as a string so the instance will use appDate instead of the deafult text
	String toString() { return appDate }

	//Declaring constraints
    static constraints = {

	appDate nullable: false, blank: false
	appTime nullable: false, blank: false, maxSize: 20
	appDuration nullable: false, blank: false, max: 120
	roomNumber nullable: false, blank: false, maxSize: 10
	ownedAppointments nullable: true, blank: true

    }
}
