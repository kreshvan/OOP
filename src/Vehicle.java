public abstract class Vehicle implements CarAndTrack {
    public String modelName;
    public int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {//конструктор
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("проверяем двигатель");
    }

    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.modelName);
            for (int i = 0; i < vehicle.wheelsCount; i++) {
                vehicle.updateTyre();
            }
        }

     }

}
