using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment8
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList arrayList = new ArrayList();
            MyGenericArrayList<string, int> myGenericArrayList = new MyGenericArrayList<string, int>();
            myGenericArrayList.key = "abc";
            myGenericArrayList.value = 10;
            MyGenericArrayList<string, int> myGenericArrayList2 = new MyGenericArrayList<string, int>();
            myGenericArrayList2.key = "cbc";
            myGenericArrayList2.value = 5;

            arrayList.Add(myGenericArrayList);
            arrayList.Add(myGenericArrayList2);

            foreach(MyGenericArrayList<string,int> myGeneric in arrayList)
            {
                Console.WriteLine(myGeneric.key);
                Console.WriteLine(myGeneric.value);
            }

            Console.ReadKey();
        }
    }

    public class MyGenericArrayList<K,V>
    {
        public K key;
        public V value;
    }
}
