package com.keola.store.controller;

import com.keola.store.domain.Stock;
import com.keola.store.service.StockService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public Flux<Stock> findAll() {
        return stockService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Stock> findById(@PathVariable("id") Long id) {
        return stockService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Stock> save(@RequestBody Stock stock) {
        return stockService.save(stock);
    }

    @PutMapping("/{id}")
    public Mono<Stock> update(@PathVariable("id") Long id, @RequestBody Stock stock) {
        return stockService.update(id, stock);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable("id") Long id) {
        return stockService.deleteById(id);
    }
}