package com.tesing.item.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesing.item.entity.Item;
import com.tesing.item.repository.ItemRepository;
import com.tesing.item.service.ItemsService;

@Service
public class ItemServiceImpl implements ItemsService{
	@Autowired
	private ItemRepository repository;
	public Item saveItems(Item item, int id, Boolean flag) {

	
		if(id != 0 && flag == false) {
			if(repository.existsById(id) == true) {
				Item exist = repository.findById(item.getId()).orElse(null);
				exist.setName(item.getName());
				exist.setPrice(item.getPrice());
				return repository.save(exist);
			}
			else {
				return repository.save(item);
			}
		}
		else {
			 repository.deleteById(id);
		}
		return null;
	}
}
