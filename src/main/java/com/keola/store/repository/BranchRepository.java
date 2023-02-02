package com.keola.store.repository;

import com.keola.store.domain.Branch;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BranchRepository extends ReactiveCrudRepository<Branch, Integer> {
}
