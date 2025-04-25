package repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import repository.DistrictRepository;
import repository.entity.BuildingEntity;
import repository.entity.DistrictEntity;
@Repository
public class DistrictRepositoryImpl implements DistrictRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/project1";

	static final String USER ="root";
	static final String PASS ="dat17082005";
	@Override 
	public DistrictEntity findNameBy(Long district_id) {
        DistrictEntity districtEntity=new DistrictEntity();
		String sql= "SELECT d.district_name FROM district d WHERE d.district_id= "+ district_id+ ";";
		try(Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
    			Statement stmt =conn.createStatement();
    			ResultSet rs=stmt.executeQuery(sql);
    			){
    		while(rs.next()) {
                  districtEntity.setDistrict_name(rs.getString("district_name"));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    		System.out.println("Connected database failed..");
    	}
		return districtEntity;
	}

}
