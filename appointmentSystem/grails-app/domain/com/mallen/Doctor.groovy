//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Doctor
class Doctor {

//Defining Variables and Data Types

	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio
	//Many to one relationship with Surgery
	Surgery doctorsSurgery
	//Declaring one to many relationships and many to many relationships with other classes
	static hasMany=[prescriptions:Prescription, nurses:Nurse, patients:Patient, appointments:Appointment]
	//Method to return the fullName as a string so the instance name will use fullName instead of the deafult text
	String toString() {return fullName}

	//Declaring constraints
    static constraints = {
	
	fullName nullable: false, blank: false, maxSize: 50
	qualification nullable: false, blank: false, maxSize: 60
	position nullable: false, blank: false, maxSize: 20
	doctorEmail nullable: false, blank: false, maxSize: 50, email: true
	password nullable: false, blank: false, minSize: 8, maxSize: 25
	doctorOffice nullable: false, blank: false, maxSize: 10
	doctorPhone nullable: false, blank: false, minSize: 6, maxSize: 17
	bio nullable: false, blank: false, maxSize: 5000, widget:'textarea'
	doctorsSurgery nullable: true, blank: true
	
    }
}
