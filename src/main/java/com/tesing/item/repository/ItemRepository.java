package com.tesing.item.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tesing.item.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	Item findByName(String name);

	Item deleteById(Optional<Item> itm1);
	

	
}
