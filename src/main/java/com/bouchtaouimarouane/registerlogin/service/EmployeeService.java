package com.bouchtaouimarouane.registerlogin.service;

import com.bouchtaouimarouane.registerlogin.dto.EmployeeDTO;
import com.bouchtaouimarouane.registerlogin.dto.LoginDTO;
import com.bouchtaouimarouane.registerlogin.response.LoginMessage;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);
    LoginMessage loginEmployee(LoginDTO loginDTO);
}
