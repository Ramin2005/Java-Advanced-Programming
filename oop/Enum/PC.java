public class PC {

    private final String name;
    private Status st = Status.Off;

    public PC(String name) {
        this.name = name;
    }
    
    public void setOff(){
        this.st = Status.Off;
    }

    public void setOn(){
        this.st = Status.Normal;
    }

    public void setMax(){
        this.st = Status.Max;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return st;
    }

    public double Power(){
        return this.st.getPower();
    }
}
