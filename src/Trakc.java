class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
  }
