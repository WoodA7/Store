package com.spring.practice.services;

import com.spring.practice.model.Item;
import com.spring.practice.repository.ItemRepository;
import com.spring.practice.services.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemModel> findItemById(int idCategory) {
        List<Item> itemList = itemRepository.findItemsById(idCategory);

        return mapItem(itemList);

    }

    private List<ItemModel> mapItem(List<Item> itemList) {

        List<ItemModel> itemModelList = new ArrayList<>();

        for (Item item : itemList) {
            itemModelList.add(new ItemModel(
                    item.getId(),
                    item.getName(),
                    item.getPrice(),
                    item.getDiscount(),
                    calcNewPrice(item.getPrice(), item.getDiscount()),
                    item.getCategory(),
                    item.getItemDescription()));
        }

        return itemModelList;
    }

    private static double calcNewPrice(double oldPrice, double discount) {
        double newPrice;
        if (discount > 0) {
            newPrice = oldPrice - oldPrice / 100 * discount;
        } else {
            newPrice = oldPrice;
        }
        return newPrice;
    }
}
