//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Receptionist
class Surgery {

//Defining Variables and Data Types

	String name
	String address
	String postcode
	String telephone
	int numberOfPatients 
	String description
	String openingTime
	//Declaring one to many relationships and many to many relationships with other classes
	static hasMany=[doctors:Doctor, receptionists:Receptionist, nurses:Nurse, patients:Patient, appointments:Appointment]
	//Method to return the recepName as a string so the instance name will use recepName instead of the deafult text
	String toString() {return name}

	//Declaring constraints
    static constraints = {

	name nullable: false, blank: false, maxSize: 50
	address nullable: false, blank: false, maxSize: 70
	postcode nullable: false, blank: false, minSize: 3, maxSize: 10
	telephone nullable: false, blank: false, minSize: 6, maxSize: 17
	numberOfPatients nullable: false, blank: false, max: 1000
	description nullable: true, blank: true, maxSize: 5000, widget:'textarea'
	openingTime nullable: false, blank: false, maxSize: 20
	
    }
}
