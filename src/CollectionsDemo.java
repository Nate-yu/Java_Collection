import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Nate yu
 * @date 2020/2/26 - 19:59
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(-1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(-5);
		arrayList.add(7);
		arrayList.add(4);
		arrayList.add(-9);
		arrayList.add(-7);
		System.out.println("原始数组为："+arrayList);
		System.out.println("-------Collections工具类的排序操作-------");

		// 反转
		Collections.reverse(arrayList);
		System.out.println("反转后的数组为："+arrayList);


		// void rotate(List list, int distance)
		// 旋转。当distance为正数时，将list的后distance个元素整体移到前面。
		// 当distance为负数时，将list的前distance个元素整体移到后面。
		Collections.rotate(arrayList,-2);
		System.out.println("旋转后的数组为："+arrayList);

		// 按自然排序的升序排序
		Collections.sort(arrayList);
		System.out.println("排序后的数组为："+arrayList);

		// 随机排序
		Collections.shuffle(arrayList);
		System.out.println("随机排序后的数组为："+arrayList); // 乱序

		// 交换索引值的位置
		Collections.swap(arrayList,2,5);
		System.out.println("交换2和5索引处的值后的数组为："+arrayList);

		// 定制排序
		Collections.sort(arrayList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("定制排序后的数组为："+arrayList);

		System.out.println("-------Collections工具类的查找与替换操作-------");
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(-1);
		arrayList1.add(3);
		arrayList1.add(3);
		arrayList1.add(-5);
		arrayList1.add(7);
		arrayList1.add(4);
		arrayList1.add(-9);
		arrayList1.add(-7);
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(-3);
		arrayList2.add(-5);
		arrayList2.add(7);
		System.out.println("原始数组为:"+arrayList1);

		// 新元素替换所有的旧元素
		Collections.replaceAll(arrayList1,3,-3); // 用-3替换所有的3
		System.out.println("将所有的3替换为-3后的数组为："+arrayList1);

		// 统计元素出现的次数
		System.out.println("元素-3在数组中出现的次数为："+Collections.frequency(arrayList1,-3)+"次");

		// int indexOfSubList(List list, List target)
		// 统计target在list中第一次出现的索引，找不到则返回-1,相当于查找子数组
		System.out.println("另一个数组为："+arrayList2);
		System.out.println("在arrayList1中查找arrayList2第一次出现的索引为："+Collections.indexOfSubList(arrayList1,arrayList2));

		// 二分查找
		Collections.sort(arrayList1);
		System.out.println("排序后的数组为："+arrayList1);
		System.out.println("在arrayList1中用二分查找元素7返回的索引为："+Collections.binarySearch(arrayList1,7));
	}
}