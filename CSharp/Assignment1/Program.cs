using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    class Program
    {
        static void Main(string[] args)
        {
            int flag = 0;
            do
            {
                Console.WriteLine("1. Prime number");
                Console.WriteLine("2. Fibonacci sum");
                Console.WriteLine("3. Exit");
                Console.WriteLine("Please choose a value");
                int choice = Convert.ToInt32(Console.ReadLine());
                if (choice < 4)
                {
                    switch (choice)
                    {
                        case 1:
                            Console.WriteLine("Input value to print all prime number less than this one: ");
                            int input = Convert.ToInt32(Console.ReadLine());
                            printPrimeNumber(input);
                            break;
                        case 2:
                            Console.WriteLine("Input value to sum all n Fibonacci: ");
                            int n = Convert.ToInt32(Console.ReadLine());
                            int[] fibonacciList = findFibonaccin(n);
                            totalFibonacci(fibonacciList);
                            break;
                        case 3:
                            Console.WriteLine("Exit the program");
                            flag = 1;
                            break;
                    }
                }
                else
                {
                    Console.WriteLine("Please choose from 1 to 3");
                    Console.WriteLine();
                }

            }
            while (flag == 0);
            Console.ReadKey();
        }

        static void printPrimeNumber(int input)
        {
            ArrayList arrayList = new ArrayList();

            for (int i = 1; i <= input; i++)
            {
                if (checkPrimeNumber(i) == true)
                {
                    arrayList.Add(i);
                }
            }
            Console.WriteLine("Prime numbers: ");
            foreach (int i in arrayList)
            {

                Console.Write(i);
                Console.Write(" ");
            }
            Console.WriteLine("\n");
        }

        static Boolean checkPrimeNumber(int number)
        {
            int count = 0;
            Boolean result = true;
            for (int i = 2; i <= Math.Sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    count++;
                }
            }
            if (count > 0 || number < 2)
            {
                result = false;
            }
            return result;
        }

        static int[] findFibonaccin(int n)
        {
            int[] fibonacciList = new int[100];
            fibonacciList[0] = 1;
            fibonacciList[1] = 1;
            for (int i = 2; i < n; i++)
            {
                fibonacciList[i] = fibonacciList[i - 1] + fibonacciList[i - 2];
            }
            return fibonacciList;
        }

        static void totalFibonacci(int[] fibonacciList)
        {
            int total = 0;
            Console.WriteLine("Fibonacci List: ");
            for (int i = 0; i < fibonacciList.Count(); i++)
            {
                if (fibonacciList[i] > 0)
                {
                    Console.Write(fibonacciList[i]);
                    Console.Write(" ");
                    total += fibonacciList[i];
                }

            }
            Console.WriteLine();
            Console.WriteLine("Total: ");
            Console.WriteLine(total);
            Console.WriteLine();
        }
    }
}
