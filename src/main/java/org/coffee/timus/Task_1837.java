package org.coffee.timus;

import java.util.*;

public class Task_1837 {

    public static class Node {
        private String name;
        private Integer score;
        private final Set<Node> teamMates = new HashSet<>();

        public Node(String name, Integer score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public void addTeamMates(List<Node> teamMates) {
            for (Node teamMate: teamMates) {
                if (teamMate != this) {
                    this.teamMates.add(teamMate);
                }
            }
        }

        public Set<Node> getTeamMates() {
            return teamMates;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Map<String, Node> sortedCompetitors = new TreeMap<>();

        Node startNode = readInputAndBuildGraph(sortedCompetitors);
        if (startNode != null) {
            startNode.setScore(0);
            fillScores(startNode);
        }

        for (Map.Entry<String, Node> entry: sortedCompetitors.entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue().getScore() == Integer.MAX_VALUE ?
                    "undefined" :
                    String.valueOf(entry.getValue().getScore());
            System.out.println(name + " " + value);
        }

//        for (Map.Entry<String, Node> entry: sortedCompetitors.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue().getTeamMates());
//        }

    }

    public static Node readInputAndBuildGraph(Map<String, Node> sortedCompetitors) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            while (n > 0) {
                --n;

                String name1 = in.next();
                String name2 = in.next();
                String name3 = in.next();
                Node node1 = sortedCompetitors.getOrDefault(name1, new Node(name1, Integer.MAX_VALUE));
                Node node2 = sortedCompetitors.getOrDefault(name2, new Node(name2, Integer.MAX_VALUE));
                Node node3 = sortedCompetitors.getOrDefault(name3, new Node(name3, Integer.MAX_VALUE));

                List<Node> team = Arrays.asList(node1, node2, node3);

                node1.addTeamMates(team);
                node2.addTeamMates(team);
                node3.addTeamMates(team);

                sortedCompetitors.put(node1.getName(), node1);
                sortedCompetitors.put(node2.getName(), node2);
                sortedCompetitors.put(node3.getName(), node3);
            }

            return sortedCompetitors.get("Isenbaev");
        }
    }

    public static void fillScores(Node startNode) {
        for (Node friend: startNode.getTeamMates()) {
            int currentScore = startNode.getScore() + 1;
            if (friend.getScore() > currentScore) {
                friend.setScore(currentScore);
                fillScores(friend);
            }
        }
    }

}
