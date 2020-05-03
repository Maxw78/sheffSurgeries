package com.mallen
//This is the BootStrap document used for initialising data to the web application on load
class BootStrap {

    def init = { servletContext ->

	//Initalisting Surgery Data

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

	//End of Initalisting Surgery Data

	//Initalisting Doctor Data

	def doctor1 = new Doctor (
	fullName:'John Titor',
	qualification:'General Practitioner License',
	position:'Head GP',
	doctorEmail:'JohnT@gmail.com',
	password:'VerySecretPass1',
	doctorOffice:'GP-100',
	doctorPhone:'0114 32 543',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus bibendum 	justo. Duis 		laoreet hendrerit lobortis.',
	doctorsSurgery:surgery1
	).save()

	def doctor2 = new Doctor (
	fullName:'Dr Sarah Macdonald',
	qualification:'MBChB(Sheffield)',
	position:'GP, Surgeon',
	doctorEmail:'s.macdonald@myemail.com',
	password:'secret222',
	doctorOffice:'D-9888',
	doctorPhone:'01111777',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus justo. Duis laoreet 		hendrerit lobortis.',
	doctorsSurgery:surgery1
	).save()

	def doctor3 = new Doctor (
	fullName:'Dr Lana Chandler',
	qualification:'Masters',
	position:'GP',
	doctorEmail:'lchandler@gmail.com',
	password:'LChand12',
	doctorOffice:'D-111',
	doctorPhone:'0114 42345',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus justo. Duis laoreet 		hendrerit lobortis.',
	doctorsSurgery:surgery2
	).save()

	def doctor4 = new Doctor (
	fullName:'Dr Alanna Houghton',
	qualification:'Masters Degree in Biology and Doctorate Degree',
	position:'Surgeon',
	doctorEmail:'AlannaH@mail.com',
	password:'TheBestDoctorEver',
	doctorOffice:'H-967',
	doctorPhone:'0114 553 3434',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus justo. Duis laoreet 		hendrerit lobortis.',
	doctorsSurgery:surgery2
	).save()

	//End of Initalisting Doctor Data

	//Initalisting Appointment Data

	def appointment1 = new Appointment(
	appDate:new Date('09/09/2019'),
	appTime:'9:00am',
	appDuration:120,
	roomNumber:'EEE-5',
	ownedAppointments:doctor1
	).save()

	def appointment2 = new Appointment(
	appDate:new Date('11/04/2019'),
	appTime:'3:00pm',
	appDuration:30,
	roomNumber:'A-1111',
	ownedAppointments:doctor1
	).save()

	def appointment3 = new Appointment(
	appDate:new Date('02/06/2020'),
	appTime:'11:00am',
	appDuration:30,
	roomNumber:'SAR-12',
	ownedAppointments:doctor2
	).save()

	def appointment4 = new Appointment(
	appDate:new Date('09/12/2020'),
	appTime:'2:00pm',
	appDuration:30,
	roomNumber:'B-32',
	ownedAppointments:doctor3
	).save()

	def appointment5 = new Appointment(
	appDate:new Date('05/05/2020'),
	appTime:'12:00pm',
	appDuration:60,
	roomNumber:'A-42',
	ownedAppointments:doctor4
	).save()

	//End of Initalisting Appointment Data

	//Initalisting Patient Data

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

	def patient3 = new Patient (
	patientName:'Dobson Green',
	patientAddress:'44 BigTown Ave',
	patientResidence:'Doncaster',
	patientDob:new Date('01/01/2001'),
	patientID:2,
	dateRegistered:new Date('03/11/2012'),
	patientPhone:'0114 23235',
	appointment:appointment3
	).save()

	def patient4 = new Patient (
	patientName:'Charlie Burton',
	patientAddress:'55 Evergreen Lane',
	patientResidence:'Doncaster',
	patientDob:new Date('10/04/2000'),
	patientID:343,
	dateRegistered:new Date('03/05/2020'),
	patientPhone:'0114 123 23',
	appointment:appointment4
	).save()

	def patient5 = new Patient (
	patientName:'James Leeson',
	patientAddress:'67 Townsend Road',
	patientResidence:'Doncaster',
	patientDob:new Date('23/03/2000'),
	patientID:800,
	dateRegistered:new Date('23/06/2011'),
	patientPhone:'0114 23424',
	appointment:appointment5
	).save()

	//End of Initalisting Patient Data

	//Initalisting Nurse Data
	
	def nurse1 = new Nurse (
	nurseName:'Jacky Smith',
	qualifications:'Degree in Nursing',
	nurseEmail:'JackyS@gmail.com',
	nurseOffice:'E555',
	nursePhone:'0745389034',
	nursesDoctorsSurg:surgery1
	).save()

	def nurse2 = new Nurse (
	nurseName:'Susan Peters',
	qualifications:'Registered General Nurse',
	nurseEmail:'s.peters@meyemail.com',
	nurseOffice:'B-4555',
	nursePhone:'0114 222 4433',
	nursesDoctorsSurg:surgery1
	).save()

	def nurse3 = new Nurse (
	nurseName:'Olly Mora',
	qualifications:'Degree in Nursing',
	nurseEmail:'OllyM@gmail.com',
	nurseOffice:'N656',
	nursePhone:'01142332',
	nursesDoctorsSurg:surgery2
	).save()

	def nurse4 = new Nurse (
	nurseName:'Shann Sparrow',
	qualifications:'Midwife Degree',
	nurseEmail:'SSparrow@gmail.com',
	nurseOffice:'ER-23',
	nursePhone:'0114 2323 24',
	nursesDoctorsSurg:surgery2
	).save()

	//End of Initalisting Nurse Data

	//Initalisting Receptionist Data
	
	def receptionist1 = new Receptionist (
	recepName:'Daveson Phobes',
	recepEmail:'DavesonP@gmail.com',	
	recepUserame:'DaveP12',
	recepPassword:'NewPassword1',
	recepPhone:'0114 2 555',
	receptionistsDoctorSurg:surgery1
	).save()

	def receptionist2 = new Receptionist (
	recepName:'Rob Kingston',
	recepEmail:'r.kingston@email.com',	
	recepUserame:'rking',
	recepPassword:'Secret2019',
	recepPhone:'0114 222 4445',
	receptionistsDoctorSurg:surgery1
	).save()
	
	def receptionist3 = new Receptionist (
	recepName:'Jane Phobes',
	recepEmail:'JaneP@gmail.com',	
	recepUserame:'JaneP32',
	recepPassword:'JanePass',
	recepPhone:'0114 232 424',
	receptionistsDoctorSurg:surgery2
	).save()

	def receptionist4 = new Receptionist (
	recepName:'Mariana Harrignton',
	recepEmail:'MHarrignton@gmail.com',	
	recepUserame:'MH12',
	recepPassword:'securepass',
	recepPhone:'0114 222 4445',
	receptionistsDoctorSurg:surgery2
	).save()

	//End of Initalisting Receptionist Data
	
	//Initalisting Prescription Data
	
	def prescription1 = new Prescription (
	pharmacyName:'Loans Pharmacy',
	prescripNumber:2,
	medicine:'Calpol',
	totalCost:2.21,
	dateIssued:new Date('07/11/2020'),
	patientPaying:true,
	givenPrescriptions:doctor1,
	recievedPrescriptions:patient1
	).save()

	def prescription2 = new Prescription (
	pharmacyName:'City Centre Pharmacy',
	prescripNumber:56788,
	medicine:'Paracetomol',
	totalCost:5.90,
	dateIssued:new Date('25/05/2019'),
	patientPaying:true,
	givenPrescriptions:doctor1,
	recievedPrescriptions:patient1
	).save()

	def prescription3 = new Prescription (
	pharmacyName:'Loans Pharmacy',
	prescripNumber:3,
	medicine:'Anti-Biotics',
	totalCost:7.31,
	dateIssued:new Date('06/12/2020'),
	patientPaying:true,
	givenPrescriptions:doctor2,
	recievedPrescriptions:patient2
	).save()

	def prescription4 = new Prescription (
	pharmacyName:'City Centre Pharmacy',
	prescripNumber:4,
	medicine:'Pain Killers',
	totalCost:0.00,
	dateIssued:new Date('07/12/2020'),
	patientPaying:false,
	givenPrescriptions:doctor2,
	recievedPrescriptions:patient2
	).save()

	def prescription5 = new Prescription (
	pharmacyName:'Loans Pharmacy',
	prescripNumber:5,
	medicine:'Cream',
	totalCost:0.00,
	dateIssued:new Date('06/08/2020'),
	patientPaying:true,
	givenPrescriptions:doctor3,
	recievedPrescriptions:patient3
	).save()

	def prescription6 = new Prescription (
	pharmacyName:'Loans Pharmacy',
	prescripNumber:6,
	medicine:'Ear Cleaner',
	totalCost:2.00,
	dateIssued:new Date('02/06/2020'),
	patientPaying:true,
	givenPrescriptions:doctor3,
	recievedPrescriptions:patient4
	).save()

	def prescription7 = new Prescription (
	pharmacyName:'City Centre Pharmacy',
	prescripNumber:7,
	medicine:'Ointment',
	totalCost:10.00,
	dateIssued:new Date('30/09/2020'),
	patientPaying:true,
	givenPrescriptions:doctor4,
	recievedPrescriptions:patient5
	).save()
	//End of Initalisting Prescription Data



	//I could not get the addTo function to work so this code is commented out.
	/*surgery1.addToDoctors(doctor1)
	surgery2.addToDoctors(doctor1)
	
	surgery1.addToNurses(nurse1)
	surgery1.addToNurses(nurse2)
	
	nurse1.addToDoctors(doctor1)
	nurse2.addToDoctors(doctor1)
	
	doctor1.addToPrescriptions(prescription1)
	doctor1.addToPrescriptions(prescription2)*/


	
    }

    def destroy = {
    }
}
