package com.ness.SettelmentCEZV1.balance.db.repositories;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryBalanceRepo extends CrudRepository<CountryBalance,Long> {
}
