package com.mallen

class Receptionist {
	
	String recepName
	String recepEmail	
	String recepUserame
	String recepPassword
	String recepPhone

    static constraints = {

	recepName nullable: false, blank: false, maxSize: 50
	recepEmail nullable: false, blank: false, maxSize: 30, email: true	 
	recepUserame nullable: false, blank: false, maxSize: 30, unique: true	
	recepPassword nullable: false, blank: false, minSize: 8, maxSize: 25
	recepPhone nullable: false, blank: false, minSize: 6, maxSize: 17

    }
}
