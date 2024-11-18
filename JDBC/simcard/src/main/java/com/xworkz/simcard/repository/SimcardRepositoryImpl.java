package com.xworkz.simcard.repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import com.xworkz.simcard.dto.SimcardDTO;

public class SimcardRepositoryImpl {
	public boolean save(SimcardDTO simcardDTO) {
		boolean isValid = false;
		Connection connection = null;
		try {
			// connection
			connection = DriverManager.getConnection(DbConnection.URL.getValue(), DbConnection.USERNAME.getValue(),
					DbConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = null;

			preparedStatement = connection.prepareStatement("insert into loginbase values(?, ?, ?, ?)");
			preparedStatement.setString(1, simcardDTO.getFirstName());
			preparedStatement.setString(2, simcardDTO.getLastName());
			preparedStatement.setString(3, simcardDTO.getEmail());
			preparedStatement.setString(4, simcardDTO.getPassword());

			int value = preparedStatement.executeUpdate();

			if (value > 0) {
				System.out.println("Data saved");
				isValid = true;
			} else {
				System.out.println("Data does not saved");
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}
}
