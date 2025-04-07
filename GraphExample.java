import java.util.*;

public class GraphExample {
  public static void bfs(Map<Integer, List<Integer>> graph, int start) {
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    queue.offer(start);
    visited.add(start);

    while (!queue.isEmpty()) {
      int node = queue.poll();
      System.out.print(node + " ");
      for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
        if (!visited.contains(neighbor)) {
          queue.offer(neighbor);
          visited.add(neighbor);
        }
      }
    }
  }
}
