import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Nate yu
 * @date 2020/2/19 - 19:20
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // 创建存放int类型的linkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        /*LinkedList基本操作*/
        linkedList.addFirst(0); // 添加元素到列表开头
        linkedList.add(1); // 添加元素到列表结尾
        linkedList.add(2,2); // 在指定位置添加元素
        linkedList.addLast(3); // 添加元素到列表结尾

        System.out.println("LinkedList(直接输出的)："+linkedList);

        System.out.println("获得第一个元素："+linkedList.getFirst()); // 返回列表的第一个元素
        System.out.println("获得最后一个元素："+linkedList.getLast()); // 返回列表的最后一个元素
        System.out.println("删除第一个元素并返回："+linkedList.removeFirst()); // 移除并返回此列表的第一个元素
        System.out.println("删除第一个元素并返回："+linkedList.removeLast()); // 移除并返回此列表的最后一个元素
        System.out.println("删除之后的列表："+linkedList);
        System.out.println("判断列表是否有1这个元素："+linkedList.contains(1));
        System.out.println("linkedList的大小："+linkedList.size());

        /*位置访问操作*/
        System.out.println("-----------------------------------------");
        linkedList.set(1,3); // 将此列表种指定位置的元素替换为指定的元素
        System.out.println("set(1, 3)之后:" + linkedList);
        System.out.println("获得指定位置的元素（这里为1）："+linkedList.get(1)); // 返回此列表中指定位置处的元素

        /*Search操作*/
        System.out.println("-----------------------------------------");
        linkedList.add(3);
        System.out.println("添加了3后的linkedList为："+linkedList);
        System.out.println("indexOf(3)返回此列表中首次出现的索引："+linkedList.indexOf(3)); // 返回此列表中首次出现的指定元素的索引
        System.out.println("lastIndexOf(3)返回此列表中最后出现的索引："+linkedList.lastIndexOf(3)); // 返回此列表中最后出现的指定元素的索引

        /*Queue操作*/
        System.out.println("-----------------------------------------");
        System.out.println("peek()操作返回："+linkedList.peek()); // 获取但不移除此列表的头
        System.out.println("element()操作返回："+linkedList.element()); // 获取但不移除此列表的头
        linkedList.poll(); // 获取并移除此列表的头
        System.out.println("poll()操作后："+linkedList);
        linkedList.remove();
        System.out.println("remove()操作后：" + linkedList); // 获取并移除此列表的头
        linkedList.offer(4);
        System.out.println("offer(4)后：" + linkedList); // 将指定元素添加到此列表的末尾

        /*Deque操作*/
        System.out.println("-----------------------------------------");
        linkedList.offerFirst(2); // 在此列表的开头插入指定的元素
        System.out.println("offerFirst(2)后：" + linkedList);
        linkedList.offerLast(5); // 在此列表末尾插入指定的元素
        System.out.println("offerLast(5)后：" + linkedList);
        System.out.println("peekFirst()操作返回: " + linkedList.peekFirst()); // 获取但不移除此列表的第一个元素
        System.out.println("peekLast()操作返回: " + linkedList.peekLast()); // 获取但不移除此列表的第一个元素
        linkedList.pollFirst(); // 获取并移除此列表的第一个元素
        System.out.println("pollFirst()后：" + linkedList);
        linkedList.pollLast(); // 获取并移除此列表的最后一个元素
        System.out.println("pollLast()后：" + linkedList);
        linkedList.push(2); // 将元素推入此列表所表示的堆栈（插入到列表的头）
        System.out.println("push(2)操作后：" + linkedList);
        linkedList.pop(); // 从此列表所表示的堆栈处弹出一个元素（获取并移除列表第一个元素）
        System.out.println("pop()操作后：" + linkedList);
        linkedList.add(3);
        System.out.println("添加一个3后的列表为："+linkedList);
        linkedList.removeFirstOccurrence(3); // 从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表）
        System.out.println("removeFirstOccurrence(3)后：" + linkedList);
        linkedList.removeLastOccurrence(3); // 从此列表中移除最后一次出现的指定元素（从尾部到头部遍历列表）
        System.out.println("removeFirstOccurrence(3)后：" + linkedList);

        /*遍历操作*/
        System.out.println("-----------------------------------------");
        linkedList.clear();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        // 迭代器遍历
        long start = System.currentTimeMillis(); // 记录遍历开始时间
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        long end = System.currentTimeMillis(); // 记录遍历结束时间
        System.out.println("迭代器遍历所需时间为："+(end - start) + "ms");

        // 顺序遍历（随机遍历）
        start = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("顺序遍历所需时间为："+(end - start)+"ms");

        // 另一种for循环遍历
        start = System.currentTimeMillis();
        for (Integer i : linkedList);
        end = System.currentTimeMillis();
        System.out.println("foreach循环遍历所需时间为："+(end - start)+"ms");

        // 通过pollFirst()或pollLast()来遍历
        LinkedList<Integer> temp1 = new LinkedList<>();
        temp1.addAll(linkedList);
        start = System.currentTimeMillis();
        while (temp1.size() != 0){
            temp1.pollFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("pollFirst()方法遍历所需时间为："+(end - start)+"ms");

        // 通过removeFirst()或removeLast()来遍历
        LinkedList<Integer> temp2 = new LinkedList<>();
        temp2.addAll(linkedList);
        start = System.currentTimeMillis();
        while (temp2.size() != 0){
            temp2.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("removeFirst()方法遍历所需时间为："+(end - start)+"ms");
    }
}