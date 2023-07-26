package com.kren.pattern.composite.rev26072023.composite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Iterator;

class MainJson {
    
    /*
        Run through json tree and remove price attribute
        See also https://www.baeldung.com/jackson-json-node-tree-model
        
        {
          "someAttr": {
            "someAttr": {
              "price": 6
            },
            "price": 5
          },
          "someAttrArray": [
            {
              "price": 4
            },
            {
              "price": 3
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
        
        String json = "{\"someAttr\":{\"someAttr\":{\"price\":6},\"price\":5},\"someAttrArray\":[{\"price\":4},{\"price\":3},{\"price\":2}],\"price\":1}";

        JsonNode jsonNode = mapper.readTree(json);
        
        System.out.println(jsonNode.has("price"));
        System.out.println(jsonNode.get("price"));

        Iterator<JsonNode> it = jsonNode.elements();
        while (it.hasNext()) {
            JsonNode node = it.next();
            if (node.has("price")) System.out.println(node.get("price"));
        }

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode));
    }

}
