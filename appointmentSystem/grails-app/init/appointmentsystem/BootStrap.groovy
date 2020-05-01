package com.mallen

class BootStrap {

    def init = { servletContext ->
	
	def appointment1 = new Appointment(
	appDate:new Date('09/09/2019'),
	appTime:'9:00am',
	appDuration:120,
	roomNumber:'EEE-5'
	).save()

	def appointment2 = new Appointment(
	appDate:new Date('11/04/2019'),
	appTime:'3:00pm',
	appDuration:30,
	roomNumber:'A-1111'
	).save()

	def patient1 = new Patient (
	patientName:'Smithy West',
	patientAddress:'84 Eightville Road',
	patientResidence:'Sheffield',
	patientDob:new Date('02/05/2001'),
	patientID:1,
	dateRegistered:new Date('06/12/2009'),
	patientPhone:'0114 245 2345',
	appointment:appointment1
	).save()

	def patient2 = new Patient (
	patientName:'Tom Rivers',
	patientAddress:'2 One Way Street, Eckington',
	patientResidence:'Sheffield',
	patientDob:new Date('20/09/1988'),
	patientID:2555,
	dateRegistered:new Date('26/02/2018'),
	patientPhone:'0114 222 4444',
	appointment:appointment2
	).save()
	
	def prescription1 = new Prescription (
	pharmacyName:'Loans Pharmacy',
	prescripNumber:2,
	medicine:'Calpol',
	totalCost:2.21,
	dateIssued:new Date('07/11/2020'),
	patientPaying:true
	).save()

	def prescription2 = new Prescription (
	pharmacyName:'City Centre Pharmacy',
	prescripNumber:56788,
	medicine:'Paracetomol',
	totalCost:5.90,
	dateIssued:new Date('25/05/2019'),
	patientPaying:true
	).save()

	def doctor1 = new Doctor (
	fullName:'John Titor',
	qualification:'General Practitioner License',
	position:'Head GP',
	doctorEmail:'JohnT@gmail.com',
	password:'VerySecretPass1',
	doctorOffice:'GP-100',
	doctorPhone:'0114 32 543',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus bibendum 	justo. Duis 		laoreet hendrerit lobortis.'
	).save()

	def doctor2 = new Doctor (
	fullName:'Dr Sarah Macdonald',
	qualification:'MBChB(Sheffield)',
	position:'GP, Surgeon',
	doctorEmail:'s.macdonald@myemail.com',
	password:'secret222',
	doctorOffice:'D-9888',
	doctorPhone:'01111777',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus justo. Duis laoreet 		hendrerit lobortis.'
	).save()

	def nurse1 = new Nurse (
	nurseName:'Jacky Smith',
	qualifications:'Degree in Nursing',
	nurseEmail:'JackyS@gmail.com',
	nurseOffice:'E555',
	nursePhone:'0745389034'
	).save()

	def nurse2 = new Nurse (
	nurseName:'Susan Peters',
	qualifications:'Registered General Nurse',
	nurseEmail:'s.peters@meyemail.com',
	nurseOffice:'B-4555',
	nursePhone:'0114 222 4433'
	).save()

	def receptionist1 = new Receptionist (
	recepName:'Daveson Phobes',
	recepEmail:'DavesonP@gmail.com',	
	recepUserame:'DaveP12',
	recepPassword:'NewPassword1',
	recepPhone:'0114 2 555'
	).save()

	def receptionist2 = new Receptionist (
	recepName:'Rob Kingston',
	recepEmail:'r.kingston@email.com',	
	recepUserame:'rking',
	recepPassword:'Secret2019',
	recepPhone:'0114 222 4445'
	).save()

	def surgery1 = new Surgery (
	name:'Loans Surgery',
	address:'64 Chesterfield Road',
	postcode:'S8 4JN',
	telephone:'0114 34 877',
	numberOfPatients:1000,
	description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet,dapibus bibendum justo. 		Duis laoreet hendrerit lobortis.',
	openingTime:'08:00-17:00hrs'
	).save()

	def surgery2 = new Surgery (
	name:'City Health Centre',
	address:'21 Marble Street, Sheffield',
	postcode:'S11 5TY',
	telephone:'0114 555 555',
	numberOfPatients:50,
	description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus bibendum justo. 		Duis laoreet hendrerit lobortis.',
	openingTime:'09:00-17:00hrs'
	).save()

	doctor1.addToNurses(nurse1)
	doctor1.addToPrescriptions(prescription1)
	
    }

    def destroy = {
    }
}
