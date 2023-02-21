package sheet4;

import com.google.common.graph.ImmutableValueGraph;
import com.google.common.io.Resources;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("UnstableApiUsage")
public class SearchTest {

	private ImmutableValueGraph<Integer, Integer> graph;

	@Before public void createGraph() throws IOException {
		graph = Search.readGraph(
				Resources.toString(Resources.getResource("map.txt"),
						StandardCharsets.UTF_8));
	}

	@Test public void testListAllNodes() {
		assertThat(Search.listAllNodes(graph)).containsExactlyInAnyOrder(
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
				29, 30, 31, 32, 33, 34);
	}

	@Test public void testListAllEdgesValues() {
		assertThat(Search.listAllEdgeValues(graph)).containsExactlyInAnyOrder(
				10, 8, 5, 2, 6, 4, 13, 4, 9, 5, 4, 4, 5, 6, 7,
				4, 4, 3, 1, 8, 2, 4, 9, 10, 8, 9, 3, 15, 4, 5,
				7, 3, 11, 2, 1, 5, 4, 8, 2, 2, 3, 5, 4, 5, 3);
	}

	@Test public void testFindAllNodeWith4OrMoreEdges() {
		assertThat(Search.findAllNodeWith4OrMoreEdges(graph))
				.containsExactlyInAnyOrder(6, 16, 17);
	}

	@Test public void testFindAllNodesWithEdgeSumGreaterThan20() {
		assertThat(Search.findAllNodesWithEdgeSumGreaterThan20(graph))
				.containsExactlyInAnyOrder(4, 6, 15, 16, 17);
	}

	@Test public void testShortestPath() {
		// order is important here
		assertThat(Search.shortestPathFromSourceToDestination(graph, 1, 34))
				.containsExactly(1, 2, 6, 7, 8, 12, 14, 18, 21, 34);
	}

}