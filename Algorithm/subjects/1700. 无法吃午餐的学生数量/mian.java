class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> studentQueue = new LinkedList<>();
        Deque<Integer> sandwichesStack = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            studentQueue.offer(students[i]);
        }
        for (int i = 0; i < sandwiches.length; i++) {
            sandwichesStack.offer(sandwiches[i]);
        }
        //用来记录有多少的学生不喜欢当前的sandwich 如果匹配上了就重置为0 ，如果一直没匹配上就+1，如果这个大小等于sandwich栈的长度就当做下面结束循环的条件之一
        int disLikeNum = 0;

        while (!studentQueue.isEmpty() && !sandwichesStack.isEmpty()) {
            if (disLikeNum == sandwichesStack.size()) {
                break;
            }
            Integer student = studentQueue.poll();
            //当前栈顶的sandwich
            Integer sandwiche = sandwichesStack.peek();
            if (student == sandwiche) {
                sandwichesStack.pop();
                disLikeNum = 0;
            } else {
                disLikeNum++;
                studentQueue.offer(student);
            }
        }
        return studentQueue.isEmpty() ? 0 : sandwichesStack.size();
    }
}