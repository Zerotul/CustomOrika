package ma.glasnost.orika;

import ma.glasnost.orika.metadata.Type;

/**
 * Created by zerotul.
 */
public interface ClassMapFilter<T, D> {
    boolean shouldMap(T source, D destination, Object sourcePropertyValue, String sourcePropertyName,  Object destinationPropertyValue, String destPropertyName,  MappingContext context);

    boolean filtersSource();

    boolean filtersDestination();

}
