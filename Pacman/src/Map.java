import Points.Droweable;

public class Map implements Droweable {

    int width;
    int heigth;

    public Map(int width, int heigth){
        this.width =width;
        this.heigth = heigth;
    }
    @Override
    public void Draw() {
    }

    public boolean isWall(int x, int i) {
    }
}
