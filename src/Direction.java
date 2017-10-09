public enum Direction {
    NORTH("Północ"),
    SOUTH("Południe"),
    WEST("Zachód"),
    EAST("Wschód");

    private  final String directionName;
    private Direction(String directionName){
        this.directionName=directionName;
    }

    public void getDirectionName(){
        System.out.println(this.directionName);
    }


}
