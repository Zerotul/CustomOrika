/*
 * Orika - simpler, better and faster Java bean mapping
 *
 * Copyright (C) 2011-2013 Orika authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ma.glasnost.orika.test;

import org.junit.Assert;
import ma.glasnost.orika.MapperFacade;

import org.junit.Ignore;
import org.junit.Test;

public class TestCase {
    
    public static class S {
        public Name name;
        public String description;
    }
    
    public static class D {
        public Name name;
        public String description;
    }
    
    public static class Name {
        public String first;
        public String last;
    }
    
    
    @Test
    @Ignore
    public void test() {
        
        MapperFacade mapper = MappingUtil.getMapperFactory().getMapperFacade();
        
        S source = new S();
        D dest = new D();
        Name n = new Name();
        n.first = "John";
        n.last = "Doe";
        dest.name = n;
        dest.description = "Typical";
        
        mapper.map(source, dest);
        
        Assert.assertNotNull(dest.name);
        Assert.assertNotNull(dest.name.first);
        Assert.assertNotNull(dest.description);
        
    }
    
}
