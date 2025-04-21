package repository;

import java.util.ArrayList;
import java.util.List;

import repository.entity.BuildingEntity;

public interface BuildingRepository {
List<BuildingEntity> findAll(String name, Long district_id);
}
