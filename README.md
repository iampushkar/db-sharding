## DB Sharding Prototype
The prototype simulates two database shards and routes queries to the appropriate shard based on a user ID.

Example output when running the `Main` class:
```
Prototyping DB Sharding
Heartbeat check for userId: 0 on DB Shard 1
Heartbeat check for userId: 1 on DB Shard 2
Heartbeat check for userId: 2 on DB Shard 1
Heartbeat check for userId: 3 on DB Shard 2
Heartbeat check for userId: 4 on DB Shard 1
Heartbeat check for userId: 5 on DB Shard 2
Heartbeat check for userId: 6 on DB Shard 1
Heartbeat check for userId: 7 on DB Shard 2
Heartbeat check for userId: 8 on DB Shard 1
Heartbeat check for userId: 9 on DB Shard 2
```

## Basic Sharding Logic
- **Shard Selection**: The user ID is used to determine the shard. If the `userId` is odd, the query goes to shard 0. If the `userId` is even, the query goes to shard 1.
  - `userId = 1` -> Shard 0
  - `userId = 2` -> Shard 1
  - `userId = 3` -> Shard 0

## How to Extend
You can extend this simple prototype by:
- Connecting to actual databases instead of simulating the shards.
- Implementing more complex sharding strategies (e.g., hash-based, range-based).
- Adding failure handling and retries for when shards are unavailable.

## Requirements
- Java 17


