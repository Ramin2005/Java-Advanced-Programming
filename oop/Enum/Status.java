public enum Status {
    
    Off("Off", 0, 0),
    Normal("Normal", 100, 1),
    Max("Max", 1000, 1000);

    private final String st;
    private final double power;
    private final double performance;

    Status(String st, double power, double pr){
        this.st = st;
        this.power = power;
        this.performance = pr;
    }

    public String getSt() {
        return st;
    }

    public double getPower() {
        return power;
    }

    public double getPerformance() {
        return performance;
    }
}
