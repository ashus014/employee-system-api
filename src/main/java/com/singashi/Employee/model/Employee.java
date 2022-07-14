package com.singashi.Employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
