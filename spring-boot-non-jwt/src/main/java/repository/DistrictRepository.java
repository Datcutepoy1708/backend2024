package repository;

import repository.entity.DistrictEntity;

public interface DistrictRepository {
 DistrictEntity findNameBy(Long district_id);
}
