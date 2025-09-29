// You are given the head of a linked list, and an integer k.

// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).


--------------------------------------------------


  LeetCode Logo
Problem List
Debugging...
Debugging...









4
4Streaks
Practice Time!
DCC Badge

avatar
Avatar
Siddardha
Access all features with our Premium subscription!
myLists
My Lists
notebook
Notebook
progress
Progress
points
Points
Try New Features
Orders
My Playgrounds
Settings
Appearance
Sign Out
Premium
Description
Editorial
Editorial
Solutions
Solutions
Submissions
Submissions
Test Result
Test Result
Accepted
Accepted
Code
Testcase
Testcase
Code Sample
Code Sample


1721. Swapping Nodes in a Linked List
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
 

Seen this question in a real interview before?
1/5
Yes
No
Accepted
424,656/617.3K
Acceptance Rate
68.8%
Topics
icon
Companies
Hint 1
Hint 2
Hint 3
Similar Questions
Discussion (112)
Type comment here...

Choose a type
Comment
💡 Discussion Rules
1. Please don't post any solutions in this discussion.

2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.

3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.


Sort by:Best

Madhav Sarpal
Annual Badge 2024
May 16, 2023
The Hints are the worst: Making Array for a linked list question 😒

 
168
Reply

Armando Toledo
Algorithm I
Apr 04, 2022
I focused my solution on swapping nodes instead of swapping values which is considerably more difficult as there are multiple edge cases to consider. I see lots of short solutions where only the value is swapped. I feel like this problem description deserves more clarification as to what is expected.

 
142
Show 15 Replies
Reply

J R
Mar LeetCoding Challenge
May 15, 2023
Title is not consistent with the description.

Title says "Swapping Nodes" and the description says "swapping the values."

 
Feedback
91
Show 1 Replies
Reply

AQ1
May LeetCoding Challenge
May 15, 2023
spent 20 minutes to swap the nodes until i realized i just need to swap the values...

 
50
Show 5 Replies
Reply

ankita_111
50 Days Badge 2023
May 15, 2023
Feel like an idiot on solving it with swapping pointers :|

 
31
Show 1 Replies
Reply

jgrandydev
50 Days Badge 2024
Apr 07, 2024
In Leet Code Crash Course Data Structures and Algorithms it specifically advises that linked-list problems should never be solved via array conversion. It says that interviewers are not looking for these type of solutions.

And yet here in this problem the hints advise conversion to an array.

Totally inconsistent.

 
24
Reply

Sian Xiao
Introduction to Pandas
Jul 06, 2023
Swapping values is much easier than swapping nodes.

 
20
Reply

LeetCode
Apr 04, 2022
This problem is the Daily LeetCoding Challenge for April, Day 4.

Feel free to share anything related to this problem here!

You can ask questions, discuss what you've learned from this problem, or show off how many days of streak you've made!

If you'd like to share a detailed solution to the problem, please create a new post in the discuss section and provide

Detailed Explanations: Describe the algorithm you used to solve this problem. Include any insights you used to solve this problem.
Images that help explain the algorithm.
Language and Code you used to pass the problem.
Time and Space complexity analysis.
📌 Do you want to learn the problem thoroughly?
Read ⭐ LeetCode Official Solution⭐ to learn the 3 approaches to the problem with detailed explanations to the algorithms, codes, and complexity analysis.

Spoiler Alert! We'll explain these 3 approaches in the official solution
If you're new to Daily LeetCoding Challenge, check out this post!





 
Read more
10
Reply

Dhruv Dabhi
Sep LeetCoding Challenge
Apr 04, 2022
image
Let me know if i have something wrong in understanding the problem.

 
Read more
19
Show 3 Replies
Reply

wangfred
50 Days Badge 2023
Apr 11, 2023
I am confused, is it swapping the nodes or just value? it would be an easy one if it swaps value. Why medium?

 
8
Show 3 Replies
Reply
Copyright © 2025 LeetCode. All rights reserved.

5.6K


112


15 Online
Java
Auto





14151617181920212223242526272813111289105671234
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head.next == null) {
            return head;
        }
        
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len += 1;

Saved
Search questions


