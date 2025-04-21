package repository.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaweb.model.BuildingBTO;

import repository.BuildingRepository;
import repository.entity.BuildingEntity;
@Repository

public class BuildingRepositoryImpl implements BuildingRepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/project1";

	static final String USER ="root";
	static final String PASS ="dat17082005";
	@Override
	public List<BuildingEntity> findAll(String name , Long district_id) {
    	StringBuilder sql=new StringBuilder("SELECT * FROM building b WHERE 1=1");
    	if(name != null && name.equals("")) {
    		sql.append(" AND b.name like '%" + name + "%' ");
    	}
    	if(district_id != null) {
    	sql.append(" AND  b.district_id= " +district_id+ " ");
    	}
    	List<BuildingEntity> result= new ArrayList<>();
    	try(Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
    			Statement stmt =conn.createStatement();
    			ResultSet rs=stmt.executeQuery(sql.toString());
    			){
    		while(rs.next()) {
    			BuildingEntity building =new BuildingEntity();
    			building.setBuilding_name(rs.getString("building_name"));
    			building.setBuilding_numberofBasement(rs.getInt("building_numberofbasement"));
    			building.setBuilding_street(rs.getString("building_street"));
    			building.setBuilding_ward(rs.getString("bulidng_ward"));
    			result.add(building);
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    		System.out.println("Connected database failed..");
    	}
    	return result;  
	}

}
