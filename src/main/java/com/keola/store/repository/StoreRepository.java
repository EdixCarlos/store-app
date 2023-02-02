package com.keola.store.repository;

import com.keola.store.domain.Store;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StoreRepository extends ReactiveCrudRepository<Store, Long>{}
