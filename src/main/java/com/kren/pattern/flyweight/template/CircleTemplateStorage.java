package com.kren.pattern.flyweight.template;

import com.kren.pattern.flyweight.shape.ShapeColor;

import java.util.HashMap;
import java.util.Map;

public class CircleTemplateStorage {

    private final Map<String, CircleTemplate> templates;

    public CircleTemplateStorage() {
        templates = new HashMap<>();
    }

    public CircleTemplate getTemplate(int radius, ShapeColor color) {
        String templateId = createTemplateId(radius, color);

        if (templateExists(templateId)) {
            return templates.get(templateId);
        } else {
            CircleTemplate template = new CircleTemplate(radius, color);
            templates.put(templateId, template);
            return template;
        }
    }

    private boolean templateExists(String templateId) {
        return templates.containsKey(templateId);
    }

    private static String createTemplateId(int radius, ShapeColor color) {
        return radius + "/" + color;
    }
}
