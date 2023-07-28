package com.kren.pattern.composite.rev26072023.composite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class MainJson {
    
    /*
        Run through json tree and show all price attributes
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

        // new ObjectNode(jsonNode).showPrice();

        // new PriceNode(jsonNode).showPrice();

        new ObjectNode2(jsonNode).showPrice();
    }

    static interface PriceCrawler {

        void showPrice();
    }

    static class ObjectNode implements PriceCrawler {

        private List<ObjectNode> nodes;
        private Integer price;

        public ObjectNode(JsonNode json) {
            nodes = new ArrayList<>();
            if (json.has("price")) {
                price = json.get("price").asInt();
            }
            Iterator<JsonNode> it = json.elements();
            while (it.hasNext()) {
                nodes.add(new ObjectNode(it.next()));
            }
        }

        @Override
        public void showPrice() {
            if (Objects.nonNull(price)) System.out.println("Price: " + price);
            nodes.stream().forEach(ObjectNode::showPrice);
        }
    }

    // -------------

    static interface JsonLogger {

        void showPrice();
    }

    static class PriceProperty implements JsonLogger {
        
        private final JsonNode node;

        public PriceProperty(JsonNode node) {
            this.node = node;
        }
        
        @Override
        public void showPrice() {
            if (node.has("price")) {
                System.out.println("Price: " + node.get("price"));
            }
        }

    }
    
    static class PriceNode extends PriceProperty {
        
        private List<PriceNode> nodes;

        public PriceNode(JsonNode node) {
            super(node);
            nodes = new ArrayList<>();
            Iterator<JsonNode> it = node.elements();
            while (it.hasNext()) {
                nodes.add(new PriceNode(it.next()));
            }
        }

        @Override
        public void showPrice() {
            super.showPrice();
            nodes.stream().forEach(PriceNode::showPrice);
        }

    }


    static class ObjectNode2 {

        private JsonNode json;

        public ObjectNode2(JsonNode json) {
            this.json = json;
        }

        public void showPrice() {
            if (json.has("price")) {
                System.out.println("Price: " + json.get("price"));
            }
            Iterator<JsonNode> it = json.elements();
            while (it.hasNext()) {
                new ObjectNode2(it.next()).showPrice();
            }
        }
    }

}
