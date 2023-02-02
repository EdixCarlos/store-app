package com.keola.store.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keola.store.domain.Store;
import com.keola.store.dto.StoreDTO;
import com.keola.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Flux<Store> findAll() {
        return storeRepository.findAll();
    }

    public Mono<Store> findById(Long id) {
        return storeRepository.findById(id);
    }

    public Mono<Store> save(Store store) {
        return storeRepository.save(store);

    }

    public Mono<Void> deleteById(Long id) {
        return storeRepository.deleteById(id);
    }


    public Mono<Store> update(Long id, Store store) {
        return storeRepository.findById(id)
                .flatMap(existingStore -> {
                    existingStore.setRubroId(store.getRubroId());
                    existingStore.setLg(store.getLg());
                    existingStore.setLt(store.getLt());
                    return storeRepository.save(existingStore);
                });
    }
}
