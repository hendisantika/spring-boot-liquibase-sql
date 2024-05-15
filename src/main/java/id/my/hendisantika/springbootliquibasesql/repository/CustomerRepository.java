package id.my.hendisantika.springbootliquibasesql.repository;

import id.my.hendisantika.springbootliquibasesql.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-liquibase-sql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/15/24
 * Time: 09:02
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
