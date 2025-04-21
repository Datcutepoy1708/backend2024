package service;

import java.util.List;

import com.javaweb.model.BuildingBTO;

import repository.entity.BuildingEntity;

public interface BuildingService {
	List<BuildingBTO> findAll(String name , Long district_id);
}
