package repository.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class BuildingEntity {
	
 private String building_name;
 private String building_street;
 private String building_ward;
 private Integer building_numberofBasement;
public String getBuilding_name() {
	return building_name;
}
public void setBuilding_name(String building_name) {
	this.building_name = building_name;
}
public String getBuilding_street() {
	return building_street;
}
public void setBuilding_street(String building_street) {
	this.building_street = building_street;
}
public String getBuilding_ward() {
	return building_ward;
}
public void setBuilding_ward(String building_ward) {
	this.building_ward = building_ward;
}
public Integer getBuilding_numberofBasement() {
	return building_numberofBasement;
}
public void setBuilding_numberofBasement(Integer building_numberofBasement) {
	this.building_numberofBasement = building_numberofBasement;
}
 
}
