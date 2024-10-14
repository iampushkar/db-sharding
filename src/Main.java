public class Main {

    public static void main(String[] args) {
        System.out.println("Prototyping DB Sharding");

        ShardRouter shardRouter = new ShardRouter();
        HeartbeatController heartbeatController = new HeartbeatController(shardRouter, new ShardConfig());

        for (int userId = 0; userId < 10; userId++) {
            heartbeatController.checkHeartbeat(userId);
        }

    }
}