import java.util.HashMap;
import java.util.Map;

interface building {
  String getType();
}

class House implements building {
  public String getType() {
    return "house";
  }
}

class Edifice implements building {
  public String getType() {
    return "Edifice";
  }
}

class BuildingFactory {
  private static Map<String, building> instances;
  static {
    instances = new HashMap<>();
    instances.put("house", new House());
    instances.put("Edifice", new Edifice());
  }

  public static <T extends building> T getBuilder(String type) {
    return (T).instances.get(type);
  }
}

building building = BuildingFactory.getBuilding("house");
