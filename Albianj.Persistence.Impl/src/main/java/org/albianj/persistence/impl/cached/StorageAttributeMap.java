package org.albianj.persistence.impl.cached;

import org.albianj.localmap.ILocalMap;
import org.albianj.localmap.LocalHashMap;

public class StorageAttributeMap
{
	private static ILocalMap cached = new LocalHashMap();

	public synchronized static boolean exist(String key)
			throws IllegalArgumentException
	{
		return cached.exist(key);
	}

	// no synchronized
	public static Object get(String key) throws IllegalArgumentException
	{
		return cached.get(key);
	}

	public synchronized static void insert(String key, Object value)
			throws IllegalArgumentException
	{
		cached.insert(key, value);
	}

	public synchronized static void remove(String key)
			throws IllegalArgumentException
	{
		cached.remove(key);
	}

	public synchronized static void clear()
	{
		cached.clear();
	}

//	public synchronized static boolean hasNext()
//	{
//		
//	}
}
