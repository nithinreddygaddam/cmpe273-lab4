package edu.sjsu.cmpe.cache.client;

public interface CacheServiceInterface
{
    public void get(long key);

    public void put(long key, String value);
    
    public boolean delete(long key);
}
