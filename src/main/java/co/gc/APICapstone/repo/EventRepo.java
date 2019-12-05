package co.gc.APICapstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.APICapstone.entity.BucketList;


public interface EventRepo extends JpaRepository<BucketList, String>{
	
	
	

}
