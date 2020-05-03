//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Nurse
class Nurse {

//Defining Variables and Data Types
	
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone
	//Many to one relationship with Surgery
	Surgery nursesDoctorsSurg
	//Many to Many relationship with Doctor
	static hasMany=[doctors:Doctor]
	//The Many to Many relationship belongs to Doctor
	static belongsTo=[Doctor]
	//Method to return the nurseName as a string so the instance name will use nurseName instead of the deafult text
	String toString() {return nurseName}

	//Declaring constraints
    static constraints = {

	nurseName nullable: false, blank: false, maxSize: 50
	qualifications nullable: false, blank: false, maxSize: 60
	nurseEmail nullable: false, blank: false, maxSize: 50, email: true
	nurseOffice nullable: false, blank: false, maxSize: 10
	nursePhone nullable: false, blank: false, minSize: 6, maxSize: 17
	nursesDoctorsSurg nullable: true, blank: true

    }
}
