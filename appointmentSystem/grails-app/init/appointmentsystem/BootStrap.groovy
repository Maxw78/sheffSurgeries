package com.mallen

class BootStrap {

    def init = { servletContext ->
	
	def Appointment1 = new Appointment(
	appDate:new Date('09/09/2019'),
	appTime:'3:00pm',
	appDuration:120,
	roomNumber:'EEE-5'
	).save()

	def Doctor1 = new Doctor (
	fullName:'John Titor',
	qualification:'General Practitioner License',
	position:'Head GP',
	doctorEmail:'JohnT@gmail.com',
	password:'VerySecretPass1',
	doctorOffice:'GP-100',
	doctorPhone:'0114 32 543',
	bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, dapibus 		bibendum justo. Duis laoreet hendrerit lobortis. Praesent dignissim rhoncus tortor eget tincidunt. Morbi mattis porta 		nibh, vitae mattis ex tristique non. In vulputate, massa sit amet porttitor condimentum, sem neque ultrices ipsum, 		hendrerit pretium tortor enim et felis. In nec gravida est. Aenean vel lacus eu nisl ullamcorper scelerisque faucibus 		id lacus. Aliquam erat volutpat.'
	).save()

	def Nurse1 = new Nurse (
	nurseName:'Jacky Smith',
	qualifications:'Degree in Nursing',
	nurseEmail:'JackyS@gmail.com',
	nurseOffice:'E555',
	nursePhone:'0745389034'
	).save()

	def Patient1 = new Patient (
	patientName:'Smithy West',
	patientAddress:'84 Eightville Road',
	patientResidence:'Sheffield',
	patientDob:new Date('02/05/2001'),
	patientID:1,
	dateRegistered:new Date('06/12/2009'),
	patientPhone:'0114 245 2345'
	).save()

	def Prescription1 = new Prescription (
	pharmacyName:'Loans Pharmacy',
	prescripNumber:2,
	medicine:'Calpol',
	totalCost:2.21,
	dateIssued:new Date('07/11/2020'),
	patientPaying:true
	).save()

	def Receptionist1 = new Receptionist (
	recepName:'Daveson Phobes',
	recepEmail:'DavesonP@gmail.com',	
	recepUserame:'DaveP12',
	recepPassword:'NewPassword1',
	recepPhone:'0114 2 555'
	).save()

	def Surgery1 = new Surgery (
	name:'Loans Surgery',
	address:'64 Chesterfield Road',
	postcode:'S8 4JN',
	telephone:'0114 34 877',
	numberOfPatients:1000,
	description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ante sapien, consequat et diam sit amet, 		dapibus bibendum justo. Duis laoreet hendrerit lobortis. Praesent dignissim rhoncus tortor eget tincidunt. Morbi mattis 	porta nibh, vitae mattis ex tristique non. In vulputate, massa sit amet porttitor condimentum, sem neque ultrices 		ipsum, 	hendrerit pretium tortor enim et felis. In nec gravida est. Aenean vel lacus eu nisl ullamcorper scelerisque 		faucibus idlacus. Aliquam erat volutpat.',
	openingTime:'08:00-17:00hrs'
	).save()


    }

    def destroy = {
    }
}
