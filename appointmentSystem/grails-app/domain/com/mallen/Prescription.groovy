package com.mallen

class Prescription {

	String pharmacyName
	int prescripNumber 
	String medicine
	Double totalCost
	Date dateIssued
	Boolean patientPaying
	static belongsTo=[Doctor, Patient]
	String toString() {return medicine}

    static constraints = {

	pharmacyName nullable: false, blank: false, maxSize: 50
	prescripNumber nullable: false, blank: false
	medicine nullable: false, blank: false, maxSize: 50
	totalCost nullable: false, blank: false, scale: 2
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false
	
    }
}
