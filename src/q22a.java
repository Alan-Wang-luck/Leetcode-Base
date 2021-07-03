import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class q22a {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(JSON.toJSONString(generateParenthesis(n)));

    }
    static class Node{
        private String  str;
        private int left;
        private int right;
        public Node(String str, int left, int right){
            this.str = str;
            this.left = left;
            this.right = right;
        }
    }
    public static List<String> generateParenthesis(int n){
        if(n <= 0){
            return null;
        }
        List<String> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Node node = new Node("(", 1, 0);
        queue.offer(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left == n && temp.right == n){
                result.add(temp.str);
                continue;
            }
            if (temp.left + 1 >= temp.right && temp.left + 1 <= n) {
                Node node1 = new Node(temp.str + "(", temp.left + 1, temp.right);
                queue.offer(node1);
            }
            if (temp.left >= temp.right + 1 && temp.right + 1 <= n) {
                Node node2 = new Node(temp.str + ")", temp.left, temp.right + 1);
                queue.offer(node2);
            }
        }
        return result;
    }
}













