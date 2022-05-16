package com.graddletool.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.graddletool.model.Employee;

import io.micronaut.core.annotation.Introspected;

@Introspected
public interface Service {

	public Connection doConnection();

	public void postEmpData(Employee employee) throws SQLException;

	public ArrayList<Employee> getEmpInfo() throws SQLException;

	public Employee dataByEmpId(int id) throws SQLException;

	public Employee updateEmpData(Employee employee, int id) throws SQLException;

	public void deleteEmpData(int id) throws SQLException;

}
