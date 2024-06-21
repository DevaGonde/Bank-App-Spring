package com.Deva.Bank_app.repository;

import com.Deva.Bank_app.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Long> {

}
