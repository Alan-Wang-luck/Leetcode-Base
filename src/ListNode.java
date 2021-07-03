//public class ListNode {
//    private ListNode next;
//    private boolean val;
//
//    public static void main(String[] args) {
//
//    }
//    public ListNode insertionSortList(ListNode head) {
//        if(head == null || head.next == null) return head;
//
//        ListNode newHead = new ListNode(0);
//        ListNode node = head;
//        while(node != null){
//            ListNode next = node.next;
//            //在排好序的链表中找到合适的位置, 插入
//            ListNode prevNode = newHead;
//            ListNode sortNode = newHead.next;
//            while(sortNode != null){
//                if(node.val > sortNode.val){
//                    prevNode = sortNode;
//                    sortNode = sortNode.next;
//                }else{
//                    break;
//                }
//            }
//            prevNode.next = node;
//            node.next = sortNode;
//
//            node = next;
//        }
//        return newHead.next;
//    }
//}
