package com.tesing.item.service;

import java.util.List;

import com.tesing.item.entity.Item;

public interface ItemsService {
//	public Item insert(Item item);
//	public Item getItem(int id);
//	List<Item> getItem();
//	void deleteID(int id);
	public Item saveItems(Item item, int id, Boolean flag);
}
