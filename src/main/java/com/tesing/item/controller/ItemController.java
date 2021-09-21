package com.tesing.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tesing.item.entity.Item;
import com.tesing.item.service.ItemsService;

@RestController
public class ItemController {
	@Autowired
	
	private ItemsService service;
//	@PostMapping("/addItem")
//	public Item addItem(@RequestBody Item item) {
//		return service.saveItem(item);
//	}
//	
//	@PostMapping("/addItems")
//	public List<Item> addItems(@RequestBody List<Item> items){
//		return service.saveItems(items);
//	}
//	
//	@GetMapping("/Items")
//	public List<Item> findAllItems() {
//		return service.getItem();
//	}
//	
//	@GetMapping("/Items/{id}")
//	public Item findItemById(@PathVariable int id) {
//		return service.getItemById(id);
//	}
//	
//	@GetMapping("/Items/{name}")
//	public Item findItemByName(@PathVariable String name) {
//		return service.getByName(name);
//	}
//	
//	@PutMapping("/update")
//	public Item updateItem(@RequestBody Item item) {
//		return service.updateItem(item);
//	}
//	
//	@PutMapping("/updates")
//	public List<Item> updateItems(@RequestBody List<Item> items){
//		return service.updateItems(items);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String deleteItem(@PathVariable int id) {
//		return service.DeleteItem(id);
//	}
//	
//	@DeleteMapping("/deletes/items")
//	public String deleteItems(@RequestBody List<Item> items) {
//		 service.deleteItems(items);
//		 return "deleted successfully";
//	} 
	
//	@GetMapping("/item")
//	public ResponseEntity<List<Item>> getAllItems(@RequestParam(required = false) String name) {
//		try {
//			List<Item> item = new ArrayList<Item>();
//			if (name == null) {
//				repository.findAll().forEach(item::add);
//			}
//
//			if (item.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//
//			return new ResponseEntity<>(item, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	// Get User Data by id
//	@GetMapping("/item/{id}")
//	public ResponseEntity<Item> getItemById(@PathVariable int id) {
//		Optional<Item> itemData = repository.findById(id);
//		if (itemData.isPresent()) {
//			return new ResponseEntity<>(itemData.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	// Get User Data by Name
//	@GetMapping("/itemByName/{name}")
//	public ResponseEntity<Item> getItemByName(@PathVariable String name) {
//		Optional<Item> iByName = Optional.of(repository.findByName(name));
//		if(iByName.isPresent()) {
//			return new ResponseEntity<>(iByName.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	// Add Employee
//	@PostMapping("/item")
//	public ResponseEntity<Item> createItem(@RequestBody Item item) {
//		try {
//			return new ResponseEntity<>(repository.save(item), HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	// Add Multiple Employees
//	@PostMapping("/items")
//	public ResponseEntity<List<Item>> createItems(@RequestBody List<Item> item) {
//		try {
//			return new ResponseEntity<>(repository.saveAll(item), HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	// Update Employee Details
//	@PutMapping("/item/{id}")
//	public ResponseEntity<Item> updateItem(@PathVariable int id, @RequestBody Item item) {
//		Optional<Item> itemData = repository.findById(id);
//		if (itemData.isPresent()) {
//			Item itm = itemData.get();
//			itm.setName(item.getName());
//			itm.setPrice(item.getPrice());
//			
//			return new ResponseEntity<>(repository.save(itm), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	// Employee Delete using id
//	@DeleteMapping("/item/{id}")
//	public ResponseEntity<HttpStatus> deleteItem(@PathVariable int id) {
//		try {
//			repository.deleteById(id);
//			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	
	
	
	@RequestMapping("/items/{id}/{flag}")
    public ResponseEntity<Item> saveItems(@RequestBody Item item,@PathVariable int id,@PathVariable Boolean flag){
        if(id!=0) {
        
        return new ResponseEntity<>(service.saveItems(item, id, flag), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
           
    }


}
