public class HeartbeatController {
    private final ShardRouter shardRouter;
    private final ShardConfig shardConfig;

    public HeartbeatController(ShardRouter shardRouter, ShardConfig shardConfig) {
        this.shardRouter = shardRouter;
        this.shardConfig = shardConfig;
    }

    public void checkHeartbeat(int userId) {
        var shardIndex = shardRouter.getShardIndex(userId);
        var shardInstance = shardConfig.getShardInstance(shardIndex);

        System.out.println("Heartbeat check for userId: " + userId + " on DB Shard: " + shardInstance);
    }

}
