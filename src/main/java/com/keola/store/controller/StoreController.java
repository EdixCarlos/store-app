package com.keola.store.controller;

import com.keola.store.domain.Store;
import com.keola.store.dto.StoreDTO;
import com.keola.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public Flux<Store> getAllStores() {
        return storeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Store> getStoreById(@PathVariable("id") Long id) {
        return storeService.findById(id);
    }

    @PostMapping
    public Mono<Store> createStore(@RequestBody Store store) {
        return storeService.save(store);
    }

    @PutMapping("/{id}")
    public Mono<Store> updateStore(@PathVariable("id") Long id, @RequestBody Store store) {
        return storeService.update(id, store);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteStore(@PathVariable("id") Long id) {
        return storeService.deleteById(id);
    }
}
