public class vechile {
    public int id;
    public String model_name;
    public char color;
    public int maxSpeed;
    protected int currentspeed;
    public Engine motor;
    public vechile(){
         motor = new Engine();
    }

    public void Move(){
        System.out.println("the vechile is moving");
    }

}
