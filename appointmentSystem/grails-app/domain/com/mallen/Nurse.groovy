package com.mallen

class Nurse {
	
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone
	Surgery nursesDoctorsSurg
	static hasMany=[doctors:Doctor]
	static belongsTo=[Doctor]
	String toString() {return nurseName}

    static constraints = {

	nurseName nullable: false, blank: false, maxSize: 50
	qualifications nullable: false, blank: false, maxSize: 60
	nurseEmail nullable: false, blank: false, maxSize: 50, email: true
	nurseOffice nullable: false, blank: false, maxSize: 10
	nursePhone nullable: false, blank: false, minSize: 6, maxSize: 17
	nursesDoctorsSurg nullable: true, blank: true

    }
}
