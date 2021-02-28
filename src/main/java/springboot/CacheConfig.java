package springboot;


import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.cache.CacheManager;

public class CacheConfig {
    //TODO CAHECONFIG
    CacheManager cacheManager;


    public CacheConfig(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }
}
