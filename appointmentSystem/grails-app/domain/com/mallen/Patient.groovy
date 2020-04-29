package com.mallen

class Patient {

	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	int patientID
	Date dateRegistered
	String patientPhone

    static constraints = {

	patientName nullable: false, blank: false, maxSize: 50
	patientAddress nullable: false, blank: false, maxSize: 70
	patientResidence nullable: false, blank: false, maxSize: 30
	patientDob nullable: false, blank: false
	patientID nullable: false, blank: false,
	dateRegistered nullable: false, blank: false
	patientPhone nullable: false, blank: false, minSize: 6, maxSize: 12

    }
}
