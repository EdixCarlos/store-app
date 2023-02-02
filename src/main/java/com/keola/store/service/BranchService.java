package com.keola.store.service;

import com.keola.store.domain.Branch;
import com.keola.store.repository.BranchRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BranchService {

    private final BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Flux<Branch> findAll() {
        return branchRepository.findAll();
    }

    public Mono<Branch> findById(Integer id) {
        return branchRepository.findById(id);
    }

    public Mono<Branch> save(Branch branch) {
        return branchRepository.save(branch);
    }

    public Mono<Void> deleteById(Integer id) {
        return branchRepository.deleteById(id);
    }

    public Mono<Branch> update(Integer id, Branch branch) {
        return branchRepository.findById(id)
                .flatMap(existingBranch -> {
                    existingBranch.setName(branch.getName());
                    existingBranch.setAddress(branch.getAddress());
                    existingBranch.setPhone(branch.getPhone());
                    return branchRepository.save(existingBranch);
                });
                    
    }


}