package com.keola.store.service;

import com.keola.store.domain.Stock;
import com.keola.store.repository.StockRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Flux<Stock> findAll() {
        return stockRepository.findAll();
    }

    public Mono<Stock> findById(Long id) {
        return stockRepository.findById(id);
    }

    public Mono<Stock> save(Stock stock) {
        return stockRepository.save(stock);
    }

    public Mono<Void> deleteById(Long id) {
        return stockRepository.deleteById(id);
    }

    public Mono<Stock> update(Long id, Stock stock) {
        return stockRepository.findById(id)
                .flatMap(existingStock -> {
                    existingStock.setQuantity(stock.getQuantity());
                    return stockRepository.save(existingStock);
                });
    }
}