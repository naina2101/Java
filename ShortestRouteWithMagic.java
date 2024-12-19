import java.util.*;

public class ShortestRouteWithMagic {
    static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int numCities = scanner.nextInt();
        int cityA = scanner.nextInt();
        int cityB = scanner.nextInt();
        int numMagic = scanner.nextInt();
        int numRoads = scanner.nextInt();
        //int roadProp = scanner.nextInt();

        
		scanner.close();

        // Create adjacency list representation of the graph
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < numCities; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < numRoads; i++) {
            int cityU = scanner.nextInt();
            int cityV = scanner.nextInt();
            int lenW = scanner.nextInt();
            graph.get(cityU).add(new Edge(cityV, lenW));
            graph.get(cityV).add(new Edge(cityU, lenW));
        }

        int shortestRoute = shortestRouteWithMagic(graph, cityA, cityB, numMagic);
        System.out.println(shortestRoute);
    }

    static int shortestRouteWithMagic(List<List<Edge>> graph, int start, int end, int numMagic) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, start, numMagic});
        boolean[] visited = new boolean[graph.size() * (numMagic + 1)];
        Arrays.fill(visited, false);

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int dist = curr[0];
            int city = curr[1];
            int magicLeft = curr[2];

            if (city == end) return dist;

            int index = city * (numMagic + 1) + magicLeft;

            if (visited[index]) continue;
            visited[index] = true;

            for (Edge neighbor : graph.get(city)) {
                int nextCity = neighbor.to;
                int nextDist = dist + neighbor.weight;

                if (magicLeft > 0) {
                    int nextIndex = nextCity * (numMagic + 1) + magicLeft - 1;
                    if (!visited[nextIndex]) {
                        pq.offer(new int[]{nextDist, nextCity, magicLeft - 1});
                    }
                }

                int nextIndex = nextCity * (numMagic + 1) + magicLeft;
                if (!visited[nextIndex]) {
                    pq.offer(new int[]{nextDist, nextCity, magicLeft});
                }
            }
        }

        return -1;
    }
}
