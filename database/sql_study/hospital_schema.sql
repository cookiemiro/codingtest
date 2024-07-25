use hospital;

create table doctor (
	doctor_id varchar(20) not null,
    department_of_treatment varchar(20) not null,
    dName varchar(20) not null,
    gender char(5) not null,
    phone_number char(13) not null unique,
    email varchar(40) not null unique,
    dRank varchar(20) not null,
    primary key (doctor_id)
);

create table nurse(
	nurse_id varchar(20) not null,
	task varchar(20) not null,
    nName varchar(20) not null,
    gender char(5) not null,
    phone_number char(13) not null unique,
    email varchar(40) not null unique,
    nRank varchar(20) not null,
    primary key (nurse_id)
);

create table patient(
	patient_id varchar(20) not null,
    nurse_id varchar(20) not null,
    doctor_id varchar(20) not null,
    pName varchar(20) not null,
    gender char(5) not null,
    resident_registration_number char(14) not null,
    address varchar(40) not null,
    phone_number char(13) not null unique,
    email varchar(40) unique,
    job varchar(20),
    primary key (patient_id)
);

create table consultation (
	consultation_id varchar(20) not null,
    patient_id varchar(20) not null,
	doctor_id varchar(20) not null,
	consultation_content varchar(255) not null,
    consultation_date date not null,
    primary key (consultation_id)
);

create table chart (
	chart_id varchar(20) not null,
    consultation_id varchar(20) not null,
    doctor_id varchar(20) not null,
    patient_id varchar(20) not null,
    nurse_id varchar(20) not null,
    chart_content varchar(255) not null,
    primary key (chart_id)
);

alter table consultation add unique index (
	patient_id, doctor_id
);

alter table consultation add unique index (
	consultation_id, doctor_id, patient_id
);

alter table patient add foreign key (nurse_id) references nurse(nurse_id);
alter table patient add foreign key (doctor_id) references doctor(doctor_id);

alter table consultation add foreign key (patient_id) references patient(patient_id);
alter table consultation add foreign key (doctor_id) references doctor(doctor_id);

alter table chart add foreign key (consultation_id) references consultation(consultation_id);
alter table chart add foreign key (patient_id) references patient(patient_id);
alter table chart add foreign key (doctor_id) references doctor(doctor_id);