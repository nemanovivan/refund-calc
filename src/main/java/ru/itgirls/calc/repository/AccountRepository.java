package ru.itgirls.calc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.itgirls.calc.model.entity.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {
   Optional<Account> findAccountByUserId(Long userId);
}
