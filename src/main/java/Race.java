class Race {
    protected int distance = 0;
    protected String winner = "";

    public void setCurrentWinner(Car car) {
        int distance = 24 * car.speed;

        if (this.distance < distance) {
            this.winner = car.brand;
            this.distance = distance;
        }
    }
}
