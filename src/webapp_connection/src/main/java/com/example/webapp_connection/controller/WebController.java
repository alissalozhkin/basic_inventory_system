package com.example.webapp_connection.controller;

import controllers.ListManager;
import controllers.LoginController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servletx.ModelAndView;

@RestController
public class WebController {
    //String currentUser;
    ListManager listManager;

    public WebController() {
    //    currentUser = LogInSystem.logInSys(); // this call initiates the login system
    //    listManager = new ListManager(LoadingManager.InventoryListLoader(currentUser), LoadingManager.ShoppingListLoader(currentUser));
    //    currentUser = "";
        listManager = null;
    //    listManager = new ListManager(LoadingManager.InventoryListLoader(), LoadingManager.ShoppingListLoader()); //make this ha
    }

    @PostMapping("/add_inventory")
    public String addItemToInventoryList(@RequestParam String name, @RequestParam int quantity, @RequestParam String expiryDate) {
        listManager.addInventoryItem(name, quantity, expiryDate);
        return "Successfully added the item to your inventory list.";
    }

    @PostMapping("/remove_inventory")
    public String RemoveItemFromInventoryList(@RequestParam int index) {
        listManager.removeInventoryItem(index);
        return "Successfully removed the item from your inventory list.";
    }

    @GetMapping("/list_inventory")
    public String getInventoryListItems() {
        return listManager.printInventory();
    }
}