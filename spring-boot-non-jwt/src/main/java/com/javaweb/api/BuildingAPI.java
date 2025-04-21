package com.javaweb.api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingBTO;
import com.javaweb.model.ErrorResponseDTO;

import customexception.FieldRequiredException;
import service.BuildingService;
@RestController

public class BuildingAPI {


	
//    @PostMapping(value="/api/building")
//    public Object getBuilding1(@RequestParam(value="name", required=false ) String nameBuilding,
//    		@RequestParam(value="numberOfBasement",required=false) Integer numberOfBasement,
//    		@RequestParam(value="ward", required=false ) String ward) {
//    	// xu ly duoi DB xong roi
////      	try {
////    		System.out.print(5/0);
////    	}catch(Exception e) {
////    		ErrorResponseDTO errorResponseDTO=new ErrorResponseDTO();
////    		errorResponseDTO.setError(e.getMessage());
////    		List<String> details=new ArrayList<>();
////    		details.add("So nguyen lam sao chia cho so 0 duoc");
////    		errorResponseDTO.setDetail(details);
////    		return errorResponseDTO;
////    	}
////    	BuildingBTO result =new BuildingBTO();
////    	result.setName(nameBuilding);
////    	result.setNumberOfBasement(numberOfBasement);
////    	result.setWard(ward);
//    	List<BuildingBTO> listBuildings =new ArrayList<>();
//    	BuildingBTO buildingBTO1=new BuildingBTO();
//    	buildingBTO1.setName("NTD Building");
//    	buildingBTO1.setNumberOfBasement(3);
//    	buildingBTO1.setWard("Yen Chi");
//    	BuildingBTO buildingBTO2=new BuildingBTO();
//    	buildingBTO2.setName("YC Building");
//    	buildingBTO2.setNumberOfBasement(3);
//    	buildingBTO2.setWard("Trong Dat");
//    	listBuildings.add(buildingBTO1);
//    	listBuildings.add(buildingBTO2);
//    	return listBuildings;
//    }
	@Autowired
    private BuildingService  buildingService;
    
    @GetMapping(value="/api/building")
    public List<BuildingBTO>  getBuilding(@RequestParam(name="name", required=false) String name,
    		                              @RequestParam(name="district_id", required=false) Long district_id,
    		                              @RequestParam(name="renttype_code", required=false) List<String> renttype_code)  {
    	
    	List<BuildingBTO> result= buildingService.findAll(name,district_id);
    	
//    	try {
//    		System.out.print(5/0);
//    		valiDate(building);
//    	}catch(Exception e) {
//    		ErrorResponseDTO errorResponseDTO=new ErrorResponseDTO();
//    		errorResponseDTO.setError(e.getMessage());
//    		List<String> details=new ArrayList<>();
//    		details.add("Check lai name or numberofbasement");
//    		errorResponseDTO.setDetail(details);
//    		return errorResponseDTO;
//    	}
    	//System.out.print(5/0);
//    	valiDate(building);
    	return result;
    }
//    public void valiDate(BuildingBTO buildingBTO) throws FieldRequiredException {
//    	if(buildingBTO.getName()==null || buildingBTO.getName().equals("")||buildingBTO.getNumberOfBasement()==null) {
//    		throw new FieldRequiredException("name or numberofbasement is null");
//    	}
//    }
//    @DeleteMapping(value="/api/building/{id}")
//    public void deleteBuilding(@PathVariable Integer id)  {
//    	System.out.println("Da xoa toa nha co id la"+id+" roi nhe");
//    }
}
