package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-21
 * Time: 14:07
 * Description: https://leetcode.com/problems/merge-two-sorted-lists/description/
 */




public class No21 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    /**
     * Submission Result: Accepted
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        ListNode idx1 = l1;
        ListNode idx2 = l2;

        while( idx1 != null && idx2 != null ){
            if( idx1.val > idx2.val ){
                result.next = new ListNode(idx2.val);
                idx2 = idx2.next;
            }else{
                result.next = new ListNode(idx1.val);
                idx1 = idx1.next;
            }
            result = result.next;
        }

        if( idx1 != null ){
            result.next = idx1;
        }
        if( idx2 != null ){
            result.next = idx2;
        }

        return head.next;
    }

    /**
     * 递归解法
     * Submission Result: Accepted
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        System.out.println(mergeTwoLists(l1, l2));

    }

}
