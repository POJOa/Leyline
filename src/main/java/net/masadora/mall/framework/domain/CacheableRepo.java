package net.masadora.mall.framework.domain;

import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.QueryHint;

/**
 * 给所有抽象Repo操作加上缓存hint
 */
public interface CacheableRepo<T extends AppDO> extends PagingAndSortingRepository<T, Long>, QueryDslPredicateExecutor<T> {
    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Iterable<T> findAll(Predicate predicate);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Iterable<T> findAll(Sort sort);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Page<T> findAll(Pageable pageable);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    T findOne(Predicate predicate);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    T findOne(Long id);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Iterable<T> findAll(Predicate predicate, Sort sort);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Iterable<T> findAll(Predicate predicate, OrderSpecifier... orders);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Iterable<T> findAll(OrderSpecifier... orders);

    @Override
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    Page<T> findAll(Predicate predicate, Pageable pageable);

    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    default T get(Predicate predicate){
        return findOne(predicate);
    }
    @QueryHints(value = { @QueryHint(name = "org.hibernate.cacheable", value = "true")})
    default T get(Long id){
        return findOne(id);
    }

}