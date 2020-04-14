package services;

import models.Item;

import javax.inject.Singleton;

@Singleton
public class ItemService {

    public Item getItem(Long id){
        return new Item(1L, "Cinthol", 20);
    }
}
