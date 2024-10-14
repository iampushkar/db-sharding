public class ShardRouter {

    public int getShardIndex(int userId) {
        return (userId % 2 == 0) ? 0 : 1;
    }
}
