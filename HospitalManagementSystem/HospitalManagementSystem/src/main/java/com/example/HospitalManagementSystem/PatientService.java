package com.example.HospitalManagementSystem;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class PatientService {
    private List<Patient> patients = new ArrayList<>();
    public PatientService(){
        patients.add(new Patient(1,"Ravi","Fever",25));
        patients.add(new Patient(2,"Sita","Cold",30));
    }
    public List<Patient> getPatients(){
        return patients;
    }
    public Patient getPatientById(int id){
        for(Patient p : patients){
            if(p.getPatientId()==id){
                return p;
            }
        }
        return null;
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public String updatePatient(Patient patient) {
        for(int i =0; i<patients.size();i++){
            if(patients.get(i).getPatientId()==patient.getPatientId()){
                patients.set(i,patient);
                return "Updation Done";
            }
        }
        return "No Student data exist";
    }
    public String deleteStudent(int id){
        for(int i =0; i<patients.size();i++){
            if(patients.get(i).getPatientId()==id){
                patients.remove(i);
                return "Student deleted Successfully";
            }
        }
        return "No data exist";
    }
}
