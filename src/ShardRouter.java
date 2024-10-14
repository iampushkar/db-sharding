public class ShardRouter {

    // Routing logic based on userId
    public int getShardIndex(int userId) {
        return (userId % 2 == 0) ? 0 : 1;
    }
}
