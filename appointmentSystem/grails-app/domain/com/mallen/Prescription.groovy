//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Prescription
class Prescription {

//Defining Variables and Data Types

	String pharmacyName
	int prescripNumber 
	String medicine
	Double totalCost
	Date dateIssued
	Boolean patientPaying
	//Many to one relationship with Doctor
	Doctor givenPrescriptions
	//Many to one relationship with Patient
	Patient recievedPrescriptions
	//Method to return the fullName as a string so the instance name will use fullName instead of the deafult text
	String toString() {return medicine}

	//Declaring constraints
    static constraints = {

	pharmacyName nullable: false, blank: false, maxSize: 50
	prescripNumber nullable: false, blank: false
	medicine nullable: false, blank: false, maxSize: 50
	totalCost nullable: false, blank: false, scale: 2
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false
	givenPrescriptions nullable: true, blank: true
	recievedPrescriptions nullable: true, blank: true
	
    }
}
