public class FlowerNotFoundException extends Exception {
    private String flowerName;
    public FlowerNotFoundException (String flowerName) {
        this.flowerName = flowerName;
    }

    public String errorMessage () {
        return "You have picked up a non-existing flower: '" + flowerName + "'";
    }
}
