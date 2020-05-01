package com.mallen

class Doctor {

	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio
	static hasMany=[nurses:Nurse, prescriptions:Prescription, patients:Patient, appointments:Appointment]

	

    static constraints = {
	
	fullName nullable: false, blank: false, maxSize: 50
	qualification nullable: false, blank: false, maxSize: 60
	position nullable: false, blank: false, maxSize: 20
	doctorEmail nullable: false, blank: false, maxSize: 50, email: true
	password nullable: false, blank: false, minSize: 8, maxSize: 25
	doctorOffice nullable: false, blank: false, maxSize: 10
	doctorPhone nullable: false, blank: false, minSize: 6, maxSize: 17
	bio nullable: false, blank: false, maxSize: 5000, widget:'textarea'
	
    }
}
