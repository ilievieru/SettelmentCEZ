package com.ness.SettelmentCEZV1.balance.db.repositories;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceHeader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryBalanceHeaderRepo extends CrudRepository<CountryBalanceHeader, Long> {
}
