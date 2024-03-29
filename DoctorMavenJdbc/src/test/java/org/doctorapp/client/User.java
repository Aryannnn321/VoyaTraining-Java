package org.doctorapp.client;

import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;
import org.doctorapp.util.DoctorDb;

import java.util.List;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService= new DoctorServiceImpl();

        String speciality= Specialization.GYNAEC.getSpeciality();
        Doctor doctor =new Doctor("bhuvi",speciality, 5670, 1, 8);
//        doctorService.addDoctor( doctor);
//        List<Doctor> doctorList =doctorService.getAll();
//        for (Doctor doctor1:doctorList){
//            System.out.println(doctor1);
//        }
    }
}
