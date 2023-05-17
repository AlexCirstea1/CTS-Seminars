package flyweight;

import java.util.HashMap;

public class Model3DFactory {

    static HashMap<String, Model3DInterface> models = new HashMap<>();

    static {
        models.put("meteor", new Model3D("meteor.3d","Meteor"));
        models.put("planet", new Model3D("planet.3d","planet"));
        models.put("spaceship", new Model3D("spaceship.3d","Spaceship"));
    }

    public static Model3DInterface getModel(String modelName) {
        return models.get(modelName.toLowerCase().trim());
    }
}
