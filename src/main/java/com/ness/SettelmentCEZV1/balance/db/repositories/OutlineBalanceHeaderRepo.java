package com.ness.SettelmentCEZV1.balance.db.repositories;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutlineBalanceHeaderRepo extends CrudRepository<OutlineBalanceHeader, Long> {

    OutlineBalanceHeader findByIndexLetter (String indexLetter);

    void deleteAll();
}

