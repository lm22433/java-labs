package sheet4;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.ImmutableValueGraph;
import com.google.common.graph.ImmutableValueGraph.Builder;
import com.google.common.graph.ValueGraphBuilder;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("UnstableApiUsage")
public class Search {

	/**
	 * Lists all nodes values in a given graph.
	 *
	 * @param graph the graph to query the nodes from
	 * @return set of all the nodes in the given graph
	 */
	static Set<Integer> listAllNodes(ImmutableValueGraph<Integer, Integer> graph) {
		return graph.nodes();
	}

	/**
	 * Lists all edge values in a given graph.
	 *
	 * @param graph the graph to query the edges from
	 * @return list of all the edges in the given graph, the order is not important
	 */
	static List<Integer> listAllEdgeValues(ImmutableValueGraph<Integer, Integer> graph) {
		return graph.edges().stream()
				.map(graph::edgeValue)
				.filter(Optional::isPresent)
				.map(Optional::get)
				.collect(Collectors.toList());
	}

	/**
	 * Lists all nodes with 4 or more edges
	 *
	 * @param graph the graph to query the edges from
	 * @return set of all nodes that satisfy the condition
	 */
	static Set<Integer> findAllNodeWith4OrMoreEdges(
			ImmutableValueGraph<Integer, Integer> graph) {
		return graph.nodes().stream()
				.filter(node -> graph.degree(node) >= 4)
				.collect(Collectors.toSet());
	}

	/**
	 * Lists all nodes with edges values that when summed, is > 20
	 * For example, a node with three connected edges containing the value: 1, 2, 3 has an edge
	 * sum of 6.
	 *
	 * @param graph the graph to query the edges from
	 * @return set of all nodes that satisfy the condition
	 */
	static Set<Integer> findAllNodesWithEdgeSumGreaterThan20(
			ImmutableValueGraph<Integer, Integer> graph) {
		Set<Integer> output = new HashSet<>();
		graph.nodes().forEach(node -> {
			int sum = graph.incidentEdges(node).stream()
					.map(graph::edgeValue)
					.filter(Optional::isPresent)
					.mapToInt(Optional::get)
					.sum();
			if (sum > 20) output.add(node);
		});
		return output;
	}


	/**
	 * Finds the shortest possible path that travels from the source to destination, factoring the
	 * edge distances.
	 * A path that allows you to travel from the source to the destination with the minimum total
	 * edge distances is the shortest path.
	 *
	 * @param graph the graph to compute the shortest path with
	 * @param source the starting position of the search, the resulting list should start with
	 * this value
	 * @param destination the end position of the search, the resulting list should end with this
	 * value
	 * @return a list of nodes that represent the shortest path from source to destination where
	 * the first element is the source and the last element is the destination
	 */
	static List<Integer> shortestPathFromSourceToDestination(
			ImmutableValueGraph<Integer, Integer> graph,
			Integer source,
			Integer destination) {
		List<Integer> nodes = new ArrayList<>();
		List<Integer> distance = new ArrayList<>();
		List<Integer> previous = new ArrayList<>();

		nodes.add(source);
		distance.add(0);
		previous.add(0);

		for (int i = 0; i < graph.nodes().size(); i++) {
			int finalI = i;
			Set<EndpointPair<Integer>> incidentEdges = graph.incidentEdges(nodes.get(finalI));
			incidentEdges.forEach(edge -> {
				if (!nodes.contains(edge.nodeU())) {
					nodes.add(edge.nodeU());
					distance.add(distance.get(finalI) + graph.edgeValue(edge).get());
					previous.add(finalI);
				}
				else {
					int index = nodes.indexOf(edge.nodeU());
					if (distance.get(finalI) + graph.edgeValue(edge).get() < distance.get(index)) {
						distance.set(index,distance.get(finalI) + graph.edgeValue(edge).get());
						previous.set(index,finalI);
					}
				}
			});

		}

		List<Integer> output = new ArrayList<>();
		output.add(destination);
		int index = (nodes.indexOf(destination));

		while (previous.get(index) != index) {
			index = previous.get(index);
			output.add(nodes.get(index));
		}

		Collections.reverse(output);
		return output;
	}

	// reads in a graph stored in plan text, not part of any question but feel free to study at how
	// a graph is constructed
	static ImmutableValueGraph<Integer, Integer> readGraph(String content) {
		List<String> lines = content.lines().collect(Collectors.toList());
		if (lines.isEmpty()) throw new IllegalArgumentException("No lines");
		int currentLine = 0;

		String[] topLine = lines.get(currentLine++).split(" ");
		int numberOfNodes = Integer.parseInt(topLine[0]);
		int numberOfEdges = Integer.parseInt(topLine[1]);

		Builder<Integer, Integer> builder = ValueGraphBuilder
				.undirected()
				.expectedNodeCount(numberOfNodes)
				.immutable();


		for (int i = 0; i < numberOfNodes; i++) {
			String line = lines.get(currentLine++);
			if (line.isEmpty()) continue;
			builder.addNode(Integer.parseInt(line));
		}

		for (int i = 0; i < numberOfEdges; i++) {
			String line = lines.get(currentLine++);
			if (line.isEmpty()) continue;

			String[] s = line.split(" ");
			if (s.length != 3) throw new IllegalArgumentException("Bad edge line:" + line);
			builder.putEdgeValue(Integer.parseInt(s[0]),
					Integer.parseInt(s[1]),
					Integer.parseInt(s[2]));
		}
		return builder.build();
	}


}
