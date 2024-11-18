package com.xworkz.customer.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.customer.dbconnection.DbConnection;
import com.xworkz.customer.dto.CustomerDTO;

public class CustomerRepoImpl implements CustomerRepository {

	public boolean save(CustomerDTO customerDTO) {
		boolean valid = true;
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(DbConnection.URL.getValue(), DbConnection.USERNAME.getValue(),
					DbConnection.PASSWORD.getValue());

			PreparedStatement preparedStatement = null;

			preparedStatement = connection.prepareStatement("insert into details values(?, ?, ?, ?, ?, ?)");

			preparedStatement.setString(1, customerDTO.getName());
			preparedStatement.setString(2, customerDTO.getEmail());
			preparedStatement.setString(3, customerDTO.getPhNo());
			preparedStatement.setInt(4, customerDTO.getAge());
			preparedStatement.setString(5, customerDTO.getAddNo());
			preparedStatement.setString(6, customerDTO.getPanNo());

			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("Saved");
				valid = true;
			} else {
				System.out.println("Not saving");
				valid = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}

}
