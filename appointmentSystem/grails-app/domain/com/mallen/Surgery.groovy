package com.mallen

class Surgery {

	String name
	String address
	String postcode
	int telephone
	int numberOfPatients 
	String description
	String openingTime

    static constraints = {
	name nullable: false, blank: false, maxSize: 50
	address nullable: false, blank: false, maxSize: 70
	postcode nullable: false, blank: false, minSize: 3, maxSize: 6
	telephone nullable: false, blank: false, minSize: 6, maxSize: 12
	numberOfPatients nullable: false, blank: false, max: 1000
	description nullable: false, blank: false, maxSize: 5000, widget:'textarea'
	openingTime nullable: false, blank: false, maxSize: 20
	
    }
}
