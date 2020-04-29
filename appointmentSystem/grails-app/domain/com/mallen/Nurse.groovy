package com.mallen

class Nurse {
	
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

    static constraints = {

	nurseName nullable: false, blank: false, maxSize: 50
	qualifications nullable: false, blank: false, maxSize: 60
	nurseEmail nullable: false, blank: false, maxSize: 50, email: true
	nurseOffice nullable: false, blank: false, maxSize: 10
	nursePhone nullable: false, blank: false, minSize: 6, maxSize: 17

    }
}
