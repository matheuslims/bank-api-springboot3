package dev.api.bank.bank.api.repository;

import dev.api.bank.bank.api.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
