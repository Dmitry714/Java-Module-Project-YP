class Race {
    private int distance = 0;
    private String winner = "";

    public void setCurrentWinner(Car car) {
        int distance = 24 * car.speed;

        if (this.distance < distance) {
            this.winner = car.brand;
            this.distance = distance;
        }
    }

    public String getWinner(){
        return winner;
    }
}
