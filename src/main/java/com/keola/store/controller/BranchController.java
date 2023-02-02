package com.keola.store.controller;

import com.keola.store.domain.Branch;
import com.keola.store.service.BranchService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/branches")
public class BranchController {

    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping
    public Flux<Branch> findAll() {
        return branchService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Branch> findById(@PathVariable("id") Integer id) {
        return branchService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Branch> save(@RequestBody Branch branch) {
        return branchService.save(branch);
    }

    @PutMapping("/{id}")
    public Mono<Branch> update(@PathVariable("id") Integer id, @RequestBody Branch branch) {
        return branchService.update(id, branch);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable("id") Integer id) {
        return branchService.deleteById(id);
    }
}