class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> stack = new Stack<>();
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }
        Arrays.sort(cars, (x, y) -> Integer.compare(y.position, x.position));

        for (Car car : cars) {
            double arrivalTime = (target - car.position) / (double) car.speed;
            if (stack.isEmpty()) {
                stack.push(arrivalTime);
            } else if (arrivalTime > stack.peek()) {
                stack.push(arrivalTime);
            }
        }
        return stack.size();
    }

    private static class Car {
        public int position;
        public int speed;

        public Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }
}