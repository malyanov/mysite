package com.quazar.cache;

import java.util.HashMap;
import java.util.Map;

import net.sf.jsr107cache.Cache;
import net.sf.jsr107cache.CacheException;
import net.sf.jsr107cache.CacheManager;

import com.google.appengine.api.memcache.jsr107cache.GCacheFactory;

public class MemCache {
	private Cache cache;
	public MemCache() {
		Map props = new HashMap();
        props.put(GCacheFactory.EXPIRATION_DELTA, 24*3600);
		try {
			cache = CacheManager.getInstance().getCacheFactory()
					.createCache(props);
		} catch (CacheException e) {			
		}		
	}
	public Object getValue(Object key){
		return cache.get(key);
	}
	public void addValue(Object key, Object value){
		cache.put(key, value);
	}
	public void remove(Object key){
		cache.remove(key);
	}
}
