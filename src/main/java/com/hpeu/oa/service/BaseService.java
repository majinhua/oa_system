package com.hpeu.oa.service;

import com.hpeu.oa.exception.ServiceException;

import java.util.List;

public interface BaseService<T> {

	/**
	 * 添加实体对象
	 * add <br>
	 * 2018-04-24 09:16:16<br>
	 * @param
	 * @param entity
	 */
	void add(T entity)throws ServiceException; 
	
	/**
	 * 更新实体对象
	 * update <br>
	 * 2018-04-24 09:16:32<br>
	 * @param
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 删除
	 * del <br>
	 * 2018-04-24 09:16:49<br>
	 * @param
	 * @param id
	 */
	void del(int id);
	
	/**
	 * 根据id查询单个
	 * getEntity <br>
	 * 2018-04-24 09:16:58<br>
	 * @param sql
	 * @param id
	 * @return
	 */
	T getEntity(String sql, int id);
	
	/**
	 * 查询所有
	 * getAll <br>
	 * 2018-04-24 09:17:10<br>
	 * @param
	 * @return
	 */
	List<T> getAll()throws ServiceException;
}
