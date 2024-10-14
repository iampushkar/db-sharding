import java.util.HashMap;
import java.util.Map;

public class ShardConfig {
    private final Map<Integer, String> shardMap;

    public ShardConfig() {
        shardMap = new HashMap<>();
        // Initialize two "shards" (simulated as two separate DB instances)
        shardMap.put(0, "DB Shard 1"); // Simulate shard 1
        shardMap.put(1, "DB Shard 2"); // Simulate shard 2
    }

    public String getShardInstance(int shardIndex) {
        if (shardMap.containsKey(shardIndex)) {
            return shardMap.get(shardIndex);
        }
        throw new RuntimeException("Invalid Shard Index: " + shardIndex);
    }
}
