package com.keola.store.repository;

import com.keola.store.domain.Stock;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StockRepository extends ReactiveCrudRepository<Stock, Long> {}
