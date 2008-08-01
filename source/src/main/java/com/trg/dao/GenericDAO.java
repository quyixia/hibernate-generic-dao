package com.trg.dao;

import java.io.Serializable;
import java.util.List;

import com.trg.search.Search;
import com.trg.search.SearchResult;

public interface GenericDAO<T> {

	/**
	 * Add the specified object as a new entry in the database.
	 */
	public void create(T object);

	/**
	 * Delete the object of this type with the specified id from the database.
	 */
	public void deleteById(Serializable id);

	/**
	 * Delete the specified object from the database.
	 */
	public void deleteEntity(T object);

	/**
	 * Get the object of this type with the specified id from the database.
	 */
	public T fetch(Serializable id);

	/**
	 * Get a list of all the objects of this type.
	 */
	public List<T> fetchAll();

	/**
	 * Update the corresponding object in the database with the properties of
	 * the specified object. The corresponding object is determined by id.
	 */
	public void update(T object);

	/**
	 * Search for objects of this type given the search parameters in the
	 * specified <code>Search</code> object.
	 */
	public List<T> search(Search options);

	/**
	 * Returns the total number of results that would be returned using the
	 * given <code>Search</code> if there were no paging or maxResult limits.
	 */
	public int searchLength(Search options);

	/**
	 * Returns a <code>SearchResult</code> object that includes the list of
	 * results like <code>search()</code> and the total length like
	 * <code>searchLength</code>.
	 */
	public SearchResult<T> searchAndLength(Search options);

	/**
	 * Returns true if the object is connected to the current hibernate session.
	 */
	public boolean isConnected(Object object);

	/**
	 * Flushes changes in the hibernate cache to the database. 
	 */
	public void flush();
}