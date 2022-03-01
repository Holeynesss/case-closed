##Add Two Numbers##
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.<br/>
[Original address](https://leetcode.com/problems/add-two-numbers/)<br/>

刚开始想得太简单了，以为就是普通的正序或者反序处理链表。根据最朴实的逻辑写完提交才发现需要处理的数据实在太长了，Long型根本不够。
于是暴力地将数字类型全部换成BigInteger，这里我的运算方式听起来很死板就是了。应该有专注于单个节点数字的处理方式吧。(2022/02/28)
