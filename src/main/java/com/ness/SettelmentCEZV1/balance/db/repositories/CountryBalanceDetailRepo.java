package com.ness.SettelmentCEZV1.balance.db.repositories;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryBalanceDetailRepo extends CrudRepository<CountryBalanceDetail,Long> {
}
