public class Plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;

    public Plot(){
       // plantName = "sunflower";
        needsWater = true;
        numberOfPlant = (int)(Math.random() * 100) + 10;//random num 10 110
        int num = (int)(Math.random() * 5);//0-4
        if(num == 0){
            plantName = "sunflower";
        } else if (num == 1) {
            plantName = "corn";

        }

    }
}
