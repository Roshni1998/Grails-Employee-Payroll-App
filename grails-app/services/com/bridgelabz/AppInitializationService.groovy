package com.bridgelabz

import grails.gorm.transactions.Transactional

@Transactional
class AppInitializationService {

    static initialize() {
        initEmployee()
    }

    private static initEmployee() {
        if(EmployeeModel.count == 0){
            println("No Data Available")
        }
        if (EmployeeModel.count() == 0) {
//            Employee employee = new Employee()
//            employee.name = "Kunal"
//            employee.profilePic = "No Profile"
//            employee.gender = "Male"
//            employee.department.addAll("HR","Department")
//            employee.salary = 1500000
//            employee.startDate = null
//            employee.notes = "Fresher"
//            employee.save(flash: true)
        }
    }
}
