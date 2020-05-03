//Declaring Package name for the Domain
package com.mallen

//Declaration of the Class Receptionist
class Receptionist {

//Defining Variables and Data Types
	
	String recepName
	String recepEmail	
	String recepUserame
	String recepPassword
	String recepPhone
	//Many to one relationship with Surgery
	Surgery receptionistsDoctorSurg
	//Method to return the recepName as a string so the instance name will use recepName instead of the deafult text
	String toString() {return recepName}

	//Declaring constraints
    static constraints = {

	recepName nullable: false, blank: false, maxSize: 50
	recepEmail nullable: false, blank: false, maxSize: 30, email: true	 
	recepUserame nullable: false, blank: false, maxSize: 30, unique: true	
	recepPassword nullable: false, blank: false, minSize: 8, maxSize: 25
	recepPhone nullable: false, blank: false, minSize: 6, maxSize: 17
	receptionistsDoctorSurg nullable: true, blank: true

    }
}
