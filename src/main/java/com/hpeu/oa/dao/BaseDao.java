package com.hpeu.oa.dao;

import com.hpeu.oa.exception.DaoException;

import java.util.List;

/**
 * 处理数据库业务
 * BaseDao <br>
 *
 */
public interface BaseDao<T> {

	/**
	 * 添加实体对象
	 * add <br>
	 * @param sql
	 * @param entity
	 */
	void add(T entity) throws DaoException;
	
	/**
	 * 更新实体对象
	 * update <br>
	 * @param sql
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 删除
	 * del <br>
	 * @param sql
	 * @param id
	 */
	void del(int id);
	
	/**
	 * 根据id查询单个
	 * getEntity <br>
	 * @param sql
	 * @param id
	 * @return
	 */
	T getEntity(String sql, int id);
	
	/**
	 * 查询所有
	 * getAll <br>
	 * @param sql
	 * @return
	 */
	List<T> getAll()throws DaoException;
	
}
