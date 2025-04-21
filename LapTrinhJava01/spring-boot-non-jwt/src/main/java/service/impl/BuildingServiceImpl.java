package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.javaweb.model.BuildingBTO;

import repository.BuildingRepository;
import repository.entity.BuildingEntity;
import service.BuildingService;



@Service

public class BuildingServiceImpl implements BuildingService  {
	@Autowired
    private BuildingRepository buildingRepository;
	@Override
	public List<BuildingBTO> findAll(String name, Long district_id) {
		List<BuildingEntity> buildingEntities =buildingRepository.findAll(name, district_id);
		List<BuildingBTO> result =new ArrayList<>();
		for(BuildingEntity item:buildingEntities) {
			BuildingBTO building =new BuildingBTO();
			building.setName(item.getBuilding_name());
			building.setNumberOfBasement(item.getBuilding_numberofBasement());
			building.setStreet(item.getBuilding_street());
			building.setWard(item.getBuilding_ward());
			result.add(building);
		}
		return result;
		
	}

}
