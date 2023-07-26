package com.kren.pattern.composite.rev26072023.composite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

class MainJson {
    
    /*
        Run through json tree and remove price attribute
        See also https://www.baeldung.com/jackson-json-node-tree-model
        
        {
          "someAttr": {
            "someAttr": {
              "price": 2
            },
            "price": 2
          },
          "someAttrArray": [
            {
              "price": 2
            },
            {
              "price": 2
            },
            {
              "price": 2
            }
          ],
          "price": 1
       }
    */

    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        
        String json = "{\"someAttr\":{\"someAttr\":{\"price\":2},\"price\":2},\"someAttrArray\":[{\"price\":2},{\"price\":2},{\"price\":2}],\"price\":1}";

        JsonNode jsonNode = mapper.readTree(json);
        
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode));
    }

}
