//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Patient
class Patient {

//Defining Variables and Data Types

	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	int patientID
	Date dateRegistered
	String patientPhone
	//One to One relationship with Appointment
	Appointment appointment
	//Declaring one to many relationships and many to many relationships with other classes
	static hasMany=[doctors:Doctor, prescriptions:Prescription, surgerys:Surgery]
	//The Many to Many relationships belong to Doctor and Surgery
	static belongsTo=[Doctor, Surgery]
	//Method to return the patientName as a string so the instance name will use patientName instead of the deafult text
	String toString() {return patientName}

	//Declaring constraints
    static constraints = {

	patientName nullable: false, blank: false, maxSize: 50
	patientAddress nullable: false, blank: false, maxSize: 70
	patientResidence nullable: false, blank: false, maxSize: 30
	patientDob nullable: false, blank: false
	patientID nullable: false, blank: false
	dateRegistered nullable: false, blank: false
	patientPhone nullable: false, blank: false, minSize: 6, maxSize: 17

    }
}
