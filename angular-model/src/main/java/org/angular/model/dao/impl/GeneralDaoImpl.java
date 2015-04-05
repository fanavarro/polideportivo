package org.angular.model.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.angular.model.dao.api.GeneralDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public abstract class GeneralDaoImpl<C, K extends Serializable> implements
		GeneralDao<C, K> {

	@PersistenceContext
	protected EntityManager entityManager;
	
	private Class<C> type;

	private SimpleJpaRepository<C, K> simpleJpaRepository;

	@Override
	public List<C> findAll() {
		return simpleJpaRepository.findAll();
	}

	@Override
	public List<C> findAll(Sort sort) {
		return simpleJpaRepository.findAll(sort);
	}

	@Override
	public <S extends C> List<S> save(Iterable<S> entities) {
		return simpleJpaRepository.save(entities);
	}

	@Override
	public void flush() {
		simpleJpaRepository.flush();
	}

	@Override
	public C saveAndFlush(C entity) {
		return simpleJpaRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<C> entities) {
		simpleJpaRepository.deleteInBatch(entities);

	}

	@Override
	public void deleteAllInBatch() {
		simpleJpaRepository.deleteAllInBatch();
	}

	@Override
	public Page<C> findAll(Pageable pageable) {
		return simpleJpaRepository.findAll(pageable);
	}

	@Override
	public <S extends C> S save(S entity) {
		return simpleJpaRepository.save(entity);
	}

	@Override
	public C findOne(K id) {
		return simpleJpaRepository.findOne(id);
	}

	@Override
	public boolean exists(K id) {
		return simpleJpaRepository.exists(id);
	}

	@Override
	public Iterable<C> findAll(Iterable<K> ids) {
		return simpleJpaRepository.findAll(ids);
	}

	@Override
	public long count() {
		return simpleJpaRepository.count();
	}

	@Override
	public void delete(K id) {
		simpleJpaRepository.delete(id);

	}

	@Override
	public void delete(C entity) {
		simpleJpaRepository.delete(entity);

	}

	@Override
	public void delete(Iterable<? extends C> entities) {
		simpleJpaRepository.delete(entities);

	}

	@Override
	public void deleteAll() {
		simpleJpaRepository.deleteAll();
	}
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	protected void init(){
		Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class<C>) pt.getActualTypeArguments()[0];
        
		simpleJpaRepository = new SimpleJpaRepository<C, K>(this.type, this.entityManager);
	}
}
